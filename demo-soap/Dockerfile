
FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD /target/demo-soap-0.0.1-SNAPSHOT.jar demo-soap-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo-soap-0.0.1-SNAPSHOT.jar"]

