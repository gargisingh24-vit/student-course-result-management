public class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public void displayRole() {
        System.out.println("System User: " + username);
    }
}