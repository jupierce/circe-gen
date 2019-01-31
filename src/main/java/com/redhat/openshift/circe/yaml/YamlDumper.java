package com.redhat.openshift.circe.yaml;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static javax.swing.text.html.HTML.Tag.P;

/*
 Copyright (c) 2002 JSON.org

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 The Software shall be used for Good, not Evil.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY_ENVIRONMENT KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY_ENVIRONMENT CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

public class YamlDumper {

    public enum Verbosity {
        NONE,
        SHOW_VALUE_SOURCE,
        SHOW_ALL_SOURCE,
    }

    private final int indentation;
    private final Verbosity verbosity;


    public YamlDumper(int indentation, Verbosity verbosity) {
        this.indentation = indentation;
        this.verbosity = verbosity;
    }

    public YamlDumper(Verbosity verbosity) {
        this(2, verbosity);
    }

    public YamlDumper() {
        this(Verbosity.NONE);
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
    private static <A extends Annotation> A getAnnotation(final Method m, final Class<A> annotationClass) {
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


    private boolean isValidMethodName(String name) {
        return !"getClass".equals(name) && !"getDeclaringClass".equals(name);
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
                // If "TLSVerify", we want tlsVerify, so look ahead unless we are at the end
                if ( i == 0 || key.length() == i+1 || !Character.isLowerCase(key.charAt(i+1)) ) {
                    sb.append( Character.toLowerCase(c) );
                } else {
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private void indent(List<StringBuilder> sbs, int spaces) {
        for ( StringBuilder sb : sbs ) {

            if (sb.toString().length() == 0) {
                continue; // don't indent empty lines
            }

            for ( int i = 0; i < spaces; i++ ) {
                sb.insert(0, " " );
            }
        }
    }

    private class PrimitiveValue extends ArrayList<StringBuilder> {
        public PrimitiveValue(String value) {
            this.add(new StringBuilder(value));
        }
    }

    private List<StringBuilder> toStrings(Object object) {

        if ( object == null ) {
            return new PrimitiveValue("null");
        }

        Class<?> klass = object.getClass();

        if ( object instanceof Byte
                || object instanceof Short
                || object instanceof Integer
                || object instanceof Long
                || object instanceof Boolean
                || object instanceof Float
                || object instanceof Double
                || object instanceof BigInteger
                || object instanceof BigDecimal
                ) {
            return new PrimitiveValue(""+object);
        }

        List<StringBuilder> sbs = new ArrayList<>();

        if ( object instanceof String ||
                object instanceof Character ||
                object instanceof Enum) {
            String toQuote = "" + object;

            String[] lines = toQuote.split("\n");
            if ( lines.length == 1 ) {
                // Use double quote format
                toQuote = toQuote.replace("\\", "\\\\"); // replace \ with \\
                toQuote = toQuote.replace("\"", "\\\"");  // replace " with \"
                return new PrimitiveValue("\"" + toQuote + "\"");
            } else {
                // Use block format; indentation factor must be specified to preserve leading space after a newline
                // Note: if a string ends with multiple empty lines, only one will be preserved.
                if ( toQuote.endsWith("\n") ) {
                    sbs.add(new StringBuilder("|" + indentation));
                } else {
                    sbs.add(new StringBuilder("|-" + indentation));
                }
                for ( String line : lines ) {
                    sbs.add(new StringBuilder(line));
                }
                return sbs;
            }

        }

        if (object instanceof Collection) {
            // Repackage as an array
            object = ((Collection)object).toArray();
        }

        if (object.getClass().isArray()) {
            int length = Array.getLength(object);
            if ( length == 0 ) {
                sbs.add(new StringBuilder("[]"));
            } else {
                for (int i = 0; i < length; i += 1) {
                    Object item = Array.get(object, i);
                    List<StringBuilder> itemsbs = toStrings(item);
                    indent(itemsbs, indentation);

                    // Remove any leading empty lines before starting the list elements for readability
                    Iterator<StringBuilder> itemsIt = itemsbs.iterator();
                    while (itemsIt.hasNext() ) {
                        if ( itemsIt.next().toString().trim().length() == 0 ) {
                            itemsIt.remove();
                            break;
                        }
                    }

                    itemsbs.get(0).deleteCharAt(0).insert(0, "-");
                    sbs.addAll(itemsbs);
                }
            }
            return sbs;
        }

        // If klass is a System class then set includeSuperClass to false.
        boolean includeSuperClass = klass.getClassLoader() != null;

        Method[] methods = includeSuperClass ? klass.getMethods() : klass.getDeclaredMethods();
        for (final Method method : methods) {
            final int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)
                    && !Modifier.isStatic(modifiers)
                    && method.getParameterTypes().length == 0
                    && !method.isBridge()
                    && method.getReturnType() != Void.TYPE
                    && isValidMethodName(method.getName())) {
                final String key = getKeyNameFromMethod(method);
                if (key != null && !key.isEmpty()) {
                    try {
                        method.setAccessible(true);

                        final Object result = method.invoke(object);


                        if ( this.verbosity != Verbosity.NONE ) {
                            if ( this.verbosity == Verbosity.SHOW_ALL_SOURCE || result != null ) {
                                // Comment on where this value is derived from
                                sbs.add(new StringBuilder(""));
                                if ( klass == method.getDeclaringClass() ) {
                                    sbs.add(new StringBuilder("# Asked " + method.getDeclaringClass() + "." + method.getName() ));
                                } else {
                                    sbs.add(new StringBuilder("# Asked " + klass.getName() + " which returned value from " + method.getDeclaringClass() + "." + method.getName() ));
                                }
                                if ( result == null ) {
                                    sbs.add(new StringBuilder("# " + key + ": null"));
                                }
                            }
                        }

                        if (result != null) {
                            List<StringBuilder> val = toStrings(result);

                            if ( val instanceof PrimitiveValue ) {
                                sbs.add(new StringBuilder(key + ": " + val.get(0).toString()));
                            } else {
                                sbs.add(new StringBuilder(key + ": "));
                                indent(val, indentation);
                                sbs.addAll(val);
                            }

                        }
                    } catch (IllegalAccessException ignore) {
                    } catch (IllegalArgumentException ignore) {
                    } catch (InvocationTargetException ignore) {
                    }
                }
            }
        }

        return sbs;
    }

    public String toString(Object object, int initialIndent) {
        List<StringBuilder> sbs = new ArrayList<>();

        sbs.add(new StringBuilder("# Serializing: " + object.getClass()));

        sbs.addAll(toStrings(object));
        if ( initialIndent > 0 ) {
            indent(sbs, initialIndent);
        }
        StringBuilder master = new StringBuilder();
        for ( StringBuilder sb : sbs ) {
            master.append(sb.toString());
            master.append("\n");
        }
        return master.toString();
    }

    public String toString(Object object) {
        return toString(object, 0);
    }
}
