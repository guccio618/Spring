package com.jackie.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp_LiteralValuesDemo {

	public static void main(String[] args) {
		
		System.out.println("====== Start reading Spring configuration file: ======\n");
		
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext_LiteralValuesDemo.xml");

		System.out.println("\n====== Finish reading Spring configuration file ======\n");

		// Retrieve bean from Spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// Call methods on the bean
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getPhoneNumber());
		System.out.println("my age is " + theCoach.getAge());
		
		System.out.println("\n====== Close the container ======\n");

		// close the context
		context.close();
	}

}
