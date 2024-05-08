package Recipes;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTPRequests {
    private final HttpClient httpClient;

    // Constructor to initialise the HttpClient object
    public HTTPRequests() {
        this.httpClient = HttpClient.newHttpClient();
    }

    // Method to send a GET request to the specified URL and retrieve the response body
    public String sendGetRequest(String url) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                //Pass url in to request
                .uri(URI.create(url))
                //Specify method type - GET
                .GET()
                .build();
        //Send request and return response as a string
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
