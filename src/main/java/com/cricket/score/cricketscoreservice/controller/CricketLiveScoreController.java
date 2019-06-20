package com.cricket.score.cricketscoreservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.cricket.score.cricketscoreservice.constant.Constants;

@Controller
public class CricketLiveScoreController {

	private Logger logger = LoggerFactory.getLogger(CricketLiveScoreController.class);

	@GetMapping("/getLiveScore/{unique_id}")
	public HttpEntity<String> liveScore(@PathVariable String unique_id) {

		RestTemplate restTemplate = new RestTemplate();
		logger.info("Created the Rest Template -->>");
		
		// Method #1
		//final String uri = "http://cricapi.com/api/cricketScore/?unique_id="+unique_id+"&apikey="+Constants.API_KEY;
		//String result = restTemplate.getForObject(uri, String.class);
		//return result;
		
		// Method #2
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(Constants.URL)
				.queryParam("unique_id", unique_id)
				.queryParam("apikey", Constants.API_KEY);
		
		HttpEntity<?> entity = new HttpEntity<>(headers);
		
		// If you need to manipulate string use below get function to interact external REST
		// String response1 = restTemplate.getForObject(builder.build().encode().toUri(), String.class);
		// return response1;
		
		logger.info("Sending get request -->>");
		HttpEntity<String> response = restTemplate.exchange(builder.toUriString(),
					HttpMethod.GET, entity, String.class);
		logger.info("Received response -->>", response.toString());
		
		return response;
	}
}
