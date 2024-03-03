
FROM openjdk:8-jdk-alpine

# Copy the JAR file from the target directory into the Docker image
COPY target/my-app-1.0-SNAPSHOT.jar /usr/src/app/app.jar

# Command to run the Java application
CMD ["java", "-jar", "/usr/src/app/app.jar"]
