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
		// Use the default bean id
		Coach theCoach2 = context.getBean("basketballCoach", Coach.class); 
		
		// Call a method on the bean
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		
		System.out.println("\n====== Close the container ======\n");
		
		// Close the context
		context.close();
		
	}

}
