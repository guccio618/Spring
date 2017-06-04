package com.jackie.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp_SetterDemo {

	public static void main(String[] args) {
		
		System.out.println("====== Start reading Spring configuration file: ======\n");
		
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext_SetterDemo.xml");
		
		System.out.println("\n====== Finish reading Spring configuration file ======\n");
		
		// Retrieve bean from Spring container
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);
				
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("\n====== Close the container ======\n");
				
		// close the context
		context.close();

	}

}