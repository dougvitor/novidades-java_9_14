package br.com.alura.http2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TesteHTTP2 {
	
	//Novidades do Java 11 - HTTP/2 Client API.
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest
								.newBuilder(new URI("https://www.casadocodigo.com.br"))
								.GET()
								.build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		System.out.println(response.statusCode());
		System.out.println(response.body());
		System.out.println(response.version());
	}

}
