FROM openjdk:8-jdk-alpine

VOLUME /tmp

ADD target/eb-demo-0.0.1-SNAPSHOT.jar application.jar

EXPOSE 5000

ENV JAVA_OPTS=""

ENTRYPOINT java application.jar
