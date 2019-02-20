package com.github.openshift.circe.gen.tuned.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TunedMatch extends Bean {

	@YamlPropertyName(value="label")
	String getLabel() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	@YamlPropertyName(value="type")
	String getType() throws Exception;

	@YamlPropertyName(value="match")
	List<TunedMatch> getMatch() throws Exception;

	interface EZ extends TunedMatch {

		@YamlPropertyName(value="label")
		default String getLabel() throws Exception { return null; }

		@YamlPropertyName(value="value")
		default String getValue() throws Exception { return null; }

		@YamlPropertyName(value="type")
		default String getType() throws Exception { return null; }

		@YamlPropertyName(value="match")
		default List<TunedMatch> getMatch() throws Exception { return null; }

	}

}
