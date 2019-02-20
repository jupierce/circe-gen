package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface FileContents extends Bean {

	@YamlPropertyName(value="compression")
	String getCompression() throws Exception;

	@YamlPropertyName(value="source")
	String getSource() throws Exception;

	@YamlPropertyName(value="verification")
	Verification getVerification() throws Exception;

	interface EZ extends FileContents {

		@YamlPropertyName(value="compression")
		default String getCompression() throws Exception { return null; }

		@YamlPropertyName(value="source")
		default String getSource() throws Exception { return null; }

		@YamlPropertyName(value="verification")
		default Verification getVerification() throws Exception { return null; }

	}

}
