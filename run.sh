#!/bin/sh

mvn install assembly:assembly ; java -cp target/operator0-java-gen-1.0-SNAPSHOT-jar-with-dependencies.jar com.redhat.openshift.cr.config.CirceGen -e stg -n free-stg -t starter -o out
