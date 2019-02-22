package com.github.openshift.circe.gen.consoleoperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConsoleCustomization extends Bean {

	@YamlPropertyName(value="brand")
	String getBrand() throws Exception;

	@YamlPropertyName(value="documentationBaseURL")
	String getDocumentationBaseURL() throws Exception;

	interface EZ extends ConsoleCustomization {

		@YamlPropertyName(value="brand")
		default String getBrand() throws Exception { return null; }

		@YamlPropertyName(value="documentationBaseURL")
		default String getDocumentationBaseURL() throws Exception { return null; }

	}

}
