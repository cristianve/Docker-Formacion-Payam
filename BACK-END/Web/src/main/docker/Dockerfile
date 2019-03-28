FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /BACK-END/Web-0.0.1-SNAPSHOT.jar docker-webserver-spring-boot.jar
ENTRYPOINT ["java","-jar","docker-webserver-spring-boot.jar"]
