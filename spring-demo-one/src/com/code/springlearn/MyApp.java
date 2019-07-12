package com.code.springlearn;

public class MyApp {

	public static void main(String[] args) {
		//Create Coach object
		
		Coach cricCoach = new CricketCoach();
		Coach trackCoach = new TrackCoach();
		
		//Use Coach Object
		System.out.println(cricCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyWorkout());
		

	}

}
