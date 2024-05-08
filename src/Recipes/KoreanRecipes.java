package Recipes;

public class KoreanRecipes {
    private final HTTPRequests httpRequests;
    private final JSONResponse jsonResponse;

    public KoreanRecipes() {
        this.httpRequests = new HTTPRequests();
        this.jsonResponse = new JSONResponse();
    }

    public void bibimbapRecipe() {
        try {
            String responseBody = httpRequests.sendGetRequest("https://api.edamam.com/api/recipes/v2?type=public&q=bibimbap&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664");
            jsonResponse.parseJSON(responseBody);
            System.out.println("Instructions\n" +
                    "1.Marinate the steak in soy sauce for added flavor.\n" +
                    "2.Cook the rice until it's tender and ready to serve.\n" +
                    "3.Brown the steak in a pan until it's cooked to your liking, then set it aside to rest.\n" +
                    "4.Quickly fry the carrots until they start to soften, followed by the spinach until just wilted, and fry the eggs until the whites are set but the yolks are still runny.\n" +
                    "5.Assemble the bowls by dividing the cooked rice between them, topping with thinly sliced steak, cooked vegetables, and a fried egg on each.\n" +
                    "6.Sprinkle sesame seeds for extra flavor and serve with the sauce on the side. Enjoy mixing everything together before eating!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to fetch or parse recipe.");
        }
    }

    public void kimchiRecipe() {
        try {
            String responseBody = httpRequests.sendGetRequest("https://api.edamam.com/api/recipes/v2?type=public&q=kimchi%20jjigae&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664");
            jsonResponse.parseJSON(responseBody);
            System.out.println("Instructions:\n" +
                    "1.Heat oil in a large pot over medium-high heat.\n" +
                    "2.Add pork slices and season with salt and pepper. Cook until golden and cooked through.\n" +
                    "3.Stir in kimchi and cook for 3-5 minutes until softened.\n" +
                    "4.Add enough water to barely cover the kimchi and pork. Cover and simmer on medium heat for 40-45 minutes.\n" +
                    "5.Turn off the heat and stir in sesame oil and green onion.\n" +
                    "6.Serve with hot white rice. Enjoy!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Recipe not found");
        }
    }


    public void bulgogiRecipe() {
        try {
            String responseBody = httpRequests.sendGetRequest("https://api.edamam.com/api/recipes/v2?type=public&q=bulgogi&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664");
            jsonResponse.parseJSON(responseBody);
            System.out.println("Instructions\n" +
                    "1.In a large bowl, combine soy sauce, sugar, sesame oil, mirin, onion, garlic, ginger, sesame seeds, and black pepper. Whisk until mixed.\n" +
                    "2.Add the meat to the marinade, cover, and refrigerate for 30 minutes.\n" +
                    "3.Preheat a grill pan or large skillet over high heat.\n" +
                    "4.Remove the meat from the marinade and cook in the pan for a few minutes on each side until browned.\n" +
                    "5.Serve the beef with lettuce, white rice, kimchi, and hot bean paste. Enjoy!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }
}
