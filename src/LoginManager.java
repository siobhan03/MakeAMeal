import java.util.Scanner;
public class LoginManager {
    private UserManager userManager;

    public LoginManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void promptLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (userManager.authenticateUser(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }
}


