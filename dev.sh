#!/usr/bin/env bash

./mvnw clean compile -DskipTests
./mvnw quarkus:dev
