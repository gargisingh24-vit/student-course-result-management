# Class Diagram

The class diagram represents the main classes of the Student Course & Result Management System and their responsibilities.

```mermaid
classDiagram

class Main {
    +main(String[] args)
    +studentMenu()
    +courseMenu()
    +resultMenu()
    +reports()
}

class Student {
    -int id
    -String name
    -String email
    +Student(int id, String name, String email)
    +getId() int
    +getName() String
    +getEmail() String
    +setName(String name)
    +setEmail(String email)
    +display()
}

class Course {
    -int courseId
    -String courseName
    -int credits
    +Course(int courseId, String courseName, int credits)
    +getCourseId() int
    +getCourseName() String
    +getCredits() int
    +display()
}

class Result {
    -int studentId
    -int courseId
    -double marks
    +Result(int studentId, int courseId, double marks)
    +getMarks() double
    +getGrade() String
    +display()
}

class StudentManager {
    -ArrayList~Student~ students
    +addStudent(Student student)
    +viewStudents()
    +deleteStudent(int id)
}

class CourseManager {
    -ArrayList~Course~ courses
    +addCourse(Course course)
    +viewCourses()
}

class ResultManager {
    -ArrayList~Result~ results
    +addResult(Result result)
    +viewResults()
}

class InputValidator {
    +isValidMarks(double marks) boolean
    +isValidEmail(String email) boolean
}

class FileManager {
    +saveData(String data)
}

Main --> StudentManager
Main --> CourseManager
Main --> ResultManager
Main --> InputValidator
Main --> FileManager

StudentManager "1" o-- "*" Student
CourseManager "1" o-- "*" Course
ResultManager "1" o-- "*" Result

StudentManager ..> Student
CourseManager ..> Course
ResultManager ..> Result
```

## Class Responsibilities

### Student

Stores student ID, name, and email. It provides methods to access, update, and display student information.

### Course

Stores course ID, course name, and credits and provides methods to access and display course information.

### Result

Stores student ID, course ID, and marks. It calculates the grade based on the marks.

### StudentManager

Manages student records using an `ArrayList`.

### CourseManager

Manages course records using an `ArrayList`.

### ResultManager

Manages result records using an `ArrayList`.

### InputValidator

Provides validation methods for email addresses and marks.

### FileManager

Handles basic file-based logging of system operations.

### Main

Controls the application menu and connects the different management modules.
