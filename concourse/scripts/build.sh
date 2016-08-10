#!/usr/bin/env bash

set -e -x

clone resource-demo-concourse-app resource-app

cd resource-app

mvn clean install:wq

