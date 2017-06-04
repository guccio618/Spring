package com.jackie.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp_BeanScopes {

	public static void main(String[] args) {
		
		System.out.println("====== Start reading Spring configuration file: ======\n");
		
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		System.out.println("\n====== Finish reading Spring configuration file ======\n");
		
		// Get the bean from Spring container
		// singleton
		Coach theCoach1 = context.getBean("tennisCoach", Coach.class);
		Coach theCoach2 = context.getBean("tennisCoach", Coach.class);
		
		// prototype
		Coach theCoach3 = context.getBean("basketballCoach", Coach.class);
		Coach theCoach4 = context.getBean("basketballCoach", Coach.class);
		
		System.out.println("****** Bean Scope: singleton ******\n");
		
		boolean result = (theCoach1 == theCoach2);
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach1: " + theCoach1);
		System.out.println("\nMemory location for theCoach2: " + theCoach2 + "\n");
		
		System.out.println("****** Bean Scope: prototype ******\n");
		
		boolean result2 = (theCoach3 == theCoach4);
		System.out.println("\nPointing to the same object: " + result2);
		System.out.println("\nMemory location for theCoach3: " + theCoach3);
		System.out.println("\nMemory location for theCoach4: " + theCoach4 + "\n");
			
		
		System.out.println("\n====== Close the container ======\n");
		
		// Close the context
		context.close();
		
	}

}
