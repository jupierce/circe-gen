// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BuildOverrides extends Bean {

	@YamlPropertyName(value="imageLabels")
	List<ImageLabel> getImageLabels() throws Exception;

	@YamlPropertyName(value="nodeSelector")
	Map<String,String> getNodeSelector() throws Exception;

	@YamlPropertyName(value="tolerations")
	List<Toleration> getTolerations() throws Exception;

	interface EZ extends BuildOverrides {

		@YamlPropertyName(value="imageLabels")
		default List<ImageLabel> getImageLabels() throws Exception { return null; }

		@YamlPropertyName(value="nodeSelector")
		default Map<String,String> getNodeSelector() throws Exception { return null; }

		@YamlPropertyName(value="tolerations")
		default List<Toleration> getTolerations() throws Exception { return null; }

	}

}
