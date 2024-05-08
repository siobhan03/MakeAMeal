import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoginPage {
    //File containing user details
    static String fileName = "user_details.csv";
    static File file = new File(fileName);

    //Login page method
    public static void showLogin() {
        Scanner scanner = new Scanner(System.in);
        boolean loginSuccess = false;

        do {
            System.out.println("Login Page");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            // Authenticate user
            Users user = authenticateUser(username, password);
            if (user != null) {
                System.out.println("Login successful! Welcome, " + user.getFirstName());
                loginSuccess = true;
                MealSelection mealSelection = new MealSelection();
                mealSelection.cuisines();
            } else {
                System.out.println("Invalid username or password. Please try again.");
                System.out.print("Do you want to try again? (yes/no): ");
                String tryAgain = scanner.nextLine();
                if (!tryAgain.equalsIgnoreCase("yes")) {
                    System.out.println("Exiting login page.");
                    break;
                }
            }
        } while (!loginSuccess);
    }

    // Authenticate user method
    public static Users authenticateUser(String username, String password) {
        try {
            //Read from file
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] users_data = line.split(",");
                if (users_data.length >= 8) {
                    String storedUsername = users_data[2];
                    String storedPassword = users_data[6];
                    //Check username and password match in file
                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        // Retrieve user details
                        String firstName = users_data[0];
                        String lastName = users_data[1];
                        String birthday = users_data[5];
                        String email = users_data[3];
                        int age = Integer.parseInt(users_data[4]);
                        boolean hasDietaryRequirements = users_data[7].equalsIgnoreCase("Yes");
                        return new Users(firstName, lastName, username, email, age, birthday, password, hasDietaryRequirements);
                    }
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            //Print error message for file reading exception
            System.err.println(e.getMessage());
        }
        //Incorrect username or password
        return null;
    }
}