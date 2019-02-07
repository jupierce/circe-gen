package com.github.openshift.config.impl.def.machineconfig;

import com.github.openshift.circe.beans.KubeList;
import com.github.openshift.circe.beans.ObjectMeta;
import com.github.openshift.circe.gen.def.v4_0.MachineConfigDefinition;
import com.github.openshift.circe.gen.machineconfig.v1.*;
import com.github.openshift.circe.gen.machineconfigpool.v1.MachineConfigPool;
import com.github.openshift.circe.yaml.ListBean;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.AbstractDefinition;

import java.util.ArrayList;
import java.util.List;

@ClusterCriterion(type=ClusterCriterion.ClusterType.ONLINE_STARTER)
public class BaseMachineConfigDefinition extends AbstractDefinition implements MachineConfigDefinition {

    @Override
    public KubeList<MachineConfigPool> getMachineConfigPoolList() throws Exception {
        return null;
    }

    @Override
    public KubeList<MachineConfig> getMachineConfigList() throws Exception {
        return new KubeList<>(new MachineConfigList());
    }

    protected List<String> buildSSHKeyList() {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC7GW7qcnemBaZMw+8UNfgqwTvv6pPKftQtBZowfXfPRq5TWivRMnW/5SlW5eiLWrYsgAfnC/bREuBnE6lRmxeH2rKXb/WW1aLqNAe5XvC2xYaH9kXpQoaQWD6hbWL0mHfHowj1sWOrN25YETLbVJ3Wh4rLugIPIDKteB91HoZlv5N5Tao4yZO7YxMMScqDEo//Asdua+jCzCEuNZmSyqYZjuO8Ub20FP76Di2avR4qtrxgakIi2SxpwtCZLJndJCYI7COTSuF1WCv+uMjafLTaCeEtLw5GnoLCpb7nPqocgBFWKcJ58RkxX76JPOpdGLCLasvxS7/6pmDMyB/eO3vH");
        keys.add("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCn4lZyL7e6pRAifC7HyUHU72qPnSc7ulUDkupn85s8oAQsCiFIO72JkgA7xn9g66QGXY2lU3AFbN6sx9K9zBg/DeBG7DxbUoREYCafbAWkTBh9Fa2Ahn5pel2hXJUm/KiuX3/y6PyYdR1OHxLHJjdKl7RfeYsyMLj4ou+Vc+EUKR5oSXTkHoWFd1BRmon4bzUqROhE3RhSaoHfC5t0kqUaoC5BRhV0tLPe8AZqg7CMV7zj2FEKnDbS8NTGKCiWcgqHHQB/MIAn9GdyVYJ8qOfYnYG7TQlzWdluSHz6NQyxjKz3VgIIw96DQcPTrzWJisfs0PRd2s7jdwprADGokmuEZ3jfLEwdQz0P7byyHri93z7Iytet989/7/dfV6IEf2WHb0PxtMzxothWfBrvlPExvLlFTE06kem/nfGnoZlTrrvB7AWZWlm4dJ4iv0M9wYlJNpypL0QoacNBw1i0a+lnD85EbMYk7nME2zHquHKgJFLnGpVBEZzNqpPAATh8iMSQeBaat3SG0rQtRHpJelmo9vm4s8NidQSQZA8Pq0UOKtaABNp59KdR5NuLhCXfgy4IPXZQxkDGGtNu8didi4B95Uv7GAv3Qd6ZNTE7rC8qPmXWTN5P39Wkjpwg9zjaOkrD5HMImJhMiriw0vLFoCfuCB/QLLhz6u5qaefhDZknuw== jupierce@redhat.com");
        return keys;
    }

    protected List<PasswdUser> buildUserList() {
        ArrayList<PasswdUser> users = new ArrayList<>();
        users.add(new PasswdUser() {
            @Override
            public Usercreate getCreate() throws Exception {
                return null;
            }

            @Override
            public String getGecos() throws Exception {
                return null;
            }

            @Override
            public List<String> getGroups() throws Exception {
                return null;
            }

            @Override
            public String getHomeDir() throws Exception {
                return null;
            }

            @Override
            public String getName() throws Exception {
                return null;
            }

            @Override
            public Boolean getNoCreateHome() throws Exception {
                return null;
            }

            @Override
            public Boolean getNoLogInit() throws Exception {
                return null;
            }

            @Override
            public Boolean getNoUserGroup() throws Exception {
                return null;
            }

            @Override
            public String getPasswordHash() throws Exception {
                return null;
            }

            @Override
            public String getPrimaryGroup() throws Exception {
                return null;
            }

            @Override
            public List<String> getSSHAuthorizedKeys() throws Exception {
                return buildSSHKeyList();
            }

            @Override
            public String getShell() throws Exception {
                return null;
            }

            @Override
            public Boolean getSystem() throws Exception {
                return null;
            }

            @Override
            public Long getUID() throws Exception {
                return null;
            }
        });

        return users;
    }

    public class MachineConfigList extends ListBean<MachineConfig> {

        public MachineConfig getStandardSshKeys() {
            MachineConfig keys = new MachineConfig() {
                @Override
                public ObjectMeta getMetadata() throws Exception {
                    ObjectMeta meta = new ObjectMeta(_getGeneratorNamespaceHint(), "standard-ssh-keys");
                    meta.addLabel("machineconfiguration.openshift.io/role", "worker");
                    return meta;
                }

                @Override
                public MachineConfigSpec getSpec() throws Exception {
                    return new MachineConfigSpec() {
                        @Override
                        public String getOSImageURL() throws Exception {
                            return null;
                        }

                        @Override
                        public Config getConfig() throws Exception {
                            return new Config() {

                                @Override
                                public Ignition getIgnition() throws Exception {
                                    return null;
                                }

                                @Override
                                public Networkd getNetworkd() throws Exception {
                                    return null;
                                }

                                @Override
                                public Passwd getPasswd() throws Exception {
                                    return new Passwd() {
                                        @Override
                                        public List<PasswdGroup> getGroups() throws Exception {
                                            return null;
                                        }

                                        @Override
                                        public List<PasswdUser> getUsers() throws Exception {
                                            return buildUserList();
                                        }
                                    };
                                }

                                @Override
                                public Storage getStorage() throws Exception {
                                    return null;
                                }

                                @Override
                                public Systemd getSystemd() throws Exception {
                                    return null;
                                }
                            };
                        }
                    };
                }
            };

            return keys;
        }

    }


}
