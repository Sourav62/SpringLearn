package com.code.springlearn;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a Lap";
	}

	@Override
	public String formTeam(int numPlayers) {
		return "Track Team Finalized. Forming a team with ".concat(Integer.toString(numPlayers)).concat(" athletes.");
	}

	@Override
	public String getFortune() {
		return "Just Do It: "+fortuneService.getFortune();
	}
}
