# System Workflow

## Student Course & Result Management System

The following workflow describes how the user interacts with the system from startup to exit.

```mermaid
flowchart TD
    A[Start Application] --> B[Display Main Menu]

    B --> C{Select Option}

    C -->|1| D[Student Management]
    C -->|2| E[Course Management]
    C -->|3| F[Result Management]
    C -->|4| G[Reports]
    C -->|5| H[Exit Application]

    D --> D1{Student Operation}
    D1 -->|Add| D2[Enter Student Details]
    D1 -->|View| D3[Display Students]
    D1 -->|Delete| D4[Delete Student]
    D2 --> D5[Validate Email]
    D5 --> D6[Save Student]
    D3 --> B
    D4 --> B
    D6 --> B

    E --> E1{Course Operation}
    E1 -->|Add| E2[Enter Course Details]
    E1 -->|View| E3[Display Courses]
    E2 --> E4[Save Course]
    E3 --> B
    E4 --> B

    F --> F1[Enter Student ID]
    F1 --> F2[Enter Course ID]
    F2 --> F3[Enter Marks]
    F3 --> F4{Validate Marks}
    F4 -->|Valid| F5[Calculate Grade]
    F4 -->|Invalid| F6[Display Error]
    F5 --> F7[Save Result]
    F6 --> B
    F7 --> B

    G --> G1[Display Students]
    G1 --> G2[Display Courses]
    G2 --> G3[Display Results]
    G3 --> B

    H --> I[End]
```

## Workflow Description

1. The application starts and displays the main menu.
2. The user selects one of the available management options.
3. In Student Management, the user can add, view, or delete student records.
4. In Course Management, the user can add and view courses.
5. In Result Management, the user enters student ID, course ID, and marks.
6. The system validates the marks and calculates the corresponding grade.
7. The Reports module displays students, courses, and results.
8. The user can return to the main menu after completing an operation.
9. Selecting Exit terminates the application.
