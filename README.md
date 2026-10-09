Oasis Infobyte java Devlopment internship tasks from 5 september 2026  to 15 october 2026.
Tasks done are:
Task 3 : ATM Interface -> from Java Development Track
Task 5 : Digital Library Management System -> from Java Development Track

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
🎓 Learning Outcomes
Through this project, the following concepts are practiced:

Building a Java console application
Applying OOP principles
Managing multiple Java classes
Implementing authentication
Managing account balances
Maintaining transaction history using ArrayList
Implementing menu-driven applications

Task-5:
