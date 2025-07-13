# Spring REST Handson 3

This project demonstrates a simple Spring Boot REST API with logging and endpoint testing.

## How to Run

1. Open a terminal and navigate to this directory:
   ```sh
   cd week4/spring-rest-handson3
   ```
2. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```
3. The server will start on port 8083.

## Test the /hello Endpoint

- Open your browser and go to:
  [http://localhost:8083/hello](http://localhost:8083/hello)
  - You should see: `Hello World!!`
- Open Postman and send a GET request to:
  `http://localhost:8083/hello`
  - You should see: `Hello World!!`

## Check HTTP Headers

- **In Chrome:**
  1. Open DevTools (F12 or right-click → Inspect → Network tab)
  2. Refresh the /hello page
  3. Click the request and view the Headers tab for details
- **In Postman:**
  1. After sending the request, click the Headers tab to see all HTTP headers

## Logging
- The application logs `START - sayHello()` and `END - sayHello()` to the console each time the endpoint is called. 