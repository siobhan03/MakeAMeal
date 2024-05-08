package Recipes;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONResponse {
    public void parseJSON(String responseBody) {
        try {
            JSONObject jsonResponse = new JSONObject(responseBody);
            JSONArray hitsArray = jsonResponse.getJSONArray("hits");
            if (hitsArray.length() >= 5) {
                JSONObject fourthHit = hitsArray.getJSONObject(4);
                JSONObject recipeObject = fourthHit.getJSONObject("recipe");

                // Extract specific information from the recipe object
                String recipeLabel = recipeObject.getString("label");
                String recipeUrl = recipeObject.getString("url");

                // Print out the extracted information
                System.out.println("Recipe Label: " + recipeLabel);
                System.out.println("Recipe URL: " + recipeUrl);

                JSONArray ingredientLines = recipeObject.getJSONArray("ingredientLines");
                // Loop through array
                System.out.println("Ingredients:");
                for (int i = 0; i < ingredientLines.length(); i++) {
                    System.out.println("- " + ingredientLines.getString(i));
                }
            } else {
                System.out.println("Recipe not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to parse recipe data.");
        }
    }
}
