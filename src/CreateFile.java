import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void file() {
        //Create file named user_details.csv
        try {
            File file = new File("user_details.csv");
            //Check if file already exists
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            //Error handling
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

