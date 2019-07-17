package com.code.springlearn;

public class CricketCoach implements Coach{

	
	
	private FortuneService fortuneService;
	
	//Create a no-arg constructor
	
	public CricketCoach() {
		System.out.println("Inside the constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



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
		return fortuneService.getFortune();
	}
}
