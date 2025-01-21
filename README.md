# Product Catalog REST API

A RESTful API for managing a structured product catalog with complex data structures and MongoDB integration.

## Tech Stack
- Java 17
- Spring Boot 3.x
- MongoDB
- Maven/Gradle (dependency management)
- Spring Data MongoDB
- Spring Web
- Postman


## Project Structure

### Source Code (`src/`)
- **Controller**: HTTP request handling and API endpoints
- **Model**: Product entity class definition
- **Repository**: MongoDB operations management
- **Service**: Business logic implementation
- **DemoApplication.java**: Main Spring Boot application class

### Resources
- **static/**: Static assets (CSS, JS, images)
- **application.properties**: Configuration file

### Tests
- DemoApplicationTests.java: Basic application tests

## API Endpoints

### Product Management
- **POST** `/products` - Add a Product
- **GET** `/products/{id}` - Get a Product by ID
- **PUT** `/products/{id}` - Update a Product
- **DELETE** `/products/{id}` - Delete a Product

### Search and Filters
- **GET** `/products/search` - Search Products


## Getting Started

1. Clone the repository
```bash
git clone https://github.com/11roxanne/LeadToRev_Assignment.git
```

2. Configure MongoDB connection in `application.properties`

3. Run the application
```bash
./mvnw spring-boot:run
```

## Author
Vedanshi Sahu

