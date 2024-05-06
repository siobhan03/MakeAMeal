import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class KoreanHTTPRequests {
    public String sendHttpRequest1() throws Exception {
        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=bibimbap&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request1, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void bibimbapRecipe(){
        try{
            String responseBody = sendHttpRequest1();
            //parse the JSON response
            JSONObject jsonResponse = new JSONObject(responseBody);
            JSONArray hitsArray = jsonResponse.getJSONArray("hits");
            if (hitsArray.length() >= 2) {
                JSONObject fourthHit = hitsArray.getJSONObject(1);
                JSONObject recipeObject = fourthHit.getJSONObject("recipe");

                // Extract specific information from the recipe object
                String recipeLabel = recipeObject.getString("label");
                String recipeUrl = recipeObject.getString("url");

                // Print out the extracted information
                System.out.println("Recipe Label: " + recipeLabel);
                System.out.println("Recipe URL: " + recipeUrl);

                JSONArray ingredientLines = recipeObject.getJSONArray("ingredientLines");
                //loop through array
                System.out.println("Ingredients:");
                for (int i = 0; i < ingredientLines.length(); i++) {
                    System.out.println("- " + ingredientLines.getString(i));
                }
            }
            else {
                System.out.println("Recipe not found.");
            }
            System.out.println("Instructions\n" +
                    "1.Marinate the steak in soy sauce for added flavor.\n" +
                    "2.Cook the rice until it's tender and ready to serve.\n" +
                    "3.Brown the steak in a pan until it's cooked to your liking, then set it aside to rest.\n" +
                    "4.Quickly fry the carrots until they start to soften, followed by the spinach until just wilted, and fry the eggs until the whites are set but the yolks are still runny.\n" +
                    "5.Assemble the bowls by dividing the cooked rice between them, topping with thinly sliced steak, cooked vegetables, and a fried egg on each.\n" +
                    "6.Sprinkle sesame seeds for extra flavor and serve with the sauce on the side. Enjoy mixing everything together before eating!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }

    public String sendHttpRequest2() throws Exception {
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=kimchi%20jjigae&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response2 = HttpClient.newHttpClient().send(request2, HttpResponse.BodyHandlers.ofString());
        return response2.body();

    }

    public void kimchiRecipe(){
        try{
            String responseBody = sendHttpRequest2();
            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(responseBody);
            // Retrieve specific information from the JSON response
            JSONArray hitsArray = jsonResponse.getJSONArray("hits");
            if (hitsArray.length() >= 4) {
                JSONObject fourthHit = hitsArray.getJSONObject(3);
                JSONObject recipeObject = fourthHit.getJSONObject("recipe");

                // Extract specific information from the recipe object
                String recipeLabel = recipeObject.getString("label");
                String recipeUrl = recipeObject.getString("url");

                // Print out the extracted information
                System.out.println("Recipe Label: " + recipeLabel);
                System.out.println("Recipe URL: " + recipeUrl);

                JSONArray ingredientLines = recipeObject.getJSONArray("ingredientLines");
                //loop through array
                System.out.println("Ingredients:");
                for (int i = 0; i < ingredientLines.length(); i++) {
                    System.out.println("- " + ingredientLines.getString(i));
                }
            }
            else {
                System.out.println("Recipe not found.");
            }

            System.out.println("Instructions:\n" +
                    "1.Heat oil in a large pot over medium-high heat.\n" +
                    "2.Add pork slices and season with salt and pepper. Cook until golden and cooked through.\n" +
                    "3.Stir in kimchi and cook for 3-5 minutes until softened.\n" +
                    "4.Add enough water to barely cover the kimchi and pork. Cover and simmer on medium heat for 40-45 minutes.\n" +
                    "5.Turn off the heat and stir in sesame oil and green onion.\n" +
                    "6.Serve with hot white rice. Enjoy!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }

    public String sendHttpRequest3() throws Exception {
        HttpRequest request3 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=bulgogi&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request3, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void bulgogiRecipe(){
        try{
            String responseBody = sendHttpRequest3();
            //parse the JSON response
            JSONObject jsonResponse = new JSONObject(responseBody);
            JSONArray hitsArray = jsonResponse.getJSONArray("hits");
            if (hitsArray.length() >= 1) {
                JSONObject fourthHit = hitsArray.getJSONObject(0);
                JSONObject recipeObject = fourthHit.getJSONObject("recipe");

                // Extract specific information from the recipe object
                String recipeLabel = recipeObject.getString("label");
                String recipeUrl = recipeObject.getString("url");

                // Print out the extracted information
                System.out.println("Recipe Label: " + recipeLabel);
                System.out.println("Recipe URL: " + recipeUrl);

                JSONArray ingredientLines = recipeObject.getJSONArray("ingredientLines");
                //loop through array
                System.out.println("Ingredients:");
                for (int i = 0; i < ingredientLines.length(); i++) {
                    System.out.println("- " + ingredientLines.getString(i));
                }
            }
            else {
                System.out.println("Recipe not found.");
            }
            System.out.println("Instructions\n" +
                    "1.In a large bowl, combine soy sauce, sugar, sesame oil, mirin, onion, garlic, ginger, sesame seeds, and black pepper. Whisk until mixed.\n" +
                    "2.Add the meat to the marinade, cover, and refrigerate for 30 minutes.\n" +
                    "3.Preheat a grill pan or large skillet over high heat.\n" +
                    "4.Remove the meat from the marinade and cook in the pan for a few minutes on each side until browned.\n" +
                    "5.Serve the beef with lettuce, white rice, kimchi, and hot bean paste. Enjoy!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }
}
