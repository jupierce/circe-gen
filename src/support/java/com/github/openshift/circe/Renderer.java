package com.github.openshift.circe;

import com.github.openshift.circe.beans.ConfigUnit;
import com.github.openshift.circe.yaml.YamlDumper;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;

public class Renderer {

    public static void toYamlDir(ConfigUnit unit, Path outputDir) throws InvocationTargetException, IllegalAccessException, IOException {
        outputDir.toFile().mkdirs();
        for ( Method m : unit.getClass().getMethods() ) {

            if ( m.getName().startsWith("get") && m.getDeclaringClass().getName().startsWith("java.") == false) {
                String objName = m.getName().substring(3); // string 'get'
                Object o = m.invoke(unit);
                if ( o == null ) {
                    continue;
                }
                Path yamlOutputFile = outputDir.resolve(objName + ".yaml");
                FileWriter jfw = new FileWriter(yamlOutputFile.toFile());
                jfw.write("# Serializing result of " + unit.getClass() + "." + m.getName() + "\n");
                jfw.write((new YamlDumper(YamlDumper.Verbosity.SHOW_VALUE_SOURCE)).toString(o));
                jfw.close();
            }
        }
    }

}
