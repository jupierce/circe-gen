#!/bin/sh

mvn clean
mvn install assembly:assembly

if [ "$?" != "0" ]; then
    echo "Error compiling configuration implementations"
    exit 0
fi

java -cp target/circe-render-4.0-jar-with-dependencies.jar com.github.openshift.config.Render -e int -n free-int -t starter --define v4_0_auth --to-dir out --store-secrets
