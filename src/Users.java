import java.util.Scanner;

public class Users {
    private String username;
    private String email;
    private String password;

    //getter methods
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

    // Method to validate login
    public boolean login() {
        // In a real-world scenario, you would perform actual validation here
        // For simplicity, let's assume all logins are successful
        return true;
    }

    // Method to save user details (registration)
    public boolean register() {
        // In a real-world scenario, you would save user details to a database or file
        // For simplicity, let's assume all registrations are successful
        return true;
    }
}

