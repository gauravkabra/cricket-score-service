package com.cricket.score.cricketscoreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CricketScoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketScoreServiceApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CricketScoreServiceApplication.class);
	}

}
