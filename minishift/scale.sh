#!/usr/bin/env bash

oc scale --replicas=$1 dc/hello-quarkus
