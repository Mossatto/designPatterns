package ilp037.creational.builder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpBuilderApp {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                .uri(new URI("https://viacep.com.br/ws/06233070/json"))
                .version(HttpClient.Version.HTTP_2)
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newBuilder()
                                        .followRedirects(HttpClient.Redirect.ALWAYS)
                                        .build()
                                        .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}
