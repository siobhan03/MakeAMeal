import java.util.Scanner;

public class MealSelection {
    public void cuisines() {
        Scanner selection = new Scanner(System.in);
        System.out.println("Below is a list of cuisines you can choose from.\n" + "1. Greek\n2. Italian\n3. Korean\n4. Mexican\n5. Thai\n" + "Please select a number:");

        int preferredCuisine = selection.nextInt();
        RecipesManager recipes = new RecipesManager();

        switch (preferredCuisine) {
            case 1:
                System.out.println("Greek");
                recipes.greek();
                break;
            case 2:
                System.out.println("Italian");
                recipes.italian();
                break;
            case 3:
                System.out.println("Korean");
                recipes.korean();
                break;
            case 4:
                System.out.println("Mexican");
                recipes.mexican();
                break;
            case 5:
                System.out.println("Thai");
                recipes.thai();
                break;
        }
    }
}
