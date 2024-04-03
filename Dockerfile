FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
RUN mkdir -p /app
WORKDIR /app
COPY pom.xml /app
COPY src /app/src
RUN mvn -B package --file pom.xml -DskipTests

# Fetch the Java sdk image
FROM eclipse-temurin:21-jdk-alpine
# Expose port 8080
EXPOSE 8080
COPY --from=build /app/target/*jar cicd-example-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","cicd-example-0.0.1-SNAPSHOT.jar"]