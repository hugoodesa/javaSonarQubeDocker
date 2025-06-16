FROM maven:3.9.9-amazoncorretto-24-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src 
RUN mvn clean install

FROM amazoncorretto:24.0.1-alpine3.21
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["echo", "RUNNING ON DOCKER, access localhost:8080/v1/docker"]
