import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


//switch statement with api calls in each case and ingredient and instruction output
// can I use a setter and getter for each http request and just switch in the variables?
public class GreekHTTPRequests {
    public String sendHttpRequest1() throws Exception {
        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=moussaka&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request1, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void moussakaRecipe(){
        try{
            String responseBody = sendHttpRequest1();
            //parse the JSON response
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
                    "1.Heat a frying pan, fry aubergine slices in olive oil until golden brown and soft. Drain excess oil on a plate lined with kitchen paper.\n" +
                    "2.Heat olive oil in a pot, brown minced meat, set aside. Cook onions with salt until soft, add garlic, herbs, spices, and lamb. Pour in wine, simmer until reduced, then add tomatoes, purée, sugar, and water. Simmer uncovered for 20 mins until thickened.\n" +
                    "3.Preheat oven to 200°C/180°C fan/gas 4. Boil potato slices for 6 mins, then drain and let dry.\n" +
                    "4.Melt butter in a saucepan, stir in flour, then gradually add milk until smooth. Simmer for 3 mins, whisk in Parmesan, a pinch of nutmeg, and season with salt and pepper. Finally, whisk in eggs.\n" +
                    "5.In a baking dish, layer meat sauce, aubergine slices, and potato slices. Pour béchamel sauce over the top. Bake for 50 mins until golden brown. Let it cool for 10 mins before serving.");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }

    public String sendHttpRequest2() throws Exception {
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=chicken%20souvlaki&app_id=2e1230ce&app_key=%20a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response2 = HttpClient.newHttpClient().send(request2, HttpResponse.BodyHandlers.ofString());
        return response2.body();

    }

    public void souvlakiRecipe(){
        try{
            String responseBody = sendHttpRequest2();
            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(responseBody);
            // Retrieve specific information from the JSON response
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
                    "1.Combine finely grated garlic, lemon zest, lemon juice, olive oil, oregano, honey, salt, and pepper in a gallon zip-top bag or baking dish.\n" +
                    "2.Cut chicken into 1-inch pieces and add to the marinade. Massage to coat. Marinate for at least 30 minutes at room temperature or up to 3 hours in the fridge.\n" +
                    "3.Soak skewers if wooden. Slice tomatoes, cucumber, and red onion thinly and arrange on a platter with halved olives.\n" +
                    "4.Thread marinated chicken onto skewers, leaving space between pieces. Discard marinade.\n" +
                    "5.Preheat an outdoor grill for medium-high heat. Oil the grill grates.\n" +
                    "6.Grill chicken skewers until grill marks form and chicken is cooked through (about 4-5 minutes per side).\n" +
                    "7.Grill pitas until warmed through (about 3 minutes).\n" +
                    "8.Serve by placing chicken, vegetables, olives, and tzatziki on pitas and folding in half to eat.");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Recipe not found");
        }
    }

    public String sendHttpRequest3() throws Exception {
        HttpRequest request3 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=Spanakopita&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request3, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void spanakopitaRecipe(){
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
                    "1.Melt butter in a pot on medium heat. Whisk in potato starch, then slowly add milk while whisking until it thickens. Remove from heat, whisk in Parmesan, nutmeg, and salt. Cool in the fridge for 20 mins.\n" +
                    "2.Heat olive oil in a pot, cook shallots and garlic until soft. Add spinach, cook until wilted, then drain excess moisture. If using frozen spinach, cook with shallots and garlic until dry.\n" +
                    "3.Preheat oven to 400°F, brush baking dish with olive oil. Layer matzo, sauce, spinach mixture, Parmesan, feta, and pine nuts. Repeat layers, ending with sauce, Parmesan, and feta on top.\n" +
                    "4.Bake for 30-35 mins until golden brown and matzo softens. Let it rest for 10 mins before slicing.");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }

}

