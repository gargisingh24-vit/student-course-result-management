# Student Course & Result Management System

## 1. Project Overview

The Student Course & Result Management System is a Java-based console application designed to manage student information, courses, and academic results.

The application provides a simple command-line interface through which users can add, view, and delete student records, manage courses, enter marks, calculate grades, and generate reports.

## 2. Features

- Add student details
- View student records
- Delete student records
- Add courses
- View courses
- Enter student marks
- Automatic grade calculation
- Generate student, course, and result reports
- Input validation
- Basic file-based data logging
- Exception handling

## 3. Technologies Used

- Java
- Java Collections Framework
- Java File Handling
- Object-Oriented Programming
- Command Line Interface
- Git and GitHub

## 4. Project Structure

````text
StudentManagementSystem/
│
├── README.md
├── statement.md
├── src/
│   ├── Main.java
│   ├── Student.java
│   ├── Course.java
│   ├── Result.java
│   ├── User.java
│   ├── StudentManager.java
│   ├── CourseManager.java
│   ├── ResultManager.java
│   ├── FileManager.java
│   └── InputValidator.java
│
├── data/
└── docs/

## 5. Requirements

- Java JDK 8 or later
- Command Prompt / Terminal
- Git (for repository management)

## 6. How to Run

### Step 1: Open the project directory

Open a terminal inside the `StudentManagementSystem` directory.

### Step 2: Compile the project

```bash
javac -d out src\*.java

### Step 3: Run the application

java -cp out Main

## 7. Application Menu

After running the application, the following menu is displayed:

```text
1. Student Management
2. Course Management
3. Result Management
4. Reports
5. Exit

## 8. Testing

The application can be tested using the following operations:

1. Add a new student with a valid ID, name, and email.
2. View the list of students.
3. Delete a student using the student ID.
4. Add a new course with course ID, course name, and credits.
5. View the available courses.
6. Enter marks for a student.
7. Check the automatically calculated grade.
8. View the complete report containing students, courses, and results.
9. Test invalid email input.
10. Test marks outside the range of 0 to 100.

## 9. Error Handling

The application performs basic input validation and error handling.

- Email addresses are validated before adding a student.
- Marks are validated to ensure they are between 0 and 100.
- Invalid menu choices are handled with an appropriate message.
- File input/output operations use exception handling.

## 10. Java Concepts Used

The project demonstrates the following Java concepts:

- Classes and Objects
- Encapsulation
- Constructors
- Methods
- Inheritance
- Polymorphism
- ArrayList and Collections
- Exception Handling
- File Handling
- Input Validation
- Switch Statements
- Modular Programming

## 11. Future Enhancements

The project can be further enhanced by:

- Adding a MySQL database
- Adding user authentication and login
- Developing a graphical user interface
- Adding attendance management
- Adding advanced result analytics
- Generating downloadable result reports
- Adding search and filtering functionality

## 12. Author

Student Course & Result Management System developed as part of the Java course project.
````
