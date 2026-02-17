# 🎓 Student Task Manager  
### Smart Academic Task Management System using Spring Boot

Student Task Manager is a web-based application developed using **Spring Boot, Java, and MVC Architecture**.  
It helps students efficiently manage academic assignments, personal tasks, and daily activities through a secure and structured platform.

---

## 📖 Project Overview

Managing assignments, deadlines, and daily tasks can be challenging for students.  
This system provides a centralized solution where students can:

- Register and log in securely
- Create and manage tasks
- Update task details
- Delete completed tasks
- Track task status

The application improves productivity and helps students stay organized.

---

## 🚀 Key Features

- 🔐 Secure User Authentication (Login & Registration)
- ➕ Create New Tasks
- ✏️ Update Existing Tasks
- ❌ Delete Tasks
- 📋 View All Tasks
- 🗂 Structured MVC Architecture
- 💾 Database Integration using Spring Data JPA
- 🌐 Thymeleaf-based Dynamic Web Pages
- 🧪 REST API Testing using Postman

---

## 🏗 System Architecture

The project follows the **Model-View-Controller (MVC)** pattern.

### 🔹 Controller Layer
- `AuthController`
- `TaskController`

### 🔹 Service Layer
- `TaskService`
- `UserService`

### 🔹 Repository Layer
- `TaskRepository`
- `UserRepository`

### 🔹 Model Layer
- `Task`
- `User`

### 🔹 View Layer
- Thymeleaf Templates
- Static CSS/Resources

---

## 🛠 Technologies Used

| Technology | Purpose |
|------------|----------|
| Java | Backend Development |
| Spring Boot | Application Framework |
| Spring Data JPA | ORM & Database Access |
| Maven | Build Tool |
| Thymeleaf | Server-side Templating |
| MySQL / H2 | Database |
| HTML/CSS | Frontend Design |
| Postman | API Testing |

---

## 📂 Project Structure

```
taskmanager
│── src
│   ├── main
│   │   ├── java/com/student/taskmanager
│   │   │   ├── controller
│   │   │   ├── service
│   │   │   ├── repository
│   │   │   ├── model
│   │   ├── resources
│   │   │   ├── templates
│   │   │   ├── static
│   ├── test
│── pom.xml
```

---

## ⚙️ Installation & Setup

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/student-task-manager.git
```

### 2️⃣ Navigate to Project

```bash
cd taskmanager
```

### 3️⃣ Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskmanager
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 4️⃣ Run Application

```bash
mvn spring-boot:run
```

### 5️⃣ Open in Browser

```
http://localhost:8080
```

---

# 🌐 REST API Endpoints

The application provides REST APIs that can be tested using **Postman**.

---

## 🔐 Authentication APIs

### ➤ Register User  
**POST** `/register`

```json
{
  "username": "student1",
  "password": "12345"
}
```

### ➤ Login User  
**POST** `/login`

```json
{
  "username": "student1",
  "password": "12345"
}
```

---

## 📝 Task APIs

### ➤ Create Task  
**POST** `/tasks`

```json
{
  "title": "Complete Assignment",
  "description": "Finish Spring Boot project",
  "status": "PENDING"
}
```

---

### ➤ Get All Tasks  
**GET** `/tasks`

---

### ➤ Update Task  
**PUT** `/tasks/{id}`

```json
{
  "title": "Updated Task",
  "description": "Updated Description",
  "status": "COMPLETED"
}
```

---

### ➤ Delete Task  
**DELETE** `/tasks/{id}`

---

## 🧪 Testing Using Postman

1. Open Postman
2. Select request type (GET, POST, PUT, DELETE)
3. Enter URL:
   ```
   http://localhost:8080/tasks
   ```
4. Select **Body → raw → JSON**
5. Send request and check response

---

## 📌 Base URL

```
http://localhost:8080
```

---

## 🎯 Future Enhancements

- Role-Based Access Control (Admin/Student)
- Task Priority Levels
- Due Date Reminders
- Dashboard with Analytics
- Email Notifications
- JWT Authentication

---

## 📚 Learning Outcomes

This project demonstrates:

- Practical implementation of MVC architecture
- Spring Boot application development
- Database integration using JPA
- Authentication handling
- REST API development
- Full-stack Java application structure

---

## 👩‍💻 Developed by:
**Sanika Muluk**
**Computer Engineer Student**
**Java Fullstack Developer**

Developed as a Student Task Management System project to demonstrate backend and full-stack development skills using Spring Boot.

---

⭐ If you found this project helpful, consider giving it a star!
