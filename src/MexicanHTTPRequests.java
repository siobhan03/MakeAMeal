import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//create function that holds recipe method and make the json object numbers the same so 1 & 0
// then add switch statements going into each case
public class MexicanHTTPRequests {
    public String sendHttpRequest1() throws Exception {
        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=tacos%20al%20pastor&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request1, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void tacosRecipe(){
        try{
            String responseBody = sendHttpRequest1();
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
                    "1.Rehydrate chiles in boiled water, then soak.\n" +
                    "2.Prepare pineapple: Peel, slice, and reserve some for roasting.\n" +
                    "3.Blend chiles with pineapple, garlic, spices, vinegar, and oil for marinade.\n" +
                    "4.Marinate pork for at least 3 hours.\n" +
                    "5.Sear pork in a hot pan, then bake with marinade.\n" +
                    "6.Roast reserved pineapple with oil, chiles, and salt.\n" +
                    "7.Warm tortillas.\n" +
                    "8.Slice pork and assemble tacos with pineapple, tortillas, onions, cilantro, and lime wedges. Enjoy!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }

    public String sendHttpRequest2() throws Exception {
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=enchiladas&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response2 = HttpClient.newHttpClient().send(request2, HttpResponse.BodyHandlers.ofString());
        return response2.body();

    }

    public void enchiladasRecipe(){
        try{
            String responseBody = sendHttpRequest2();
            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(responseBody);
            // Retrieve specific information from the JSON response
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
            System.out.println("Instructions:\n" +
                    "1.Preheat oven to 175°C.\n" +
                    "2.Lightly fry corn tortillas in oil until softened.\n" +
                    "3.Make enchilada sauce: Sauté onion and garlic, then add crushed tomatoes, green chiles, water, and oregano. Simmer, adjusting seasoning as needed.\n" +
                    "4.Roll tortillas with shredded cheese and place seam-side down in a greased casserole dish.\n" +
                    "5.Pour sauce over tortillas, ensuring they're covered. Top with remaining cheese.\n" +
                    "6.Bake for 10-15 minutes until cheese melts.\n" +
                    "7.Serve with sliced iceberg lettuce sprinkled with apple cider vinegar and salt. Garnish with cilantro and sour cream. Enjoy!");
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

    public void chilesRellenosRecipe(){
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
                    "1.Preheat oven to 190°C (375°F). Grease a 9x9 inch casserole dish.\n" +
                    "2.Rinse chiles to remove seeds, then drain on paper towels.\n" +
                    "3.Layer chiles on the bottom of the casserole dish. Top with a mixture of cheeses, reserving ½ cup for the top.\n" +
                    "4.Whisk together half and half, eggs, flour, salt, and cumin. Pour over the cheese.\n" +
                    "5.Drizzle the top with tomato sauce and sprinkle with reserved cheese.\n" +
                    "6.Bake for 45-60 minutes until browned and cooked in the center.\n" +
                    "7.Cool for a few minutes before slicing. Enjoy!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }
}
