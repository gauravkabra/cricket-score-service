/**
 * 
 */
package com.cricket.score.cricketscoreservice.bean;

/**
 * @author gakabra
 *
 */
public class CricketScore {
	
	private String match_id;
	private String api_key;
	
	public CricketScore(String match_id, String api_key) {
		super();
		this.match_id = match_id;
		this.api_key = api_key;
	}
	
	public String getMatch_id() {
		return match_id;
	}
	public void setMatch_id(String match_id) {
		this.match_id = match_id;
	}
	public String getApi_key() {
		return api_key;
	}
	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}
	
	
	

}
