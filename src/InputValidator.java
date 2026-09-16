public class InputValidator {

    public static boolean isValidMarks(double marks) {
        return marks >= 0 && marks <= 100;
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}