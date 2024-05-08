import Recipes.*;

import java.util.Scanner;

public class RecipesManager {
    Scanner scanner = new Scanner(System.in);

    public void greek() {
        GreekRecipes greekRecipes = new GreekRecipes();
        System.out.println("Select a recipe you would like to make today:\n" +
                "1.Moussaka - A layered dish made with eggplant, minced meat, tomato sauce, and topped with a creamy béchamel sauce.\n" +
                "2.Souvlaki - Grilled skewers of marinated meat, usually pork, chicken, or lamb, served with pita bread and tzatziki sauce.\n" +
                "3.Spanakopita - A savory pastry filled with spinach, feta cheese, onions, and herbs, wrapped in crispy phyllo dough.");

        int chosenRecipe = scanner.nextInt();
        switch (chosenRecipe) {
            case 1:
                System.out.println("The meal you have chosen to make today is Moussaka");
                greekRecipes.moussakaRecipe();
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Souvlaki");
                greekRecipes.souvlakiRecipe();
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Spanakopita");
                greekRecipes.spanakopitaRecipe();
                break;

        }
    }

    public void italian() {
        ItalianRecipes italianRecipes = new ItalianRecipes();
        System.out.println("Select a recipe you would like to make today:\n" + "1.Spaghetti Carbonara - Pasta tossed in a creamy sauce made with eggs, Pecorino Romano cheese, pancetta or guanciale (cured pork jowl), and black pepper.\n" + "2.Margherita Pizza - A classic pizza topped with tomato sauce, fresh mozzarella cheese, basil leaves, and a drizzle of olive oil.\n" + "3.Osso Buco - Braised veal shanks cooked with vegetables, white wine, and broth, typically served with gremolata (a mixture of lemon zest, garlic, and parsley).");

        int chosenRecipe = scanner.nextInt();

        switch (chosenRecipe) {
            case 1:
                System.out.println("The meal you have chosen to make today is Spaghetti Carbonara");
                italianRecipes.carbonaraRecipe();
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Margherita Pizza");
                italianRecipes.pizzaRecipe();
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Osso Buco");
                italianRecipes.ossoBucoRecipe();
                break;
        }
    }

    public void korean() {
        KoreanRecipes koreanRecipes = new KoreanRecipes();
        System.out.println("Select a recipe you would like to make today:\n" + "1.Bibimbap - A mixed rice dish topped with assorted vegetables, sliced meat (often beef), a fried egg, and spicy gochujang (chili pepper paste) sauce.\n" + "2.Kimchi Jjigae - A spicy stew made with fermented kimchi, tofu, pork or seafood, and various vegetables, served bubbling hot.\n" + "3.Bulgogi - Thinly sliced marinated beef grilled or stir-fried with onions, often served with lettuce leaves for wrapping.");
        int chosenRecipe = scanner.nextInt();
        switch (chosenRecipe) {
            case 1:
                System.out.println("The meal you have chosen to make today is Bibimbap");
                koreanRecipes.bibimbapRecipe();
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Kimchi Jjigae");
                koreanRecipes.kimchiRecipe();
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Bulgogi");
                koreanRecipes.bulgogiRecipe();
                break;
        }
    }

    public void mexican() {
        MexicanRecipes mexicanRecipes = new MexicanRecipes();
        System.out.println("Select a recipe you would like to make today:\n" + "1.Tacos al Pastor - Tacos filled with marinated pork cooked on a vertical rotisserie, typically served with pineapple, onions, cilantro, and salsa.\n" + "2.Enchiladas - Corn tortillas rolled around a filling (such as chicken, cheese, or beans), covered in chili sauce, and baked until bubbly.\n" + "3.Chiles Rellenos - Poblano peppers stuffed with cheese, meat, or beans, coated in egg batter, fried, and served with tomato-based sauce.");
        int chosenRecipe = scanner.nextInt();
        switch (chosenRecipe) {
            case 1:
                System.out.println("The meal you have chosen to make today is Tacos al Pastor");
                mexicanRecipes.tacosRecipe();
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Enchiladas");
                mexicanRecipes.enchiladasRecipe();
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Chiles Rellenos");
                mexicanRecipes.chilesRellenosRecipe();
                break;
        }
    }

    public void thai() {
        ThaiRecipes thaiRecipes = new ThaiRecipes();
        System.out.println("Select a recipe you would like to make today:\n" + "1.Pad Thai - Stir-fried rice noodles with eggs, tofu, shrimp or chicken, bean sprouts, peanuts, and a tangy tamarind sauce.\n" + "2.Green Curry (Gaeng Keow Wan) - A fragrant curry made with green curry paste, coconut milk, chicken or beef, eggplant, bamboo shoots, and Thai basil.\n" + "3.Tom Yum Goong - A spicy and sour soup made with shrimp, mushrooms, lemongrass, galangal, lime leaves, and chili peppers.");
        int chosenRecipe = scanner.nextInt();
        switch (chosenRecipe) {
            case 1:
                System.out.println("The meal you have chosen to make today is Pad Thai");
                thaiRecipes.padThaiRecipe();
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Green Curry");
                thaiRecipes.greenCurryRecipe();
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Tom Yum Goong");
                thaiRecipes.tomYumGoongRecipe();
                break;
        }
    }

}
