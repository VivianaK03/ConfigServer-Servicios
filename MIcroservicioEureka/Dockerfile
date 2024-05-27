# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the application jar file to the container
COPY target/MicroservicioEureka-0.0.1-SNAPSHOT.jar app.jar

# Command to run the application
CMD ["java", "-jar", "/app/app.jar"]