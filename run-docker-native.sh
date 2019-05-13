#!/usr/bin/env bash

./mvnw clean package -Pnative -Dnative-image.docker-build=true

docker build -f src/main/docker/Dockerfile.native -t quarkus/hello-quarkus .

docker run -i --rm -p 8080:8080 quarkus/hello-quarkus
