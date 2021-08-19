FROM openjdk:11

EXPOSE 8080

RUN apt update && apt install -y netcat;

COPY target/*.jar app.jar

ENTRYPOINT [ "java", "-jar", "/app.jar" ]