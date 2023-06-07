If you want to run this application in docker container, then paste this Dockerfile content in parallel to your source forlder and then build image and run the container.

# Use a base image with Java 11 installed
FROM openjdk:11-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target directory of your local project to the container
COPY target/springDockerDemo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 for the container
EXPOSE 8080

# Define the command to run your application inside the container
CMD ["java", "-jar", "app.jar"]
