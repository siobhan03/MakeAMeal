package Recipes;

public class ThaiRecipes {
    private final HTTPRequests httpRequests;
    private final JSONResponse jsonResponse;

    //Constructor to initialise HTTPRequests and JSONResponse objects
    public ThaiRecipes() {
        this.httpRequests = new HTTPRequests();
        this.jsonResponse = new JSONResponse();
    }

    public void padThaiRecipe() {
        try {
            //Pass URL to API call for GET request
            String responseBody = httpRequests.sendGetRequest("https://api.edamam.com/api/recipes/v2?type=public&q=pad%20thai&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664");
            //Parse JSON response
            jsonResponse.parseJSON(responseBody);
            System.out.println("Instructions\n" +
                    "1.Cook noodles in boiling water for 7-10 minutes until tender. Drain and set aside.\n" +
                    "2.Heat vegetable oil in a skillet over medium heat. Add garlic and cook until tender.\n" +
                    "3.Lightly whisk eggs and add to skillet, cooking until just solidified but still moist. Remove skillet from heat.\n" +
                    "4.Mix soy sauce, lime juice, sugar, fish sauce, and red pepper flakes in a small bowl. Pour into skillet with scrambled eggs. Add noodles and toss to coat.\n" +
                    "5.Sprinkle green onions, cilantro, and peanuts over noodles. Toss lightly to combine. Serve warm. Enjoy!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to fetch recipe");
        }
    }

    public void greenCurryRecipe() {
        try {
            //Pass URL to API call for GET request
            String responseBody = httpRequests.sendGetRequest("https://api.edamam.com/api/recipes/v2?type=public&q=green%20curry&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664");
            //Parse JSON response
            jsonResponse.parseJSON(responseBody);
            System.out.println("Instructions:\n" +
                    "1.Make the avocado sauce by blending all ingredients in a food processor until creamy. Season with salt and pepper.\n" +
                    "2.Cook rice noodles according to package directions, then drain and rinse with cold water.\n" +
                    "3.Heat coconut oil in a skillet over medium-high heat. Sauté onions and peppers until tender, about 5-7 minutes. Add zucchini noodles and sauté until crisp-tender. Season with salt.\n" +
                    "4.Add cooked rice noodles to the skillet with the vegetables. Pour the avocado sauce over the noodles and toss to combine.\n" +
                    "5.Serve garnished with basil, sriracha, crushed red pepper flakes, and lime wedges. Enjoy!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to fetch recipe");
        }
    }


    public void tomYumGoongRecipe() {
        try {
            //Pass URL to API call for GET request
            String responseBody = httpRequests.sendGetRequest("https://api.edamam.com/api/recipes/v2?type=public&q=tom%20yum%20goong&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664");
            //Parse JSON response
            jsonResponse.parseJSON(responseBody);
            System.out.println("Instructions\n" +
                    "1.Heat 1-2 tbsp red curry paste in a large saucepan over medium-high heat for 30 seconds until fragrant.\n" +
                    "2.Add 6 cups chicken-style liquid stock and simmer for 6-8 minutes.\n" +
                    "3.Add 16 raw king prawns and cook for 2-3 minutes until cooked through.\n" +
                    "4.Remove from heat and stir in 1 tbsp lime juice, 3 tsp fish sauce, and sliced green onions.\n" +
                    "5.Season with salt and pepper, then serve sprinkled with fresh coriander leaves. Enjoy!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to fetch recipe");
        }
    }
}
