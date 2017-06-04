package com.jackie.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp_ConstructorDemo {

	public static void main(String[] args) {
		
		System.out.println("====== Start reading Spring configuration file: ======\n");
		
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext_ConstructorDemo.xml");
		
		System.out.println("\n====== Finish reading Spring configuration file ======\n");
		
		// Retrieve bean from Spring container
		Coach theCoach1 = context.getBean("myTrackCoach", Coach.class);
		Coach theCoach2 = context.getBean("myBaseballCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());
		
		System.out.println(theCoach2.getDailyWorkout());	
		System.out.println(theCoach2.getDailyFortune());
		
		System.out.println("\n====== Close the container ======\n");
		
		// close the context
		context.close();

	}

}
