	# Use an official OpenJDK runtime as a parent image
	FROM openjdk:17-alpine

	RUN apk update && apk add bash

	# Set the working directory to /app
	WORKDIR /app

	# Copy the fat jar into the container at /app
	COPY /target/employee-service.jar /app

	EXPOSE 8080

	# Run jar file when the container launches
	CMD ["java", "-jar", "employee-service.jar"]
