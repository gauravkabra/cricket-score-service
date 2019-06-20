/**
 * 
 */
package com.cricket.score.cricketscoreservice.bean;

/**
 * @author gakabra
 *
 */
public class CricketLiveScore {
	
	private String statistics;
	private String score;
	private String description;
	private String matchStarted;
	private String team1;
	private String team2;
	private String ttl;
	
	
	public CricketLiveScore(String statistics, String score, String description, String matchStarted, String team1,
			String team2, String ttl) {
		super();
		this.statistics = statistics;
		this.score = score;
		this.description = description;
		this.matchStarted = matchStarted;
		this.team1 = team1;
		this.team2 = team2;
		this.ttl = ttl;
	}
	
	public String getStatistics() {
		return statistics;
	}
	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMatchStarted() {
		return matchStarted;
	}
	public void setMatchStarted(String matchStarted) {
		this.matchStarted = matchStarted;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getTtl() {
		return ttl;
	}
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	@Override
	public String toString() {
		return "CricketLiveScore [statistics=" + statistics + ", score=" + score + ", description=" + description
				+ ", matchStarted=" + matchStarted + ", team1=" + team1 + ", team2=" + team2 + ", ttl=" + ttl + "]";
	}
	
	

}
