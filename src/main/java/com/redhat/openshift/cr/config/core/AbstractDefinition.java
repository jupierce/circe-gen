package com.redhat.openshift.cr.config.core;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public abstract class AbstractDefinition {

    // Stores the ClusterType being rendered
    protected final ClusterCriterion.ClusterType clusterType;
    // Stores the ClusterEnvironment being rendered
    protected final ClusterCriterion.ClusterEnvironment clusterEnvironment;
    // Stores the cluster name being rendered
    protected final String clusterName;
    // Stores the map of attributes passed in from the command line
    protected final Map<String, String> evalAttributes;

    public AbstractDefinition(
            ClusterCriterion.ClusterType type,
            ClusterCriterion.ClusterEnvironment env,
            String name,
            Map<String, String> attributes) {
        this.clusterType = type;
        this.clusterEnvironment = env;
        this.clusterName = name;
        this.evalAttributes = attributes;
    }

    /**
     * Reads a file in the current package and returns its content as a string.
     * @param filename The filename to read. It must reside in the same package as the calling class.
     * @param encoding The encoding of the file (e.g. "utf-8").
     * @return A String with the content of the file.
     * @throws IOException
     */
    protected String readResourceFile(String filename, String encoding) throws IOException {
        InputStream is = null;

        try {
            is = this.getClass().getResourceAsStream(filename);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte []buffer = new byte[1024];
            int count;
            while ( (count = is.read(buffer)) > 0 ) {
                baos.write(buffer, 0, count);
            }
            return baos.toString(encoding);
        } finally {
            try {
                if ( is != null ) {
                    is.close();
                    is = null;
                }
            } catch ( Throwable ignore ) {}
        }

    }

    /**
     * Returns the content of a utf-8 encoded file in the current package.
     * @param filename The name of the file.
     * @return The content of the file as a string.
     * @throws IOException
     */
    protected String readResourceFile(String filename) throws IOException {
        return readResourceFile(filename, "utf-8");
    }


}
