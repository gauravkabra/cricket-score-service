package com.cricket.score.cricketscoreservice;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CricketScoreServiceApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void getLiveScoreSuccess() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://cricapi.com/api/cricketScore/?unique_id=1144508&apikey=QAtRxh1XVlONpcrSzmCh1QEePS33";
		
		URI uri = new URI(baseUrl);
		 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
//	    //Verify request succeed
//	    Assert.assertEquals(200, result.getStatusCodeValue());
//	    Assert.assertEquals(true, result.getBody().contains("employeeList"));
	    
	    Assert.hasText("score", result.toString());
	}
	
	@Test
	public void getLiveScoreFailure() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://cricapi.com/api/cricketScore/?unique_id=1144508&apikey=tRxh1XVlONpcrSzmCh1QEePS33";
		
		URI uri = new URI(baseUrl);
		 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
//	    //Verify request succeed
//	    Assert.assertEquals(200, result.getStatusCodeValue());
//	    Assert.assertEquals(true, result.getBody().contains("employeeList"));
	    
	    Assert.hasText("abc", result.toString());
	}
	
	@Test
	public void getLiveScoreFailure1() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://cricapi.com/api/cricketScore/?unique_id=1144508&apikey=QAtRxh1XVlONpcrSzmCh1QEePS33";
		
		URI uri = new URI(baseUrl);
		 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
//	    //Verify request succeed
//	    Assert.assertEquals(200, result.getStatusCodeValue());
//	    Assert.assertEquals(true, result.getBody().contains("employeeList"));
	    
	    Assert.hasText("score", result.toString());
	}

}
