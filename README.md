🎓 Student Task Manager
A Smart Academic Task Management System Built with Spring Boot

Student Task Manager is a web-based task management system developed using Spring Boot, Java, and MVC architecture.
It enables students to efficiently manage academic assignments, daily tasks, and personal activities through a secure and structured platform.

📌 Project Description

In academic life, students often struggle to manage multiple assignments, deadlines, and responsibilities.
The Student Task Manager provides a centralized system where students can:

Register and log in securely

Add new academic tasks

Update task information

Delete completed tasks

Track and manage pending work

The system improves productivity and helps students stay organized.

🚀 Key Features
🔐 1. Authentication System

Secure login and registration

User-based session handling

Password-protected access

📝 2. Task Management

Create new tasks

Update task details

Delete tasks

View all tasks

🏗 3. Structured MVC Architecture

Separation of concerns

Clean, maintainable code structure

Industry-standard project organization

💾 4. Database Integration

Persistent data storage

Task and user data managed using JPA

Repository-based data handling

🏗 System Architecture

The project follows the Model-View-Controller (MVC) design pattern:

🔹 Controller Layer

Handles HTTP requests and user interactions.

AuthController

TaskController

🔹 Service Layer

Contains business logic.

TaskService

UserService

🔹 Repository Layer

Handles database operations using Spring Data JPA.

TaskRepository

UserRepository

🔹 Model Layer

Represents database entities.

Task

User

🔹 View Layer

Thymeleaf templates

Static CSS/HTML resources

🛠️ Technologies Used
Technology	Purpose
Java	Backend Development
Spring Boot	Application Framework
Spring Data JPA	Database ORM
Maven	Build Tool
Thymeleaf	Server-side Templating
MySQL / H2	Database
HTML/CSS	Frontend Design
📂 Project Structure
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
⚙️ Installation & Setup Guide
1️⃣ Clone the Repository
git clone https://github.com/your-username/student-task-manager.git
2️⃣ Navigate to Project Folder
cd taskmanager
3️⃣ Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/taskmanager
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
4️⃣ Run the Application
mvn spring-boot:run
5️⃣ Access in Browser
http://localhost:8080
📊 Future Enhancements

Role-based access (Admin/Student)

Task priority levels

Due date reminders

Dashboard with analytics

Email notification system

REST API integration

🌐 REST API Endpoints

The Student Task Manager exposes RESTful endpoints that can be tested using Postman.

🔐 Authentication APIs
➤ Register User

POST /register

{
  "username": "student1",
  "password": "12345"
}
➤ Login User

POST /login

{
  "username": "student1",
  "password": "12345"
}
📝 Task APIs
➤ Create Task

POST /tasks

{
  "title": "Complete Assignment",
  "description": "Finish Spring Boot project",
  "status": "PENDING"
}
➤ Get All Tasks

GET /tasks

➤ Update Task

PUT /tasks/{id}

{
  "title": "Updated Task",
  "description": "Updated Description",
  "status": "COMPLETED"
}
➤ Delete Task

DELETE /tasks/{id}

🎯 Learning Outcomes

This project demonstrates:

Practical implementation of MVC architecture

Spring Boot application development

Database integration using JPA

Authentication implementation

Full-stack Java development skills

👩‍💻 Developed By
Sanika Muluk
Computer Engineering Student  
Full-Stack Java Developer 

Developed as a Student Task Management System project to demonstrate backend and full-stack development skills using Spring Boot.

⭐ If you find this project helpful, feel free to star the repository!
