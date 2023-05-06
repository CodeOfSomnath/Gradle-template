package demo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {

  public static void main(String[] args) throws Exception {
    String url = "https://download.java.net/java/early_access/panama/docs/api/java.net.http/java/net/http/package-summary.html";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .GET()
        .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println("Response code: " + response.statusCode());
    System.out.println("Response body: " + response.body());
  }
}
