#!/bin/sh

mvn clean
mvn install assembly:assembly

if [ "$?" != "0" ]; then
    echo "Error compiling configuration implementations"
    exit 0
fi

