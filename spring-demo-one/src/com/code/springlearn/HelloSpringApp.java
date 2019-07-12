package com.code.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from Spring Container
		Coach cricCoach=context.getBean("cricCoach",Coach.class);
		Coach trackCoach = context.getBean("trackCoach",Coach.class);
		Coach basketballCoach = context.getBean("basketballCoach",Coach.class);
		
		//Call Methods on Bean
		System.out.println(cricCoach.getDailyWorkout());
		System.out.println(cricCoach.formTeam(11));
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.formTeam(4));
		System.out.println(trackCoach.getFortune());
		System.out.println(basketballCoach.getDailyWorkout());
		System.out.println(basketballCoach.formTeam(6));
		System.out.println(basketballCoach.getFortune());
		
		//Close context
		context.close();
	}

}
