import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {

        //CreateFile.file();

       Home home = new Home();
       home.menu();

        MealSelection mealSelection =  new MealSelection();
        mealSelection.cuisines();

    }
}
