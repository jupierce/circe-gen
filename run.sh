#!/bin/sh

mvn clean
mvn install assembly:assembly

if [ "$?" != "0" ]; then
    echo "Error compiling configuration implementations"
    exit 0
fi

java -cp target/circe-render-1.0-SNAPSHOT-jar-with-dependencies.jar com.redhat.openshift.cr.config.CirceRender -e stg -n free-stg -t starter -o out --unit project
