#!/bin/sh

mvn install assembly:assembly ; java -cp target/circe-1.0-SNAPSHOT-jar-with-dependencies.jar com.redhat.openshift.cr.config.CirceGen -e stg -n free-stg -t starter -o out
