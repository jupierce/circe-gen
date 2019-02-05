package com.github.openshift.config.impl.auth;

import com.github.openshift.circe.beans.KubeList;
import com.github.openshift.circe.beans.Secret;
import com.github.openshift.circe.gen.authentication.v1.Authentication;
import com.github.openshift.circe.gen.authentication.v1.AuthenticationSpec;
import com.github.openshift.circe.gen.authentication.v1.ConfigMapNameReference;
import com.github.openshift.circe.gen.authentication.v1.WebhookTokenAuthenticator;
import com.github.openshift.circe.gen.def.v4_0.AuthDefinition;
import com.github.openshift.circe.gen.oauth.v1.*;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.AbstractDefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@ClusterCriterion(type=ClusterCriterion.ClusterType.ONLINE_STARTER)
public class StarterAuth extends AbstractDefinition implements AuthDefinition {

    public StarterAuth(ClusterCriterion.ClusterType type, ClusterCriterion.ClusterEnvironment env, String name, Map<String, String> attributes) {
        super(type, env, name, attributes);
    }

    @Override
    public Authentication getAuthentication() throws Exception {
        return new Authentication() {
            @Override
            public AuthenticationSpec getSpec() throws Exception {
                return new AuthenticationSpec() {
                    @Override
                    public String getType() throws Exception {
                        return "IntegratedOAuth";
                    }

                    @Override
                    public ConfigMapNameReference getOAuthMetadata() throws Exception {
                        return null;
                    }

                    @Override
                    public List<WebhookTokenAuthenticator> getWebhookTokenAuthenticators() throws Exception {
                        return null;
                    }
                };
            }
        };
    }

    @Override
    public OAuth getOAuth() throws Exception {
        return new OAuth() {
            @Override
            public OAuthSpec getSpec() throws Exception {
                return new OAuthSpec() {

                    @Override
                    public List<IdentityProvider> getIdentityProviders() throws Exception {
                        List<IdentityProvider> providers = new ArrayList<>();
                        providers.add(new IdentityProvider() {
                            @Override
                            public String getName() throws Exception {
                                return "keycloak";
                            }

                            @Override
                            public Boolean getUseAsChallenger() {
                                return true;
                            }

                            @Override
                            public Boolean getUseAsLogin() throws Exception {
                                return true;
                            }

                            @Override
                            public String getMappingMethod() throws Exception {
                                return "lookup";
                            }

                            @Override
                            public IdentityProviderConfig getIdentityProviderConfig() throws Exception {
                                return new IdentityProviderConfig() {
                                    @Override
                                    public String getType() throws Exception {
                                        return "OpenID";
                                    }

                                    @Override
                                    public BasicAuthIdentityProvider getBasicAuth() throws Exception {
                                        return null;
                                    }

                                    @Override
                                    public GitHubIdentityProvider getGitHub() throws Exception {
                                        return null;
                                    }

                                    @Override
                                    public GitLabIdentityProvider getGitLab() throws Exception {
                                        return null;
                                    }

                                    @Override
                                    public GoogleIdentityProvider getGoogle() throws Exception {
                                        return null;
                                    }

                                    @Override
                                    public HTPasswdIdentityProvider getHTPasswd() throws Exception {
                                        return null;
                                    }

                                    @Override
                                    public KeystoneIdentityProvider getKeystone() throws Exception {
                                        return null;
                                    }

                                    @Override
                                    public LDAPIdentityProvider getLDAP() throws Exception {
                                        return null;
                                    }

                                    @Override
                                    public OpenIDIdentityProvider getOpenID() throws Exception {
                                        return new OpenIDIdentityProvider() {
                                            @Override
                                            public String getClientID() throws Exception {
                                                return "oso";
                                            }

                                            @Override
                                            public SecretNameReference getClientSecret() throws Exception {
                                                return new SecretNameReference() {
                                                    @Override
                                                    public String getName() throws Exception {
                                                        return "keycloak";
                                                    }
                                                };
                                            }

                                            @Override
                                            public com.github.openshift.circe.gen.oauth.v1.ConfigMapNameReference getCA() throws Exception {
                                                return null;
                                            }

                                            @Override
                                            public List<String> getExtraScopes() throws Exception {
                                                return null;
                                            }

                                            @Override
                                            public Map<String, String> getExtraAuthorizeParameters() throws Exception {
                                                return null;
                                            }

                                            @Override
                                            public OpenIDURLs getURLs() throws Exception {
                                                return new OpenIDURLs() {
                                                    @Override
                                                    public String getAuthorize() throws Exception {
                                                        return "https://developers.redhat.com/auth/realms/rhd/protocol/openid-connect/auth";
                                                    }

                                                    @Override
                                                    public String getToken() throws Exception {
                                                        return "https://developers.redhat.com/auth/realms/rhd/protocol/openid-connect/token";
                                                    }

                                                    @Override
                                                    public String getUserInfo() throws Exception {
                                                        return "https://developers.redhat.com/auth/realms/rhd/protocol/openid-connect/userinfo";
                                                    }
                                                };
                                            }

                                            @Override
                                            public OpenIDClaims getClaims() throws Exception {
                                                return new OpenIDClaims() {
                                                    @Override
                                                    public List<String> getPreferredUsername() throws Exception {
                                                        return Arrays.asList("preferred_username");
                                                    }

                                                    @Override
                                                    public List<String> getName() throws Exception {
                                                        return Arrays.asList("name");
                                                    }

                                                    @Override
                                                    public List<String> getEmail() throws Exception {
                                                        return Arrays.asList("email");
                                                    }
                                                };
                                            }
                                        };
                                    }

                                    @Override
                                    public RequestHeaderIdentityProvider getRequestHeader() throws Exception {
                                        return null;
                                    }
                                };
                            }
                        });
                        return providers;
                    }

                    @Override
                    public TokenConfig getTokenConfig() throws Exception {
                        return new TokenConfig() {
                            @Override
                            public Long getAccessTokenMaxAgeSeconds() throws Exception {
                                return 31536000L;
                            }

                            @Override
                            public Long getAccessTokenInactivityTimeoutSeconds() throws Exception {
                                return 300L;
                            }
                        };
                    }

                    @Override
                    public OAuthTemplates getTemplates() throws Exception {
                        return new OAuthTemplates() {
                            @Override
                            public SecretNameReference getLogin() throws Exception {
                                return null;
                            }

                            @Override
                            public SecretNameReference getProviderSelection() throws Exception {
                                return null;
                            }

                            @Override
                            public SecretNameReference getError() throws Exception {
                                return null;
                            }
                        };
                    }
                };
            }
        };
    }

    @Override
    public KubeList<Secret> getSecretList() throws Exception {
        ArrayList<Secret> secrets = new ArrayList<>();

        Secret.SimpleSecret s = new Secret.SimpleSecret("openshift-config", "keycloak", Secret.SecretType.Opaque);
        s.add("clientSecret", "some secret value");
        secrets.add(s);

        return new KubeList<>(secrets);
    }
}
