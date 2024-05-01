import org.json.JSONArray;
import org.json.JSONObject;

/*public class RecipeAPI {
    public void greekRecipes(){
        try {
            String responseBody = sendHttpRequest();
            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(responseBody);
            // Retrieve specific information from the JSON response
            JSONArray hitsArray = jsonResponse.getJSONArray("hits");
            if (hitsArray.length() >= 5) {
                JSONObject thirtyThirdHit = hitsArray.getJSONObject(4);
                JSONObject recipeObject = thirtyThirdHit.getJSONObject("recipe");

                // Extract specific information from the recipe object
                String recipeLabel = recipeObject.getString("label");
                String recipeUrl = recipeObject.getString("url");

                // Print out the extracted information
                System.out.println("Recipe Label: " + recipeLabel);
                System.out.println("Recipe URL: " + recipeUrl);

                JSONArray ingredientLines = recipeObject.getJSONArray("ingredientLines");
                //loop through array
                for (int i = 0; i < ingredientLines.length(); i++) {
                    System.out.println("- " + ingredientLines.getString(i));
                }

            } else {
                System.out.println("Not enough recipes found.");
            }

            System.out.println("Instructions:\n" +
                    "1.Combine finely grated garlic, lemon zest, lemon juice, olive oil, oregano, honey, salt, and pepper in a gallon zip-top bag or baking dish.\n" +
                    "2.Cut chicken into 1-inch pieces and add to the marinade. Massage to coat. Marinate for at least 30 minutes at room temperature or up to 3 hours in the fridge.\n" +
                    "3.Soak skewers if wooden. Slice tomatoes, cucumber, and red onion thinly and arrange on a platter with halved olives.\n" +
                    "4.Thread marinated chicken onto skewers, leaving space between pieces. Discard marinade.\n" +
                    "5.Preheat an outdoor grill for medium-high heat. Oil the grill grates.\n" +
                    "6.Grill chicken skewers until grill marks form and chicken is cooked through (about 4-5 minutes per side).\n" +
                    "7.Grill pitas until warmed through (about 3 minutes).\n" +
                    "8.Serve by placing chicken, vegetables, olives, and tzatziki on pitas and folding in half to eat.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/
