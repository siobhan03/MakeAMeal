import java.util.Scanner;

public class RegistrationPage {
    public static void showRegistration() {
        Scanner scanner = new Scanner(System.in);
        boolean restartRegistration = false;

        do {
            if (restartRegistration) {
                System.out.println("Restarting registration...");
            }
            System.out.println("Registration Page");
            System.out.print("Please enter your username: ");
            String username = scanner.nextLine();
            System.out.print("Please enter your email: ");
            String email = scanner.nextLine();
            String password;
            do {
                System.out.print("Please enter your password: ");
                password = scanner.nextLine();
                System.out.println("Please re-enter your password: ");
                String passwordConfirmation = scanner.nextLine();
                if (!password.equals(passwordConfirmation)) {
                    System.out.println("Passwords do not match. Please try again.");
                } else {
                    break;
                }
            } while (true);
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.print("Are these details correct? yes/no: ");
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("yes")) {
                Users newUser = new Users();
                boolean registrationSuccessful = newUser.register();
                if (registrationSuccessful) {
                    System.out.println("Registration successful!");
                    // Exit the loop if registration is successful
                    System.out.println("Please login");
                    LoginPage.showLogin();
                    //break login page if details not match
                    break;
                } else {
                    System.out.println("Registration failed. Please try again.");
                    restartRegistration = true;
                }
            } else if (response.equals("no")) {
                System.out.println("Registration canceled.");
                restartRegistration = true;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                restartRegistration = true;
            }
        } while (restartRegistration);
    }
}

