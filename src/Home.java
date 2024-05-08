import java.util.Scanner;

public class Home {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean validResponse = false;

        do {
            //Check if user already has an account
            System.out.println("Do you already have an account? (yes/no)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                // If yes, call login page
                LoginPage.showLogin();
                validResponse = true;
            } else if (input.equalsIgnoreCase("no")) {
                //If no, call registration page
                RegistrationPage.registration();
                validResponse = true;
            } else {
                //If invalid, ask user to input yes or no
                System.out.println("Invalid input. Please answer 'yes' or 'no'.");
            }
        } while (!validResponse);
    }
}
