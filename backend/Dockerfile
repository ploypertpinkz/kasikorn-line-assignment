# Stage 1: Build the application using Gradle with JDK 11
FROM gradle:8.5-jdk11 AS build
LABEL authors="ployjearawong"
WORKDIR /app
COPY . .
RUN gradle bootJar --no-daemon

# Stage 2: Create a lightweight image to run the application with OpenJDK 11
FROM openjdk:11-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
