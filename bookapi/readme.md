

# 📚 Book Management REST API (Spring Boot + Swagger)

A simple and clean **Book Management REST API** built using Spring Boot. This project demonstrates CRUD operations and API documentation using Swagger UI.

---

## 🚀 Features

- Add new books
- View all books
- Get book by ID
- Delete book
- Interactive API testing using Swagger UI

---

## 📁 Project Structure

```
bookapi
│
├── pom.xml
│
└── src
    └── main
        ├── java
        │   └── com/example/bookapi
        │       ├── DemoApplication.java
        │       ├── controller
        │       │   └── BookController.java
        │       ├── service
        │       │   └── BookService.java
        │       └── model
        │           └── Book.java
        │
        └── resources
            └── application.properties
```

---

## ⚙️ Requirements

- Java 17+
- Maven
- VS Code / IntelliJ / Eclipse

---

## 🛠️ Setup & Run (All OS)

### 📌 Step 1: Clone or Navigate to Project

```bash
cd bookapi
```

---

## 💻 Run Commands by OS

### 🪟 Windows

```bash
mvn clean install
mvn spring-boot:run
```

### 🍎 macOS

```bash
mvn clean install
mvn spring-boot:run
```

### 🐧 Linux

```bash
mvn clean install
mvn spring-boot:run
```

---

## 🌐 Access Application

- Swagger UI:
```
http://localhost:8080/swagger-ui/index.html
```

---

## 🧪 API Endpoints

| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /api/books | Get all books |
| POST | /api/books | Add new book |
| GET | /api/books/{id} | Get book by ID |
| DELETE | /api/books/{id} | Delete book |

---

## 📦 Example JSON (POST)

```json
{
  "id": 1,
  "title": "Spring Boot",
  "author": "Shubham"
}
```

---

## 🧰 Useful Maven Commands

| Command | Description |
|--------|------------|
| mvn clean | Remove old build files |
| mvn install | Build project |
| mvn spring-boot:run | Run application |
| mvn test | Run tests |

---

## 📚 Learnings

- Spring Boot basics
- REST API development
- MVC architecture
- Swagger API documentation

---

## 🚀 Future Improvements

- Add MySQL database
- Implement update API (PUT)
- Add validation
- Add authentication (JWT)

---

## 👨‍💻 Author

Shubham Sharma

---

⭐ If you found this helpful, consider giving it a star!