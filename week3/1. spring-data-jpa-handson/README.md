# Spring Data JPA Hands-on

This project is a demo for Spring Data JPA and Hibernate using MySQL.

## Setup Steps

1. Create a new Spring Boot project with:
   - Group: com.cognizant
   - Artifact: orm-learn
   - Dependencies: Spring Boot DevTools, Spring Data JPA, MySQL Driver

2. Create a MySQL schema:
   - `create schema ormlearn;`

3. Add database and logging config in `src/main/resources/application.properties`.

4. Create the `country` table and insert sample data in MySQL.

5. Add the following classes:
   - `Country` (model)
   - `CountryRepository` (repository)
   - `CountryService` (service)
   - Update `OrmLearnApplication.java` to test fetching all countries.

6. Build and run the project. Check logs for output.

See the code and config files in this folder for details. 