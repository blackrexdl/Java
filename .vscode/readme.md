# Student Feedback Application (Spring Boot + Maven)

A simple **Spring Boot web application** that allows students to submit feedback through a form. This project is designed for beginners learning **Java web development using Spring Boot, Maven, and MVC architecture**.

---

# Project Overview

| Feature | Description |
|--------|-------------|
| Feedback Form | Students can submit their feedback through a simple form |
| Spring Boot Backend | Handles HTTP requests and responses |
| MVC Architecture | Uses Controller, Model, and View pattern |
| Maven Build Tool | Manages dependencies and project build |
| Embedded Server | Runs using built‑in Apache Tomcat |

---

# Project Structure

```
demo
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.demo
│   │   │       ├── DemoApplication.java
│   │   │       ├── controller
│   │   │       │   └── FeedbackController.java
│   │   │       └── model
│   │   │           └── Feedback.java
│   │   │
│   │   └── resources
│   │       ├── templates
│   │       │   ├── feedback.html
│   │       │   └── result.html
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
└── mvnw / mvnw.cmd
```

---

# Requirements

| Software | Version |
|--------|--------|
| Java JDK | 17 or later |
| Apache Maven | 3.9+ |
| IDE | VS Code / Eclipse / IntelliJ |
| Browser | Chrome / Edge / Safari |

---


# IDE Setup (VS Code / Eclipse / IntelliJ)

| IDE | Setup Steps | Basic Commands |
|----|-------------|---------------|
| VS Code | Install **Java Extension Pack** and **Spring Boot Extension Pack**. Open the project folder and allow VS Code to detect Maven automatically. | `code demo` → open project folder in VS Code |
| Eclipse | Install **Eclipse IDE for Enterprise Java Developers**. Import project using Maven. | File → Import → Maven → Existing Maven Project |
| IntelliJ IDEA | Open IntelliJ → New → Open Project → Select project folder containing `pom.xml`. IntelliJ will auto-detect Maven. | `File → Open → Select demo folder` |

---

## VS Code Quick Setup

Install extensions:

```
code --install-extension vscjava.vscode-java-pack
code --install-extension vmware.vscode-spring-boot
```

Open project:

```
cd demo
code .
```

---

## Maven Commands (Common)

| Command | Purpose |
|--------|--------|
| `mvn clean` | Removes previous build files |
| `mvn install` | Builds the project and downloads dependencies |
| `mvn spring-boot:run` | Runs the Spring Boot application |
| `mvn test` | Runs unit tests |

---

# How to Run the Project

## 1. Clone or Download the Project

```
git clone <your-repository-url>
cd demo
```

---

## 2. Run the Application

Using Maven:

```
mvn spring-boot:run
```

Using Maven Wrapper:

```
./mvnw spring-boot:run
```

---

## 3. Open in Browser

```
http://localhost:8080
```

You will see the **Student Feedback Form**.

---

# Application Workflow

| Step | Process |
|----|------|
| 1 | User opens feedback form |
| 2 | Student enters name, course, rating and comments |
| 3 | Form is submitted to Spring Boot controller |
| 4 | Controller processes feedback data |
| 5 | Result page displays submitted feedback |

---

# Technologies Used

- Java
- Spring Boot
- Maven
- Thymeleaf
- HTML

---

# Learning Objectives

This project helps beginners understand:

- Spring Boot basics
- MVC architecture
- Form handling in Spring
- Maven project structure
- Running a web application locally

---

# Future Improvements

Possible upgrades for this project:

- Add MySQL database
- Store feedback records
- Admin dashboard to view feedback
- Bootstrap UI improvements
- REST API support

---

# Author

**Shubham Sharma**  
Computer Science Student | Java & Web Development Enthusiast

---

This project is built for **learning Spring Boot web development** and demonstrating a simple feedback system.
