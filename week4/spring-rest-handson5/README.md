# Spring REST Handson 5 - Country Service

This project demonstrates a Spring Boot REST API that returns country information based on country code.

## Features

- REST endpoint to get country by country code
- Case-insensitive country code matching
- XML data source for country information
- JSON response format

## How to Run

1. Navigate to the project directory:
   ```sh
   cd week4/spring-rest-handson5
   ```

2. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

3. The server will start on port 8083.

## API Endpoints

### Get Country by Code
- **URL**: `GET /countries/{code}`
- **Description**: Returns country information based on country code
- **Parameters**: 
  - `code` (path parameter): Country code (case-insensitive)

### Sample Requests

- Get India: `http://localhost:8083/countries/in`
- Get United States: `http://localhost:8083/countries/us`
- Get United Kingdom: `http://localhost:8083/countries/gb`

### Sample Response
```json
{
  "code": "IN",
  "name": "India"
}
```

## Testing

You can test the API using:

1. **Browser**: Navigate to `http://localhost:8083/countries/in`
2. **curl**: `curl http://localhost:8083/countries/in`
3. **Postman**: Send GET request to `http://localhost:8083/countries/in`

## Available Countries

The application includes the following countries:
- IN - India
- US - United States
- GB - United Kingdom
- CA - Canada
- AU - Australia
- DE - Germany
- FR - France
- JP - Japan
- CN - China
- BR - Brazil 