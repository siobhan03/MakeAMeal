import java.io.FileWriter;
import java.io.IOException;

public class Users {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private int age;
    private String birthday;
    private String password;
    private boolean hasDietaryRequirements;


    // Constructor to initialise user details
    public Users(String firstName, String lastName, String username, String email, int age, String birthday, String password, boolean hasDietaryRequirements) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age;
        this.hasDietaryRequirements = hasDietaryRequirements;
    }

    //Getter and setters for user details
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //print user details
    public boolean registrationDetails() {
        System.out.println("Name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthday);
        System.out.println("Dietary requirements or allergies?: " + hasDietaryRequirements);
        return true;
    }


    //Write user details to CSV file
    public void writeToCSV() {
        try {
            FileWriter writer = new FileWriter("user_details.csv", true);
            writer.write(firstName + "," + lastName + "," + username + "," + email + "," + age + "," + birthday + "," + password + "," + (hasDietaryRequirements ? "Yes" : "No") + "\n");
            writer.close();
            System.out.println("User details written to CSV file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to CSV file: " + e.getMessage());
        }
    }
}

