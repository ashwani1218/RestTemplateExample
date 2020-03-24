FROM openjdk:8u151-jdk-alpine3.7

COPY target/REstTemplate-example-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8086

ENTRYPOINT ["java", "-jar", "/app.jar"] 