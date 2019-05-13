#!/usr/bin/env bash


echo "Create new project"
echo

oc new-project quarkus --display-name="Hello Quarkus App"



echo "Create new binary"
echo

oc new-build --binary --name=hello-quarkus -l app=hello-quarkus



echo "Update Dockerfile location"
echo

oc patch bc/hello-quarkus -p '{"spec":{"strategy":{"dockerStrategy":{"dockerfilePath":"src/main/docker/Dockerfile.native"}}}}'



echo "Start build by pushing the Quarkus app to OpenShift"
echo

oc start-build hello-quarkus --from-dir=. --follow



echo "Deploy it as an OpenShift app"
echo

oc new-app --image-stream=quarkus/hello-quarkus



echo "Expose services"
echo

oc expose service hello-quarkus



echo "Done. Route is:"
echo

oc get route
