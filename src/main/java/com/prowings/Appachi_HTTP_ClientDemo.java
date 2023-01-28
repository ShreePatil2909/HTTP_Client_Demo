package com.prowings;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Appachi_HTTP_ClientDemo {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		CloseableHttpClient client = HttpClients.createDefault();

//		HttpGet get = new HttpGet("http://localhost:8080/employee");
//
//		CloseableHttpResponse response = client.execute(get);
//
//		String res = EntityUtils.toString(response.getEntity());
//
//		System.out.println(res);

		HttpPost post = new HttpPost("http://localhost:8080/employee");

		final String json = "{\"id\":107,\"name\":\"sham\"}";

		final StringEntity entity = new StringEntity(json);

		post.setHeader("content-type", "application/json");
		post.setEntity(entity);
		
		CloseableHttpResponse postResponse = client.execute(post);
		String postRes = EntityUtils.toString(postResponse.getEntity());
		System.out.println(postRes);

	}
}
