package com.hari.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;

public class servicehhtp {

	public static void main(String[] args) {
		String restURL = null;

		try {

			HttpUriRequest request = new HttpGet(restURL);

			// send the response or execute the request

			HttpResponse httpResponse = HttpClientBuilder.create().build()
					.execute(request);

			Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(),
					HttpStatus.SC_OK);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
