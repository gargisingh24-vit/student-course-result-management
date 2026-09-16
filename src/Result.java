public class Result {
    private int studentId;
    private int courseId;
    private double marks;

    public Result(int studentId, int courseId, double marks) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        if (marks >= 50) return "D";
        return "F";
    }

    public void display() {
        System.out.println("Student ID: " + studentId +
                " | Course ID: " + courseId +
                " | Marks: " + marks +
                " | Grade: " + getGrade());
    }
}