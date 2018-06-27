FROM openjdk:8-jdk-alpine

ADD target/*.jar app.jar

EXPOSE 5000

ENTRYPOINT java -jar app.jar