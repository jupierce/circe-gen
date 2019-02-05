package com.github.openshift.config.impl.auth;

import com.github.openshift.circe.beans.KubeList;
import com.github.openshift.circe.beans.Secret;
import com.github.openshift.circe.gen.authentication.v1.Authentication;
import com.github.openshift.circe.gen.def.v4_0.AuthDefinition;
import com.github.openshift.circe.gen.oauth.v1.OAuth;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.AbstractDefinition;

import java.util.ArrayList;
import java.util.Map;

@ClusterCriterion(type=ClusterCriterion.ClusterType.ONLINE_STARTER)
public class StarterAuth extends AbstractDefinition implements AuthDefinition {

    public StarterAuth(ClusterCriterion.ClusterType type, ClusterCriterion.ClusterEnvironment env, String name, Map<String, String> attributes) {
        super(type, env, name, attributes);
    }

    @Override
    public Authentication getAuthentication() throws Exception {
        return null;
    }

    @Override
    public OAuth getOAuth() throws Exception {
        return null;
    }

    @Override
    public KubeList<Secret> getSecretList() throws Exception {
        ArrayList<Secret> secrets = new ArrayList<>();
        Secret.SimpleSecret s = new Secret.SimpleSecret("openshift-config", "tls", Secret.SecretType.Opaque);
        s.add("secret.txt", "this is the content of secret.txt");
        secrets.add(s);
        s = new Secret.SimpleSecret("openshift-config", "tls", Secret.SecretType.Opaque);
        s.add("secret2.txt", "this is the content of secret2.txt");
        secrets.add(s);
        return new KubeList<>(secrets);
    }
}
