package com.jackie.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("====== Start reading Spring configuration file: ======\n");

		// Load Spring configuration file	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("\n====== Finish reading Spring configuration file ======\n");

		System.out.println("********** Scope: singleton **********");

		// Retrieve bean from Spring container
		Coach theCoach1 = context.getBean("myTrackCoach", Coach.class);
		Coach theCoach2 = context.getBean("myTrackCoach", Coach.class);

		// Check if they are the same
		boolean result = (theCoach1 == theCoach2);

		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach1: " + theCoach1);
		System.out.println("\nMemory location for theCoach2: " + theCoach2 + "\n");

		System.out.println("********** Scope: prototype **********\n");

		// Retrieve bean from Spring container
		Coach theCoach3 = context.getBean("myBaseballCoach", Coach.class);
		Coach theCoach4 = context.getBean("myBaseballCoach", Coach.class);

		// Check if they are the same
		boolean result2 = (theCoach3 == theCoach4);

		// print out the results
		System.out.println("\nPointing to the same object: " + result2);
		System.out.println("\nMemory location for theCoach1: " + theCoach3);
		System.out.println("\nMemory location for theCoach2: " + theCoach4);
		
		System.out.println("\n====== Close the container ======\n");

		// close the context
		context.close();

	}

}
