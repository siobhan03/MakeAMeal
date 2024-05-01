import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        //userManager.addUser(username, password);
        LoginManager loginManager = new LoginManager(userManager);
        Scanner scanner = new Scanner(System.in);

        // Prompt user to create a new account
        System.out.println("User Registration");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        userManager.addUser(username, password);

        // Prompt user to log in
        System.out.println("\nUser Login");
        loginManager.promptLogin();

        mealSelection mealSelection = new mealSelection();
        mealSelection.cuisines();


        //HttpRequestExample httpRequestExample = new HttpRequestExample();
        //httpRequestExample.greekRecipes();

        //ApiSwitch apiSwitch = new ApiSwitch();
        //apiSwitch.callGreekRecipes();

        }
    }
