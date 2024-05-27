# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the application jar file to the container
COPY target/spring-cloud-config-server-0.0.1-SNAPSHOT.jar app.jar

# Crear un directorio para los archivos de configuración
RUN mkdir -p /config

# Exponer el puerto en el que correrá la aplicación
EXPOSE 8888

# Command to run the application
CMD ["java", "-jar", "/app/app.jar"]