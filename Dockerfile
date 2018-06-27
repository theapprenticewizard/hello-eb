FROM openjdk:8-jdk-alpine

ADD target/eb-demo-0.0.1-SNAPSHOT.jar application.jar

EXPOSE 5000

ENTRYPOINT java -jar application.jar