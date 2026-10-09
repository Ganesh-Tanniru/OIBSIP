Oasis Infobyte java Devlopment internship tasks from 5 september 2026  to 15 october 2026.
Tasks done are:
Task 3 : ATM Interface -> from Java Development Track
Task 5 : Digital Library Management System -> from Java Development Track

Oasis Infobyte Internship Projects:

 Task-3:
 ATM Interface:
 ---------------
A console-based ATM machine simulation developed using Java and Object-Oriented Programming (OOP) concepts.

The application allows users to authenticate using a User ID and PIN and perform common banking operations such as withdrawal, deposit, fund transfer, and transaction history.

 Objective
To build a simple ATM simulation that demonstrates Java OOP concepts, user authentication, account management, transaction handling, and the use of ArrayList for maintaining transaction history.

 Features
User ID and PIN authentication
Maximum 3 incorrect PIN attempts
Transaction History
Withdraw money with balance validation
Deposit money
Transfer money between accounts
Insufficient Funds validation
Session-based transaction history
Console-based menu system
Object-Oriented design using multiple Java classes
Tech Stack
Language: Java
Application Type: Console Application
Concepts: OOP, Encapsulation, ArrayList, Switch-Case
IDE: Eclipse
Project Structure
ATM_Project/
│
├── src/
│   ├── ATM/
│   │   ├── ATM.java
│   │   ├── Account.java
│   │   ├── Bank.java
│   │   ├── Main.java
│   │   └── Transaction.java
│   │
│   └── module-info.java
│
└── bin/
    └── Compiled Java classes
 Java Classes
ATM
Handles ATM operations and the main transaction menu.

Account
Stores account information such as account ID, PIN, and balance.

Bank
Manages bank accounts and account-related operations.

Transaction
Represents individual banking transactions and transaction details.

Main
Entry point of the application.

 Available Operations
After successful authentication, the user can select:

1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Withdrawal
User enters the withdrawal amount.
Available balance is checked.
If sufficient balance exists, the amount is deducted.
The transaction is added to the transaction history.
Deposit
User enters the deposit amount.
The amount is added to the account balance.
The transaction is recorded.
Transfer
User enters the recipient account ID.
Transfer amount is entered.
Available balance is validated.
Amount is transferred between accounts.
The transaction is recorded.
Transaction History
All transactions performed during the current session are stored using an ArrayList and displayed clearly when requested.

 Authentication
The application asks for:

User ID
PIN
The user is allowed a maximum of 3 incorrect attempts. Access is denied after three failed attempts.

 OOP Concepts Used
This project demonstrates:

Encapsulation — private fields with getters/setters
Classes and Objects
Constructors
ArrayList
Method-based design
Switch-Case
Object interaction between multiple classes
 How to Run
Clone the repository.
Open the project in Eclipse or another Java IDE.
Run Main.java.
Enter the required User ID and PIN.
Select an option from the ATM menu.
 Learning Outcomes
Through this project, the following concepts are practiced:

Building a Java console application
Applying OOP principles
Managing multiple Java classes
Implementing authentication
Managing account balances
Maintaining transaction history using ArrayList
Implementing menu-driven applications
====================================================================================================================================================================================================================
Task-5:
Digital Library Management System:
-----------------------------------
A simple web-based Digital Library Management System developed using Java, Spring Boot, MySQL, HTML, CSS, JavaScript, and Bootstrap.

Features
User Registration
User Login
View Available Books
Add Books
Edit Book Details
Delete Books
Issue Books
Track Book Availability
Admin Dashboard
Technologies Used
Java 25
Spring Boot
Spring Data JPA
Hibernate
MySQL
HTML
CSS
JavaScript
Bootstrap
Maven
Git & GitHub
Project Structure
src/main/java/com/library/management
├── controller
├── entity
├── repository
└── service

src/main/resources/static
├── index.html
├── register.html
├── login.html
├── books.html
├── admin.html
└── manage-books.html
 How to Run
1. Clone the repository
git clone git@github.com:Ganesh-Tanniru/digital-library-management-system.git
2. Create MySQL Database
CREATE DATABASE library_db;
3. Configure MySQL

Create:

src/main/resources/application.properties

Add your local MySQL username and password.

Example:

spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8081

application.properties is excluded from GitHub using .gitignore for security.

4. Run the Application

Run LibraryManagementApplication.java from Spring Tool Suite or Eclipse.

The application will start at:

http://localhost:8081
 Application Pages
Page	URL
Home	http://localhost:8081/index.html
Register	http://localhost:8081/register.html
Login	http://localhost:8081/login.html
Books	http://localhost:8081/books.html
Admin Dashboard	http://localhost:8081/admin.html
Manage Books	http://localhost:8081/manage-books.html
REST APIs
Book APIs
POST   /books
GET    /books
PUT    /books/{id}
DELETE /books/{id}
User APIs
POST /users
POST /users/login
GET  /users
Issue APIs
POST /issues
PUT  /issues/return/{issueId}
 Learning Outcomes
Developed REST APIs using Spring Boot
Implemented CRUD operations using Spring Data JPA
Connected Spring Boot with MySQL
Integrated frontend with backend REST APIs
Practiced Git and GitHub
Built a basic full-stack Java application

Author
Tanniru Venkata Ganesh
B.Tech – Computer Science and Engineering

Thank you to Oasis Infobyte for providing an opportunity to practice web development through hands-on projects.
