package com.github.openshift.config;

import java.io.IOException;
import java.util.Map;

public class RenderContext {

    private static final ThreadLocal<RenderContext> current = new ThreadLocal<>();

    /**
     * Sets the RenderContext for the current thread. Must be set
     * prior to instantiating AbstractDefinitions.
     * @param context
     */
    protected static final void setCurrent(RenderContext context) {
        current.set(context);
    }

    /**
     * Returns the render context which can be inspected by the definition / bean
     * implementations in order to determine command line arguments (like cluster type
     * and render parameters).
     * @return Returns the RenderContext for this thread.
     */
    public static final RenderContext getRenderContext() {
        return current.get();
    }

    // Stores the ClusterType being rendered
    private final ClusterCriterion.ClusterType clusterType;
    // Stores the ClusterEnvironment being rendered
    private final ClusterCriterion.ClusterEnvironment clusterEnvironment;
    // Stores the cluster name being rendered
    private final String clusterName;
    // Stores the map of attributes passed in from the command line
    private final Map<String, String> evalAttributes;

    public RenderContext(ClusterCriterion.ClusterType type,
                         ClusterCriterion.ClusterEnvironment env,
                         String name,
                         Map<String, String> attributes) {
        this.clusterType = type;
        this.clusterEnvironment = env;
        this.clusterName = name;
        this.evalAttributes = attributes;
    }

    public ClusterCriterion.ClusterType getClusterType() {
        return clusterType;
    }

    public ClusterCriterion.ClusterEnvironment getClusterEnvironment() {
        return clusterEnvironment;
    }

    public String getClusterName() {
        return clusterName;
    }

    public String getRequiredRenderParameter(String name) throws IOException {
        String val = evalAttributes.get(name);
        if (val == null) {
            throw new IOException("Rendering " + this.getClass().getName() + " requires the render parameter '" + name + "' to be specified on the command line");
        }
        return val;
    }

    public String getRenderParameter(String name, String def) {
        String val = evalAttributes.get(name);
        if (val == null) {
            return def;
        }
        return val;
    }

}
