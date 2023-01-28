package com.prowings;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Java11HttpClientDemo {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpRequest req = HttpRequest.newBuilder().uri(new URI("http://localhost:8080/employee/103")).build();

		HttpClient client = HttpClient.newBuilder().build();

		HttpResponse<String> response = client.send(req, BodyHandlers.ofString());

		System.out.println(response.body());

	}

}