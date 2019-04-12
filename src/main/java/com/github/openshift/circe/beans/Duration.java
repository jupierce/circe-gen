package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.Bean;
import com.github.openshift.circe.yaml.YamlPropertyName;

public class Duration implements Bean {

    private final String goDurationString;

    /**
     * @param goDurationString A string which https://golang.org/pkg/time/#ParseDuration can parse
     */
    public Duration(String goDurationString) {
        this.goDurationString = goDurationString;
    }

    @YamlPropertyName(value="duration")
    public String getDuration() {
        return goDurationString;
    }

}
