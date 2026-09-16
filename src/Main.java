import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static StudentManager studentManager = new StudentManager();
    static CourseManager courseManager = new CourseManager();
    static ResultManager resultManager = new ResultManager();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=================================");
            System.out.println(" STUDENT COURSE MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Result Management");
            System.out.println("4. Reports");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    studentMenu();
                    break;

                case 2:
                    courseMenu();
                    break;

                case 3:
                    resultMenu();
                    break;

                case 4:
                    reports();
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void studentMenu() {

        System.out.println("\n--- Student Management ---");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Delete Student");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            if (!InputValidator.isValidEmail(email)) {
                System.out.println("Invalid email!");
                return;
            }

            Student student = new Student(id, name, email);
            studentManager.addStudent(student);

            FileManager.saveData("Student Added: " + id + ", " + name);

        } else if (choice == 2) {

            studentManager.viewStudents();

        } else if (choice == 3) {

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            studentManager.deleteStudent(id);

        } else {
            System.out.println("Invalid choice!");
        }
    }

    static void courseMenu() {

        System.out.println("\n--- Course Management ---");
        System.out.println("1. Add Course");
        System.out.println("2. View Courses");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter Course ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Credits: ");
            int credits = sc.nextInt();

            courseManager.addCourse(new Course(id, name, credits));

        } else if (choice == 2) {

            courseManager.viewCourses();

        } else {
            System.out.println("Invalid choice!");
        }
    }

    static void resultMenu() {

        System.out.println("\n--- Result Management ---");

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        System.out.print("Enter Course ID: ");
        int courseId = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        if (!InputValidator.isValidMarks(marks)) {
            System.out.println("Marks must be between 0 and 100.");
            return;
        }

        resultManager.addResult(new Result(studentId, courseId, marks));
        FileManager.saveData("Result Added: Student " + studentId);
    }

    static void reports() {

        System.out.println("\n========== REPORTS ==========");

        System.out.println("\n--- Students ---");
        studentManager.viewStudents();

        System.out.println("\n--- Courses ---");
        courseManager.viewCourses();

        System.out.println("\n--- Results ---");
        resultManager.viewResults();
    }
}