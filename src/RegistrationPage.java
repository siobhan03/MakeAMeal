import java.util.Scanner;

public class RegistrationPage {
    public static void registration() {
        Scanner scanner = new Scanner(System.in);
        boolean restartRegistration = false;

        //Repeat registration if necessary
        do {
            if (restartRegistration) {
                System.out.println("Restarting registration...");
            }
            //Take in user details
            System.out.println("Registration Page");
            System.out.print("Please enter your first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Please enter your last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Please enter your username: ");
            String username = scanner.nextLine();
            System.out.print("Please enter your email: ");
            String email = scanner.nextLine();
            System.out.print("Please enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            String password;
            //Check password matches
            do {
                System.out.print("Please enter your password: ");
                password = scanner.nextLine();
                System.out.print("Please re-enter your password: ");
                String passwordConfirmation = scanner.nextLine();
                if (!password.equals(passwordConfirmation)) {
                    System.out.println("Passwords do not match. Please try again.");
                } else {
                    break;
                }
            } while (true);
            String birthday;
            //Validate birthday format
            while (true) {
                System.out.print("Please enter your birthday (DD-MM-YYYY): ");
                birthday = scanner.nextLine();
                if (isValidDate(birthday)) {
                    break;
                } else {
                    System.out.println("Invalid date format. Please enter a valid date in DD-MM-YYYY format.");
                }
            }
            System.out.print("Do you have dietary requirements or allergies? (Y/N): ");
            String dietaryInput = scanner.nextLine().toUpperCase();
            boolean hasDietaryRequirements = dietaryInput.equals("Y");
            //Create new user
            Users newUser = new Users(firstName, lastName, username, email, age, birthday, password, hasDietaryRequirements);
            boolean registrationSuccessful = newUser.registrationDetails();
            //Confirm registration details
            System.out.print("Are these details correct? (Y/N): ");
            String response = scanner.nextLine().toUpperCase();
            if (response.equalsIgnoreCase("Y")) {
                System.out.println("Registration successful!");
                //Write user details to CSV
                newUser.writeToCSV();
                //Call login page if successful
                if (registrationSuccessful) {
                    System.out.println("Please login");
                    LoginPage.showLogin();
                    //Break login page if details not match
                    break;
                } else {
                    System.out.println("Registration failed. Please try again.");
                    restartRegistration = true;
                }
            } else if (response.equalsIgnoreCase("N")) {
                System.out.println("Registration cancelled.");
                restartRegistration = true;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                restartRegistration = true;
            }
        } while (restartRegistration);
    }

    // Validate date format
    private static boolean isValidDate(String date) {
        return date.matches("\\d{2}-\\d{2}-\\d{4}");
    }
}