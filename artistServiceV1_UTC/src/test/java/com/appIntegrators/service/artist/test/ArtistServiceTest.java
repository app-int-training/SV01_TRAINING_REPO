package com.appIntegrators.service.artist.test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class ArtistServiceTest extends FunctionalTestCase {

	/**
	 * The purpose of this method is to load the flow files that are required
	 * for unit testing.
	 * 
	 * Add all flow files using comma separated format for functional test case
	 * to load them for testing. Example: return
	 * "artist.xml, artist1.xml, anotherFlow.xml";
	 */
	@Override
	protected String getConfigFile() {
		return "artist.xml";
	}

	/**
	 * The purpose of this method is to unit test the artist-main flow basic
	 * success scenario. This method directly invokes the artist-main flow and
	 * expects the following: a) Output type is of type "application/json" b)
	 * Output json from Http service is: {'artistId': '98765', 'firstName':
	 * 'Sam', 'lastName': '', 'artistName':'Cooke', 'receivedDate':'2011-05-06
	 * 11:04:52.0'}
	 */
	@Test
	public void testArtistForValidInput() throws Exception {
		// MuleEvent event = runFlow("artist-main"
		// ,"http://localhost:9091/api//123456");
		String serverURL = "http://localhost:9091/api/123456";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(serverURL);
		httpGet.addHeader("User-Agent", "Mozilla/5.0");

		CloseableHttpResponse httpResponse = httpClient.execute(httpGet);

		System.out.println("GET Response Status:: "
				+ httpResponse.getStatusLine().getStatusCode());

		int httpResponseStatus = httpResponse.getStatusLine().getStatusCode();
		assertEquals(200, httpResponseStatus);

		System.out
				.println("Got successful response from Server, proceeding to assert response data...");

		// Further below to add...
		/*
		 * 1) Get response data (input stream) from HttpResponse's HttpEntity 2)
		 * Get String data from input stream which will be in JSON format 3)
		 * Assert using Test Data that you expect using assertEquals(
		 * resultJSONExpected, <<data from input stream>> );
		 */
		HttpEntity entity = httpResponse.getEntity();
		String inputStream = EntityUtils.toString(entity);
		String actualData = StringUtils.deleteWhitespace(inputStream);
		System.out.println(" ---Actual Data--- " + actualData);
		String expected = "{\"artistId\": \"123456\",\"firstName\": \"Sam\",\"lastName\": \"\",\"artistName\": \"Cooke\",\"receivedDate\": \"2011-05-06 11:04:52.0\"}";
		String expectedData = StringUtils.deleteWhitespace(expected);
		System.out.println(" ---Expected Data--- " + expectedData);
		assertEquals(expectedData, actualData);
	}
}
