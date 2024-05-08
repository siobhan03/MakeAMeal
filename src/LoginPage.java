import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoginPage {
    static String fileName = "user_details.csv";
    static File file = new File(fileName);


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

    // Method to authenticate user
    public static Users authenticateUser(String username, String password) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String storedUsername = data[2];
                String storedPassword = data[6]; // Assuming password is stored in the third column
                if (storedUsername.equals(username) && storedPassword.equals(password)) {
                    // Retrieve user details
                    String firstName = data[0];
                    String lastName = data[1];
                    String birthday = data[5];
                    String email = data[3];
                    int age = Integer.parseInt(data[4]);
                    boolean hasDietaryRequirements = data[7].equalsIgnoreCase("Yes");

                    return new Users(firstName, lastName, username, email, age, birthday, password, hasDietaryRequirements);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null; // User not found or password incorrect
    }
    }