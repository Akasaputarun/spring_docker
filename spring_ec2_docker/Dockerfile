FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/spring_ec2_docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]