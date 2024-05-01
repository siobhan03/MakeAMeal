import java.util.HashMap;
public class UserManager {
    private HashMap<String, User> users; // Map username to User object
    public UserManager() {
        this.users = new HashMap<>();
    }
    public void addUser(String username, String password) {
        if (!users.containsKey(username)) {
            User newUser = new User(username, password);
            users.put(username, newUser);
            System.out.println("User account created successfully.");
            // Save user data to file (if needed)
        } else {
            System.out.println("Username already exists. Please choose a different username.");
        }
    }
    public boolean authenticateUser(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            return user.getPassword().equals(password);
        } else {
            System.out.println("User not found. Please check your username.");
            return false;

        }
    }
}
