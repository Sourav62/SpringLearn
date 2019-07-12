package com.code.springlearn;

public class BasketballCoach implements Coach {

	//Define a private field for the dependency
	private FortuneService fortuneService;
	
	//Creating a constructor for dependency injection
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do Suicide Laps";
	}

	@Override
	public String formTeam(int numPlayers) {
		return "Heads Up!! Forming a team with ".concat(Integer.toString(numPlayers)).concat(" players.");
	}

	@Override
	public String getFortune() {
		
		//Use fortuneService to getFortune()
		return fortuneService.getFortune();
	}
	

}
