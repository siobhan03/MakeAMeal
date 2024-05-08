package Recipes;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONResponse {
    //Method to parse JSON response and get recipe information
    public void parseJSON(String responseBody) {
        try {
            JSONObject jsonResponse = new JSONObject(responseBody);
            //Get the "hits" array from the JSON response
            JSONArray hitsArray = jsonResponse.getJSONArray("hits");
            //Check if the hits array is not empty
            if (!hitsArray.isEmpty()) {
                //Get the first recipe from the hits array
                JSONObject firstHit = hitsArray.getJSONObject(0);
                //Get the recipe object from the first hit
                JSONObject recipeObject = firstHit.getJSONObject("recipe");

                //Extract specific information from the recipe object
                String recipeLabel = recipeObject.getString("label");
                String recipeUrl = recipeObject.getString("url");

                //Print out the extracted information
                System.out.println("Recipe Label: " + recipeLabel);
                System.out.println("Recipe URL: " + recipeUrl);

                JSONArray ingredientLines = recipeObject.getJSONArray("ingredientLines");
                //Loop through the ingredientLines array and print each ingredient
                System.out.println("Ingredients:");
                for (int i = 0; i < ingredientLines.length(); i++) {
                    System.out.println("- " + ingredientLines.getString(i));
                }
            } else {
                System.out.println("Recipe not found.");
            }

            //Error handling
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to parse recipe data.");
        }
    }
}
