# JWT Authentication Service

This project demonstrates a Spring Boot REST API that provides JWT authentication using Basic Authentication.

## Features

- Basic Authentication endpoint
- JWT token generation
- Spring Security configuration
- In-memory user management

## How to Run

1. Navigate to the project directory:
   ```sh
   cd JWT-handson
   ```

2. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

3. The server will start on port 8090.

## API Endpoints

### Authenticate and Get JWT Token
- **URL**: `POST /authenticate`
- **Authentication**: Basic Authentication
- **Description**: Authenticates user credentials and returns a JWT token

### Sample Request
```bash
curl -s -u user:pwd http://localhost:8090/authenticate
```

### Sample Response
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNTcwMzc5NDc0LCJleHAiOjE1NzAzODA2NzR9.t3LRvlCV-hwKfoqZYlaVQqEUiBloWcWn0ft3tgv0dL0"
}
```

## Testing

You can test the API using:

1. **curl with Basic Auth**:
   ```bash
   curl -s -u user:pwd http://localhost:8090/authenticate
   ```

2. **Postman**:
   - Method: POST
   - URL: `http://localhost:8090/authenticate`
   - Authorization: Basic Auth
   - Username: `user`
   - Password: `pwd`

## Default Credentials

- **Username**: `user`
- **Password**: `pwd`

## JWT Token Details

- **Algorithm**: HS256
- **Expiration**: 20 minutes
- **Subject**: Username
- **Issued At**: Current timestamp 