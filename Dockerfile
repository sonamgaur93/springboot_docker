# Use OpenJDK as base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY target/springboot_docker-1.0.0.jar app.jar

# Expose application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
