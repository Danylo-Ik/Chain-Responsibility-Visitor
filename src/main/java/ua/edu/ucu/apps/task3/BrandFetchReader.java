package ua.edu.ucu.apps.task3;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;

public class BrandFetchReader {
    public static final String BRAND_URL = "https://api.brandfetch.io/v2/brands/";
    public static final String API_KEY = "";
    
    @SneakyThrows
    public Company fetch(String companyName) {
        HttpClient client = HttpClient.newBuilder().build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(new URI(BRAND_URL + companyName))
                .header("Authorization", "Bearer " + API_KEY)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response.body(), Company.class);
    }
}
