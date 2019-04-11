package com.github.openshift.circe.yaml;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;

public interface YamlProvider {

    String toYaml();

    /**
     * Builds a custom YamlProvider which also satisfies an arbitrary list of interfaces. In
     * This manner, you can circumvent the need to build a full interface implementation and
     * only return the YAML you actually want to be rendered.
     * For example, public MachineSet getMachineSet() could be satisfied with
     * return (MachineSet)YamlProvider.buildFor("the yaml I want", MachineSet.class);
     * @param yaml The Yaml the provider will always return.
     * @param mustImplementInterfaces One or more interfaces the proxy should satisfy
     * @return A proxy object that implements YamlProvider and the specified interfaces.
     */
    static YamlProvider buildFor(final String yaml, Class<?>... mustImplementInterfaces) {
        ArrayList<Class<?>> interfaces = new ArrayList<>();
        interfaces.addAll(Arrays.asList(mustImplementInterfaces));
        interfaces.add(YamlProvider.class);

        return (YamlProvider)Proxy.newProxyInstance(
                YamlProvider.class.getClassLoader(),
                interfaces.toArray(new Class<?>[]{}),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        if ( method.getName() == "toYaml" ) {
                            return yaml;
                        }
                        throw new UnsupportedOperationException("Invalid access to YamlProvider method: " + o.getClass() + "." + method.getName());
                    }
                }
        );
    }
}
