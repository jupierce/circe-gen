package com.redhat.openshift.cr.config.network;


import com.redhat.openshift.circe.gen.networkconfig.ClusterNetwork;

import java.util.List;

public class StarterNetworkConfigSpec extends GenericNetworkConfigSpec {
    @Override
    public List<ClusterNetwork> getClusterNetworks() {
        return null;
    }

}
