package com.github.openshift.circe.beans;

import com.github.openshift.circe.Renderer;
import com.github.openshift.circe.yaml.YamlPropertyIgnore;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Provides a helper Secret implementations.
 */
public abstract class Secret extends BaseObject {

    public enum SecretType {
        Opaque("Opaque"),
        DockerCfg("kubernetes.io/dockercfg"),
        DockerCfgJson("kubernetes.io/dockerconfigjson"),
        Tls("kubernetes.io/tls"),
        ServiceAccountToken("kubernetes.io/service-account-token"),
        ;

        String name;

        SecretType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    protected final SecretType secretType;

    public Secret(ObjectMeta metadata, SecretType secretType) {
        super("v1", "Secret", metadata);
        this.secretType = secretType;
    }

    public Secret(String namespace, String name, SecretType secretType) {
        super("v1", "Secret", new ObjectMeta(namespace, name));
        this.secretType = secretType;
    }

    public String getType() {
        return secretType.getName();
    }

    @YamlPropertyIgnore
    public abstract Map<String,byte[]> getRawData();

    /**
     * This method will pull the raw entries values and return base64 encoded
     * strings that the Secret object expects.
     */
    public final Map<String,String> getData() {

        Map<String, byte[]> mb = getRawData();
        if ( mb == null ) {
            return null;
        }

        Map<String,String> data = new LinkedHashMap<>();
        for ( String key : mb.keySet() ) {
            byte[] result = mb.get(key);
            data.put(key, Base64.getEncoder().encodeToString(result) );
        }

        return data;
    }

    public static class SimpleSecret extends Secret {

        private final LinkedHashMap<String,byte[]> entries = new LinkedHashMap<>();

        public SimpleSecret(String namespace, String name, SecretType secretType) {
            super(namespace, name, secretType);
        }

        @Override
        public Map<String, byte[]> getRawData() {
            return entries;
        }

        public void add(String key, byte[]data) {
            byte[] was = entries.put(key, data);
            if ( was != null ) {
                throw new UnsupportedOperationException("Data was already present for key: " + key + ". Use 'set'");
            }
        }

        public void setTls(byte[] tlsCrt, byte[]tlsKey) {
            entries.put("tls.crt", tlsCrt);
            entries.put("tls.key", tlsKey);
        }

        public void setTls(File tlsCrt, File tlsKey) throws IOException {
            setTls(Files.readAllBytes(tlsCrt.toPath()), Files.readAllBytes(tlsKey.toPath()));
        }

        public void set(String key, byte[]data) {
            entries.put(key, data);
        }

        public void add(String key, String data) {
            try {
                add(key, data.getBytes("utf-8"));
            } catch ( UnsupportedEncodingException uee ) {}
        }

        public void set(String key, String data) {
            try {
                entries.put(key, data.getBytes("utf-8"));
            } catch ( UnsupportedEncodingException uee ) {}
        }

        public void remove(String key) {
            byte[] was = entries.remove(key);
            if ( was == null ) {
                throw new UnsupportedOperationException("No data was present for key: " + key);
            }
        }

    }

}
