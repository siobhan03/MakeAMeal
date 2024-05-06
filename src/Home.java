import java.util.Scanner;

public class Home {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        boolean validResponse = false;

        do {
            System.out.println("Do you already have an account? (yes/no)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                // Login page
                LoginPage.showLogin();
                validResponse = true;
            } else if (input.equalsIgnoreCase("no")) {
                // Registration page
                RegistrationPage.showRegistration();
                validResponse = true;
            } else {
                System.out.println("Invalid input. Please answer 'yes' or 'no'.");
            }
        } while (!validResponse);
    }
}
