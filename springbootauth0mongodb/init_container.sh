#!/bin/sh
set -e

echo "Starting SSH ..."
service ssh start

echo "Running startup command 'java -jar /app/app.jar'"
java -Dspring.data.mongodb.uri=mongodb://localhost:27017/test -jar /app/app.jar