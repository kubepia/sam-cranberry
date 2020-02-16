#!/bin/bash
mvn -DskipTest package

IMAGE=myguddy/sam-cranberry-cms:$1
LATEST=myguddy/sam-cranberry-cms:latest
echo "docker build . -t "$IMAGE

docker build . -t $IMAGE
docker tag $IMAGE $LATEST
docker push $IMAGE
docker push $LATEST