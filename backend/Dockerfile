# base image of the backend container
# includes Maven 3.9.6, Java 21 (Eclipse Temurin), and Alpine Linux (lightweight Linux distribution)
FROM maven:3.9.6-eclipse-temurin-21-alpine

# set the working directory in the container to /app
WORKDIR /app

# copy the pom.xml file to the working directory /app
COPY pom.xml ./

# download the dependencies specified in pom.xml
RUN mvn dependency:go-offline

# copy the rest of the application code to the working directory /app
COPY . .

# compile and package the application
RUN mvn package -DskipTests

# command to run the application - uses the jar file created in the target directory
CMD ["java", "-jar", "target/triviz-backend-0.0.1-SNAPSHOT.jar"]