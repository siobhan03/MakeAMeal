import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ItalianHTTPRequests {
    public String sendHttpRequest1() throws Exception {
        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=Spaghetti%20Carbonara&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request1, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void carbonaraRecipe(){
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
                    "1.Boil a large pot of water for pasta.\n" +
                    "2.Cook bacon in a skillet until crisp, then transfer to a paper-towel-lined plate.\n" +
                    "3.Salt the boiling water, add pasta, and cook until al dente.\n" +
                    "4.In a large bowl, whisk together eggs, Parmesan, and half-and-half.\n" +
                    "5.Drain pasta, leaving some water clinging to it.\n" +
                    "6.Quickly add hot pasta to the egg mixture.\n" +
                    "7.Add bacon, salt, and pepper, then toss to combine (the heat from the pasta will cook the eggs).\n" +
                    "8.Serve immediately, sprinkled with additional Parmesan cheese.");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }

    public String sendHttpRequest2() throws Exception {
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=margarita%20pizza&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response2 = HttpClient.newHttpClient().send(request2, HttpResponse.BodyHandlers.ofString());
        return response2.body();

    }

    public void pizzaRecipe(){
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
                    "1.Preheat oven to 230°C.\n" +
                    "2.Place tomatoes in a bowl, cover with boiling water, let stand for 1 minute, then drain and rinse in cold water to peel away the skins.\n" +
                    "3.Roughly chop the tomatoes and mix with chopped oregano, garlic, and oil. Season with salt and pepper. If tomatoes are very juicy, you can strain off some juice.\n" +
                    "4.Roll out pizza dough into a 30-centimeter round on a baking sheet.\n" +
                    "5.Spread tomato mixture over the dough, leaving a border.\n" +
                    "6.Place sliced mozzarella and basil on top.\n" +
                    "7.Drizzle olive oil over the pizza.\n" +
                    "8.Bake at 230°C for 10 to 14 minutes until cheese is bubbly and crust is slightly browned.");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Recipe not found");
        }
    }

    public String sendHttpRequest3() throws Exception {
        HttpRequest request3 = HttpRequest.newBuilder()
                .uri(URI.create("https://api.edamam.com/api/recipes/v2?type=public&q=osso%20buco&app_id=2e1230ce&app_key=a5fe539645c14033c6f0b5e714f7e664"))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request3, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void ossoBucoRecipe(){
        try{
            String responseBody = sendHttpRequest3();
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
                    "1.Preheat oven to 175°C.\n" +
                    "2.Heat vegetable oil in a large Dutch oven over medium-low heat until very hot.\n" +
                    "3.Place flour in a shallow dish. Season veal shanks with salt and pepper, then dredge in flour, shaking off excess.\n" +
                    "4.Add shanks to the Dutch oven in batches, cooking until browned on all sides, about 10 to 15 minutes. Remove shanks and set aside.\n" +
                    "5.Add onion, carrots, celery, and leek to the Dutch oven; cook until softened and lightly browned, about 8 to 10 minutes.\n" +
                    "6.Add bay leaf, thyme, oregano, tomatoes, wine, and stock. Return veal shanks to the Dutch oven and bring to a simmer.\n" +
                    "7.Cover and transfer to the oven; cook until meat is very tender, about 2 1/2 hours, checking occasionally to ensure the liquid is still simmering.\n" +
                    "8.Remove from oven and transfer shanks to a platter; cover to keep warm.\n" +
                    "9.Place Dutch oven over medium heat; simmer until sauce is thickened, about 15 minutes. Season with salt and pepper.\n" +
                    "10.Return shanks to Dutch oven to heat through and coat with sauce. Sprinkle with chopped parsley and lemon zest before serving.");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to invoke rest method");
        }
    }
}

