package com.code.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//Load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the config file
		CricketCoach theCoach = context.getBean("cricCoach", CricketCoach.class);
		
		//Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		//close the context
		context.close();
	}

}
