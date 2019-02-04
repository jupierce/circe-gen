package com.github.openshift.circe.yaml;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

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

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
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

        if ( object instanceof YamlProvider ) {
            String yaml = ((YamlProvider)object).toYaml();
            List<StringBuilder> sbs = new ArrayList<>();
            if ( verbosity == Verbosity.SHOW_VALUE_SOURCE ) {
                sbs.add(new StringBuilder("# Outputting literal content provided by a " + YamlProvider.class.getName() + " implementation"));
            }
            for ( String line : yaml.split("\n") ) {
                sbs.add(new StringBuilder(line));
            }
            return sbs;
        }

        if ( object instanceof ListBean) {
            /**
             * A ListBean is actually a representation of a YAML list. Each 'get' method
             * represents an element of the list. The actual name of the method will not
             * be reflected in the resulting YAML (except possibly in comments).
             * This allows you to use the power of object hierarchy to create/inherit/override
             * elements of a list.
             */
            List<Object> actualObjects = new ArrayList<Object>();

            BeanAnalyzer analyzer = new BeanAnalyzer(object);
            analyzer.forEachMethod(new BeanAnalyzer.BeanMethodHandler() {
                @Override
                public void onMethod(Method m, String key, Object result) {
                    actualObjects.add(result);
                }
            }, false);

            object = actualObjects;
        }

        if ( object instanceof MapBean) {
            /**
             * A MapBean is actually a representation of a YAML map. Each 'get' method
             * represents an entry in the map.
             * This allows you to use the power of object hierarchy to create/inherit/override
             * elements of a list.
             */
            Map<String, Object> actualObjects = new LinkedHashMap<String, Object>();

            BeanAnalyzer analyzer = new BeanAnalyzer(object);
            analyzer.forEachMethod(new BeanAnalyzer.BeanMethodHandler() {
                @Override
                public void onMethod(Method m, String key, Object result) {
                    actualObjects.put(key, result);
                }
            }, false);

            object = actualObjects;
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

        if ( object instanceof Map ) {
            Map m = (Map)object;
            for ( Object k : m.keySet() ) {
                String key = "" + k;
                Object result = m.get(key);
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
            }
            return sbs;
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

        BeanAnalyzer analyzer = new BeanAnalyzer(object);
        analyzer.forEachMethod(new BeanAnalyzer.BeanMethodHandler() {
            @Override
            public void onMethod(Method method, String key, Object result) {
                boolean showSourceComment =
                        verbosity == Verbosity.SHOW_ALL_SOURCE
                                || ( verbosity == Verbosity.SHOW_VALUE_SOURCE && (result != Void.TYPE) );


                if ( showSourceComment ) {
                    // Comment on where this value is derived from
                    sbs.add(new StringBuilder(""));
                    if ( klass == method.getDeclaringClass() ) {
                        sbs.add(new StringBuilder("# Asked " + method.getDeclaringClass() + "." + method.getName() ));
                    } else {
                        sbs.add(new StringBuilder("# Asked " + klass.getName() + " which returned value from " + method.getDeclaringClass() + "." + method.getName() ));
                    }
                }

                if (result != Void.TYPE) {
                    List<StringBuilder> val = toStrings(result);

                    if ( val instanceof PrimitiveValue ) {
                        sbs.add(new StringBuilder(key + ": " + val.get(0).toString()));
                    } else {
                        sbs.add(new StringBuilder(key + ": "));
                        indent(val, indentation);
                        sbs.addAll(val);
                    }
                } else {
                    // Value should not be serialized into YAML at all. If SHOW_ALL_SOURCE, print a comment that we tried
                    if ( showSourceComment ) {
                        sbs.add(new StringBuilder("# " + key + ": n/a"));
                    }
                }
            }
        }, true);

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
