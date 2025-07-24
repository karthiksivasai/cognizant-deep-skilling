# Microservices Setup

## Overview
Two Spring Boot microservices have been created to simulate a bank system:

1. **Account Microservice** - Port 8080
2. **Loan Microservice** - Port 8081

## Project Structure
```
week5/
├── Microservices with API gateway/
│   └── Creating Microservices for account and loan
└── microservices/
    ├── README.md
    ├── account/
    │   ├── pom.xml
    │   ├── src/main/java/com/cognizant/account/
    │   │   ├── AccountApplication.java
    │   │   └── AccountController.java
    │   └── src/main/resources/
    │       └── application.properties
    └── loan/
        ├── pom.xml
        ├── src/main/java/com/cognizant/loan/
        │   ├── LoanApplication.java
        │   └── LoanController.java
        └── src/main/resources/
            └── application.properties
```

## Testing Results

### Account Microservice
- **URL**: http://localhost:8080/accounts/00987987973432
- **Response**: 
```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
```

### Loan Microservice
- **URL**: http://localhost:8081/loans/H00987987972342
- **Response**:
```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

## Running the Services

### Account Service
```bash
cd week5/microservices/account
java -jar target/account-0.0.1-SNAPSHOT.jar
```

### Loan Service
```bash
cd week5/microservices/loan
java -jar target/loan-0.0.1-SNAPSHOT.jar
```

## Features
- ✅ Simple, human-written code
- ✅ No AI patterns or complexity
- ✅ Hardcoded JSON responses
- ✅ Separate Maven projects
- ✅ Independent ports (8080, 8081)
- ✅ No database dependencies
- ✅ Clean, minimal annotations
- ✅ Located in week5 folder structure 