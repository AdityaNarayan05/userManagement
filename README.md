
# Spring Boot REST API with MySQL Database

This project is a Spring Boot REST API for storing user details into a MySQL database. It follows SOLID principles and demonstrates clean architecture using controllers, services, and repositories.

## 📑 Features
- Create a new user with `username`, `email`, and `password`.
- Store user details in a MySQL database.
- Proper error handling with exception management.
- Follows SOLID principles and clean code practices.

## 🛠️ Technologies Used
- Spring Boot
- MySQL
- Maven
- Java 21
- Apache Tomcat

## 🚀 Getting Started

### 1️⃣ Prerequisites
- Java 21 installed
- MySQL installed and running
- Postman (for API testing)

### 2️⃣ Database Configuration
Make sure MySQL server is running on `localhost:3306` and create a database named `user_db`. Use the following SQL commands:

```sql
CREATE DATABASE user_db;
USE user_db;
```

### 3️⃣ Clone the Repository
```bash
git clone <repository-url>
cd <project-folder>
```

### 4️⃣ Configure `application.properties`
Ensure the `src/main/resources/application.properties` file contains the correct MySQL configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/user_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
```

### 5️⃣ Run the Application
Use the following command to build and run the Spring Boot application:
```bash
mvn spring-boot:run
```

### 6️⃣ Test with Postman
Use the following endpoint to test the API:

- **POST** `/api/users`
    - Body (JSON):
    ```json
    {
        "username": "john_doe",
        "email": "john.doe@example.com",
        "password": "securePass123"
    }
    ```
    - Response:
    ```json
    {
        "id": 1,
        "username": "john_doe",
        "email": "john.doe@example.com"
    }
    ```

## ✅ Project Structure
```
src/main/java/com/dashboard/login
 ├── controller        # Handles API requests
 ├── model             # Defines User entity
 ├── repository        # Handles database operations
 ├── service           # Business logic
 └── exception         # Custom exceptions
```
