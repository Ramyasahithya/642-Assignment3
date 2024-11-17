FROM openjdk:17-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/surveyForm-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]