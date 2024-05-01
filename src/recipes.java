import java.util.Scanner;
public class recipes {
    Scanner scanner = new Scanner(System.in);
    private int chosenRecipe;


    //add default to all switch statements
    public void greek(){
        HttpRequestExample httpRequestExample = new HttpRequestExample();

        System.out.println("Select a recipe you would like to make today:\n" +
                "1.Moussaka - A layered dish made with eggplant, minced meat, tomato sauce, and topped with a creamy béchamel sauce.\n" +
                "2.Souvlaki - Grilled skewers of marinated meat, usually pork, chicken, or lamb, served with pita bread and tzatziki sauce.\n" +
                "3.Spanakopita - A savory pastry filled with spinach, feta cheese, onions, and herbs, wrapped in crispy phyllo dough.");

         chosenRecipe = scanner.nextInt();
        switch(chosenRecipe){
            case 1:
                System.out.println("The meal you have chosen to make today is Moussaka");
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Souvlaki");
                httpRequestExample.greekRecipes();
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Spanakopita");
                break;
        }
        //switch statement here with if loop then print text not number
    }
    public int getChosenRecipe() {
        return chosenRecipe;
    }

    public void italian(){
        System.out.println("Select a recipe you would like to make today:\n" +
                "1.Spaghetti Carbonara - Pasta tossed in a creamy sauce made with eggs, Pecorino Romano cheese, pancetta or guanciale (cured pork jowl), and black pepper.\n" +
                "2.Margherita Pizza - A classic pizza topped with tomato sauce, fresh mozzarella cheese, basil leaves, and a drizzle of olive oil.\n" +
                "3.Osso Buco - Braised veal shanks cooked with vegetables, white wine, and broth, typically served with gremolata (a mixture of lemon zest, garlic, and parsley).");

        int chosenRecipe = scanner.nextInt();

        switch(chosenRecipe){
            case 1:
                System.out.println("The meal you have chosen to make today is Spaghetti Carbonara");
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Margherita Pizza");
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Osso Buco");
                break;
                }
    }

    public void korean(){
        System.out.println("Select a recipe you would like to make today:\n" +
                "1.Bibimbap - A mixed rice dish topped with assorted vegetables, sliced meat (often beef), a fried egg, and spicy gochujang (chili pepper paste) sauce.\n" +
                "2.Kimchi Jjigae - A spicy stew made with fermented kimchi, tofu, pork or seafood, and various vegetables, served bubbling hot.\n" +
                "3.Bulgogi - Thinly sliced marinated beef grilled or stir-fried with onions, often served with lettuce leaves for wrapping.");
        int chosenRecipe = scanner.nextInt();
        switch(chosenRecipe) {
            case 1:
                System.out.println("The meal you have chosen to make today is Bibimbap");
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Kimchi Jjigae");
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Bulgogi");
                break;
        }
    }


    public void mexican(){
        System.out.println("Select a recipe you would like to make today:\n" +
                "1.Tacos al Pastor - Tacos filled with marinated pork cooked on a vertical rotisserie, typically served with pineapple, onions, cilantro, and salsa.\n" +
                "2.Enchiladas - Corn tortillas rolled around a filling (such as chicken, cheese, or beans), covered in chili sauce, and baked until bubbly.\n" +
                "3.Chiles Rellenos - Poblano peppers stuffed with cheese, meat, or beans, coated in egg batter, fried, and served with tomato-based sauce.");
        int chosenRecipe = scanner.nextInt();
        switch(chosenRecipe) {
            case 1:
                System.out.println("The meal you have chosen to make today is Tacos al Pastor");
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Enchiladas");
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Chiles Rellenos");
                break;
        }
    }

    public void thai(){
        System.out.println("Select a recipe you would like to make today:\n" +
                "1.Pad Thai - Stir-fried rice noodles with eggs, tofu, shrimp or chicken, bean sprouts, peanuts, and a tangy tamarind sauce.\n" +
                "2.Green Curry (Gaeng Keow Wan) - A fragrant curry made with green curry paste, coconut milk, chicken or beef, eggplant, bamboo shoots, and Thai basil.\n" +
                "3.Tom Yum Goong - A spicy and sour soup made with shrimp, mushrooms, lemongrass, galangal, lime leaves, and chili peppers.");
        int chosenRecipe = scanner.nextInt();
        switch(chosenRecipe) {
            case 1:
                System.out.println("The meal you have chosen to make today is Pad Thai");
                break;
            case 2:
                System.out.println("The meal you have chosen to make today is Green Curry");
                break;
            case 3:
                System.out.println("The meal you have chosen to make today is Tom Yum Goong");
                break;
        }
    }
}

