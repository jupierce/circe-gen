package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.YamlPropertyName;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides a helper Identity implementations.
 */
public class Identity extends BaseObject {

    private final HashMap<String,String> extra = new HashMap<>();
    private final HashMap<String,String> openshiftUser = new HashMap<>();
    private final String providerName;
    private final String providerUserName;

    public Identity(String provider, String providerUserName, Map<String,String> extra, String openshiftUserName, String openshiftUserId) {
        super("user.openshift.io/v1", "Identity", new ObjectMeta(null, provider + ":" + providerUserName));
        if ( extra != null ) {
            this.extra.putAll(extra);
        }
        this.providerName = provider;
        this.providerUserName = providerUserName;
        if ( openshiftUserName != null ) {
            openshiftUser.put("name", openshiftUserName);
        }
        if ( openshiftUserId != null ) {
            openshiftUser.put("uid", openshiftUserId);
        }
    }

    // Create an Identity without an associated User resource
    public Identity(String provider, String providerUserName, Map<String,String> extra) {
        this(provider, providerUserName, extra, null, null);
    }

    // Create an Identity without any extra information or associate User resource
    public Identity(String provider, String providerUserName) {
        this(provider, providerUserName, null, null, null);
    }

    @YamlPropertyName(value="extra")
    public Map<String,String> getExtra() {
        if (extra.size() > 0) {
            return extra;
        }
        return null;
    }

    @YamlPropertyName(value = "providerName")
    public String getProviderName() {
        return providerName;
    }

    @YamlPropertyName(value = "providerUserName")
    public String getProviderUserName() {
        return providerUserName;
    }

    /**
     * If the Identity is associated with a User at present,
     * this should be populated with a username and uid. An empty
     * map is used when there is no associated user.
     */
    @YamlPropertyName(value = "user")
    public Map<String,String> getOpenShiftUser() {
        return openshiftUser;
    }

}
