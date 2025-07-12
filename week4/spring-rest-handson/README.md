# Spring Boot REST API Learning Project

This is a Spring Boot project created for learning REST API development with Spring Framework.

## Project Structure

### `src/main/java`
This folder contains all the Java source code for the application. It follows the standard Maven convention where Java files are organized in packages that match the directory structure.

### `src/main/resources`
This folder contains non-Java resources like:
- Configuration files (application.properties, application.yml)
- Static files (HTML, CSS, JavaScript)
- Templates
- Database scripts
- Logging configuration

### `src/test/java`
This folder contains all test classes. Tests are organized in the same package structure as the main code for easy navigation and maintenance.

## Key Components

### `@SpringBootApplication`
This annotation is a convenience annotation that adds all of the following:
- `@Configuration`: Tags the class as a source of bean definitions
- `@EnableAutoConfiguration`: Tells Spring Boot to start adding beans based on classpath settings
- `@ComponentScan`: Tells Spring to look for other components, configurations, and services in the com/cognizant/springlearn package

### `pom.xml`
The Maven Project Object Model file that contains:
- Project metadata (groupId, artifactId, version)
- Dependencies (Spring Boot Web, DevTools, Test)
- Build configuration
- Plugin configuration

## Dependencies

- **Spring Boot Web**: Provides everything needed to build web applications, including REST APIs
- **Spring Boot DevTools**: Provides development-time features like automatic restart and live reload
- **Spring Boot Test**: Provides testing utilities and integration test support

## How to View Dependency Tree

### Command Line
```bash
mvn dependency:tree
```

### IDE (IntelliJ IDEA)
1. Open the Maven tool window
2. Expand your project
3. Expand Dependencies
4. View the dependency tree

### IDE (Eclipse)
1. Right-click on the project
2. Select Maven → Show Dependency Tree

## Running the Application

```bash
mvn spring-boot:run
```

The application will start on port 8080 and you'll see the log message "SpringLearnApplication has started."

## Sample Run Screenshot

Below is a screenshot of a successful run of the Spring Boot application:

![Sample Run](../../Screenshot%202025-07-12%20at%207.48.56%E2%80%AFPM.png) 