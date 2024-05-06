import java.util.Scanner;

public class LoginPage {
    public static void showLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login Page");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);

        boolean loginSuccessful = user.login();

        if (loginSuccessful) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
    }