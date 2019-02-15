package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface FileEmbedded1 extends Bean {

	@YamlPropertyName(value="append")
	Boolean getAppend() throws Exception;

	@YamlPropertyName(value="contents")
	FileContents getContents() throws Exception;

	@YamlPropertyName(value="mode")
	Long getMode() throws Exception;

	interface EZ extends FileEmbedded1 {

		default Boolean getAppend() throws Exception { return null; }

		default FileContents getContents() throws Exception { return null; }

		default Long getMode() throws Exception { return null; }

	}

}
