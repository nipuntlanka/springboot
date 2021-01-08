FROM lolhens/baseimage-openjre
ADD target/docker-cw-image.jar docker-cw-image.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-cw-image.jar"]