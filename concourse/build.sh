#!/usr/bin/env bash

set -e -x

git clone resource-git resource-app

cd resource-app

mvn clean install
