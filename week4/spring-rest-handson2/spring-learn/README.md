# Spring Boot REST API Learning Project 2

This project demonstrates using a shared SimpleDateFormat bean via Spring XML configuration in a Spring Boot app.

## How it works
- The application loads a SimpleDateFormat bean from `date-format.xml`.
- It parses the string `31/12/2018` and prints the resulting Date object to the console.
- The server runs on port 8081 to avoid conflicts.

## Running the Application
```sh
mvn spring-boot:run
```
You should see the parsed date printed in the console.

## Sample Run Screenshot

Below is a screenshot of a successful run of the Spring Boot application:

![Sample Run](../../../Screenshot%202025-07-12%20at%208.01.16%E2%80%AFPM.png) 