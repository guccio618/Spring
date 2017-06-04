package com.jackie.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("====== Start reading Spring configuration file: ======\n");
		
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		System.out.println("\n====== Finish reading Spring configuration file ======\n");
		
		// Get the bean from Spring container
		Coach theCoach1 = context.getBean("myTennisCoach", Coach.class);
		Coach theCoach2 = context.getBean("basketballCoach", Coach.class);
		Coach theCoach3 = context.getBean("footballCoach", Coach.class);
		Coach theCoach4 = context.getBean("tabletennisCoach", Coach.class);
		
		System.out.println("\n****** constructor injection ******\n");
		
		// Constructor injection test, call a method on the bean
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());
		
		System.out.println("\n****** setter injection ******\n");
		
		// Setter injection test, call a method on the bean
		System.out.println(theCoach2.getDailyFortune());
		
		System.out.println("\n****** method injection ******\n");
		
		// Setter injection test, call a method on the bean
		System.out.println(theCoach3.getDailyFortune());
		
		System.out.println("\n****** field injection ******\n");
		
		// Field injection test, call a method on the bean
		System.out.println(theCoach4.getDailyFortune());
		
		System.out.println("\n====== Close the container ======\n");
		
		// Close the context
		context.close();
		
	}

}
