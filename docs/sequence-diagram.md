# Sequence Diagram

The sequence diagram shows the interaction between the user, main application, management modules, validation component, and file manager during common system operations.

## Student Addition Sequence

```mermaid
sequenceDiagram
    actor User
    participant Main
    participant Validator as InputValidator
    participant Manager as StudentManager
    participant File as FileManager

    User->>Main: Select Student Management
    User->>Main: Enter student ID, name and email
    Main->>Validator: Validate email
    Validator-->>Main: Validation result

    alt Valid email
        Main->>Manager: addStudent(student)
        Manager-->>Main: Student added successfully
        Main->>File: saveData(student details)
        File-->>Main: Data logged
        Main-->>User: Success message
    else Invalid email
        Main-->>User: Invalid email message
    end
```

## Result Entry Sequence

```mermaid
sequenceDiagram
    actor User
    participant Main
    participant Validator as InputValidator
    participant Manager as ResultManager
    participant Result
    participant File as FileManager

    User->>Main: Select Result Management
    User->>Main: Enter student ID, course ID and marks
    Main->>Validator: Validate marks
    Validator-->>Main: Validation result

    alt Valid marks
        Main->>Result: Create Result object
        Result-->>Main: Result object with grade
        Main->>Manager: addResult(result)
        Manager-->>Main: Result added successfully
        Main->>File: saveData(result details)
        File-->>Main: Data logged
        Main-->>User: Success message
    else Invalid marks
        Main-->>User: Marks must be between 0 and 100
    end
```

## Sequence Description

1. The user selects an operation from the main menu.
2. The main application collects the required input.
3. InputValidator checks the input where validation is required.
4. The corresponding manager processes the operation.
5. A data object is created for the required entity.
6. The FileManager logs selected operations.
7. The system displays the result or an appropriate error message to the user.
