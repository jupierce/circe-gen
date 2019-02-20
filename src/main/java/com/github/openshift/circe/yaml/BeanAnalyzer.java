package com.github.openshift.circe.yaml;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class BeanAnalyzer {
    private final Class<?> klass;
    private final Object bean;

    public BeanAnalyzer(Object bean) {
        this.bean = bean;
        this.klass = bean.getClass();
    }

    public interface BeanMethodHandler {
        void onMethod(Method m, String key, Object result);
    }

    private static boolean isValidMethodName(String name) {
        return !"getClass".equals(name) && !"getDeclaringClass".equals(name);
    }

    /**
     * Searches the class hierarchy to see if the method or it's super
     * implementations and interfaces has the annotation.
     *
     * @param <A>
     *            type of the annotation
     *
     * @param m
     *            method to check
     * @param annotationClass
     *            annotation to look for
     * @return the {@link Annotation} if the annotation exists on the current method
     *         or one of it's super class definitions
     */
    public static <A extends Annotation> A getAnnotation(final Method m, final Class<A> annotationClass) {
        // if we have invalid data the result is null
        if (m == null || annotationClass == null) {
            return null;
        }

        if (m.isAnnotationPresent(annotationClass)) {
            return m.getAnnotation(annotationClass);
        }

        // if we've already reached the Object class, return null;
        Class<?> c = m.getDeclaringClass();
        if (c.getSuperclass() == null) {
            return null;
        }

        // check directly implemented interfaces for the method being checked
        for (Class<?> i : c.getInterfaces()) {
            try {
                Method im = i.getMethod(m.getName(), m.getParameterTypes());
                return getAnnotation(im, annotationClass);
            } catch (final SecurityException ex) {
                continue;
            } catch (final NoSuchMethodException ex) {
                continue;
            }
        }

        try {
            return getAnnotation(
                    c.getSuperclass().getMethod(m.getName(), m.getParameterTypes()),
                    annotationClass);
        } catch (final SecurityException ex) {
            return null;
        } catch (final NoSuchMethodException ex) {
            return null;
        }
    }


    /**
     * Searches the class hierarchy to see if the method or it's super
     * implementations and interfaces has the annotation. Returns the depth of the
     * annotation in the hierarchy.
     *
     * @param m
     *            method to check
     * @param annotationClass
     *            annotation to look for
     * @return Depth of the annotation or -1 if the annotation is not on the method.
     */
    private static int getAnnotationDepth(final Method m, final Class<? extends Annotation> annotationClass) {
        // if we have invalid data the result is -1
        if (m == null || annotationClass == null) {
            return -1;
        }

        if (m.isAnnotationPresent(annotationClass)) {
            return 1;
        }

        // if we've already reached the Object class, return -1;
        Class<?> c = m.getDeclaringClass();
        if (c.getSuperclass() == null) {
            return -1;
        }

        // check directly implemented interfaces for the method being checked
        for (Class<?> i : c.getInterfaces()) {
            try {
                Method im = i.getMethod(m.getName(), m.getParameterTypes());
                int d = getAnnotationDepth(im, annotationClass);
                if (d > 0) {
                    // since the annotation was on the interface, add 1
                    return d + 1;
                }
            } catch (final SecurityException ex) {
                continue;
            } catch (final NoSuchMethodException ex) {
                continue;
            }
        }

        try {
            int d = getAnnotationDepth(
                    c.getSuperclass().getMethod(m.getName(), m.getParameterTypes()),
                    annotationClass);
            if (d > 0) {
                // since the annotation was on the superclass, add 1
                return d + 1;
            }
            return -1;
        } catch (final SecurityException ex) {
            return -1;
        } catch (final NoSuchMethodException ex) {
            return -1;
        }
    }


    private String getKeyNameFromMethod(Method method) {
        final int ignoreDepth = getAnnotationDepth(method, YamlPropertyIgnore.class);
        if (ignoreDepth > 0) {
            final int forcedNameDepth = getAnnotationDepth(method, YamlPropertyName.class);
            if (forcedNameDepth < 0 || ignoreDepth <= forcedNameDepth) {
                // the hierarchy asked to ignore, and the nearest name override
                // was higher or non-existent
                return null;
            }
        }
        YamlPropertyName annotation = getAnnotation(method, YamlPropertyName.class);
        if (annotation != null && annotation.value() != null && !annotation.value().isEmpty()) {
            return annotation.value();
        }
        String key;
        final String name = method.getName();
        if (name.startsWith("get") && name.length() > 3) {
            key = name.substring(3);
        } else if (name.startsWith("is") && name.length() > 2) {
            key = name.substring(2);
        } else {
            return null;
        }
        // if the first letter in the key is not uppercase, then skip.
        // This is to maintain backwards compatibility before PR406
        // (https://github.com/stleary/JSON-java/pull/406/)
        if (Character.isLowerCase(key.charAt(0))) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        boolean toggle = true;
        for ( int i = 0; i < key.length(); i++ ) {
            char c = key.charAt(i);
            if ( Character.isLowerCase( c ) ) {
                toggle = false;
            }
            if ( toggle && Character.isUpperCase(c) ) {
                boolean makeLowerCase = false;

                makeLowerCase |= (i == 0); // first char should always be lowercase

                // The following conversions are tricky..
                // TLSVerify -> tlsVerify
                // URLs -> urls

                if ( i < key.length() - 1 ) {
                    Character nextLetter = key.charAt(i+1);

                    // Is the next character at the end of the string and lowercase?  (e.g. "URLs")
                    if ( i + 2 == key.length() ) {
                        makeLowerCase = true;
                    }

                    // In TLSVerify, if we are looking at 'V', nextLetter is 'e'.
                    if ( Character.isUpperCase(nextLetter) ) {
                        makeLowerCase = true;
                    }

                }

                if ( makeLowerCase ) {
                    c = Character.toLowerCase(c);
                }

                sb.append(c);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }


    public void forEachMethod(BeanMethodHandler handler, boolean handleOnSkip) {
        // If klass is a System class then set includeSuperClass to false.
        boolean includeSuperClass = klass.getClassLoader() != null;

        Method[] methods = includeSuperClass ? klass.getMethods() : klass.getDeclaredMethods();

        /**
         * By default, bean methods are sorted lexicographically. However, methods can
         * be annotated with a order which will be used as the actual lex value
         * to compare.
         */
        Arrays.sort(methods, new Comparator<Method>() {

            private String getCompareValue(Method m) {
                String v = m.getName();
                RenderOrder orderOverride = getAnnotation(m, RenderOrder.class);
                if ( orderOverride != null ) {
                    v = orderOverride.value();
                }
                return v;
            }

            @Override
            public int compare(Method method, Method method2) {
                String v1 = getCompareValue(method);
                String v2 = getCompareValue(method2);
                return v1.compareTo(v2);
            }
        });

        for (final Method method : methods) {
            try {

                final int modifiers = method.getModifiers();
                if (Modifier.isPublic(modifiers)
                        && !Modifier.isStatic(modifiers)
                        && method.getParameterTypes().length == 0
                        && !method.isBridge()
                        && method.getReturnType() != Void.TYPE
                        && isValidMethodName(method.getName())) {
                    final String key = getKeyNameFromMethod(method);
                    if (key != null && !key.isEmpty()) {
                        method.setAccessible(true);
                        boolean encodeLiteralNull = (method.getDeclaredAnnotation(YamlLiteralNullValue.class) != null);

                        // Don't actually invoke method if literal null is declared in annotation
                        Object result = encodeLiteralNull ? null : method.invoke(bean);

                        if ( encodeLiteralNull == false && result == null ) {
                            // Void.TYPE will be passed to interested handler if a true skip was encountered.
                            result = Void.TYPE;
                        }

                        if ( result != Void.TYPE || handleOnSkip ) {
                            handler.onMethod(method, key, result);
                        }
                    }
                }

            } catch (IllegalAccessException ignore) {
                ignore.printStackTrace(System.err);
            } catch (IllegalArgumentException ignore) {
                ignore.printStackTrace(System.err);
            } catch (InvocationTargetException ignore) {
                ignore.printStackTrace(System.err);
            }
        }
    }

    /**
     * A map can be created by passing a Bean to this method.
     * Each getter in the object will be invoked and non-null values
     * will be added to the map. A getter like 'getValue' will be
     * added to the map with the lower camelcase 'value'.
     * @YamlPropertyName can be used to control the key name.
     * @RenderOrder can be used to control the order of the map.
     * @param bean The object to transform into a Map.
     * @return A map
     */
    public static Map<String,Object> beanToMap(Object bean) {
        Map<String, Object> actualMap = new LinkedHashMap<String, Object>();

        BeanAnalyzer analyzer = new BeanAnalyzer(bean);
        analyzer.forEachMethod(new BeanAnalyzer.BeanMethodHandler() {
            @Override
            public void onMethod(Method m, String key, Object result) {
                actualMap.put(key, result);
            }
        }, false);

        return actualMap;
    }

    /**
     * A list can be created by passing a Bean to this method. Each
     * getter in the object will be invoked and non-null values
     * will be added to this list.
     * The name of the methods in the bean will not be reflected in
     * the list.
     * @param bean The object to transform into a List
     * @return A list
     */
    public static List<Object> beanToList(Object bean) {
        List<Object> actualList = new ArrayList<Object>();

        BeanAnalyzer analyzer = new BeanAnalyzer(bean);
        analyzer.forEachMethod(new BeanAnalyzer.BeanMethodHandler() {
            @Override
            public void onMethod(Method m, String key, Object result) {
                actualList.add(result);
            }
        }, false);

        return actualList;
    }


}
