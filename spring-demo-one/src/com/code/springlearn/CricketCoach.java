package com.code.springlearn;

public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Batting for 30 minutes";
	}
	
	@Override
	public String formTeam(int numPlayers) {
		return "Forming a team with ".concat(Integer.toString(numPlayers)).concat(" cricketers.");
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
