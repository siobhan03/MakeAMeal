import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {

        Home home = new Home();
        home.menu();

        mealSelection mealSelection = new mealSelection();
        mealSelection.cuisines();

    }
}
