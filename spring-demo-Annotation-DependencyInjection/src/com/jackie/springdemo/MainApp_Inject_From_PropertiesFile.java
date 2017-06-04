package com.jackie.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp_Inject_From_PropertiesFile {

	public static void main(String[] args) {
		System.out.println("====== Start reading Spring configuration file: ======\n");
		
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		System.out.println("\n====== Finish reading Spring configuration file ======\n");
		
		// Get the bean from Spring container
		TabletennisCoach theCoach = context.getBean("tabletennisCoach", TabletennisCoach.class);
		
		// Qualifer test
		System.out.println(theCoach.getEmailAddress() + "\n");
		System.out.println(theCoach.getTeam());
		
		System.out.println("\n====== Close the container ======\n");
		
		// Close the context
		context.close();

	}

}
