FROM openjdk:8-alpine

# Required for starting application up.
RUN apk update && apk add /bin/sh

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app

COPY target/docker-cw-image.jar $PROJECT_HOME/docker-cw-image.jar

WORKDIR $PROJECT_HOME

CMD ["java" ,"-jar","./docker-cw-image.jar"]