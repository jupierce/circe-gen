package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Config extends Bean {

	@YamlPropertyName(value="ignition")
	Ignition getIgnition() throws Exception;

	@YamlPropertyName(value="networkd")
	Networkd getNetworkd() throws Exception;

	@YamlPropertyName(value="passwd")
	Passwd getPasswd() throws Exception;

	@YamlPropertyName(value="storage")
	Storage getStorage() throws Exception;

	@YamlPropertyName(value="systemd")
	Systemd getSystemd() throws Exception;

	interface EZ extends Config {

		default Ignition getIgnition() throws Exception { return null; }

		default Networkd getNetworkd() throws Exception { return null; }

		default Passwd getPasswd() throws Exception { return null; }

		default Storage getStorage() throws Exception { return null; }

		default Systemd getSystemd() throws Exception { return null; }

	}

}
