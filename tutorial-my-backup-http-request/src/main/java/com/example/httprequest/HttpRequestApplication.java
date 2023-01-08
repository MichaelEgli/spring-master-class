package com.example.httprequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

@SpringBootApplication
public class HttpRequestApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(HttpRequestApplication.class, args);
		System.out.println("Eglis http request experiment");

		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://swapi.dev/api/"))
				.GET()
				.build();

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		String responseBody = response.body();
		int responseStatusCode = response.statusCode();

		System.out.println("httpGetRequest: " + responseBody);
		System.out.println("httpGetRequest status code: " + responseStatusCode);

	}

}
