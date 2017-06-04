package com.jackie.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**********************************************
 * Used for Setter Injection
 * 
 **********************************************/

@Component
public class BasketballCoach implements Coach {
	private FortuneService fortuneService;
	
	// Define a default constructor
	public BasketballCoach() {
		System.out.println("[BasketballCoach]: in the method of non-arg constructor\n");
	}
	
	// Define a getter method
	public FortuneService getFortuneService() {
		System.out.println("[BasketballCoach]: in the getter method, getFortuneService\n");
		return fortuneService;
	}
	
	// Define a setter method
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("[BasketballCoach]: in the setter method, setFortuneService\n");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		System.out.println("[BasketballCoach]: in the mothod of getDailyWorkout\n");
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("[BasketballCoach]: in the mothod of getDailyFortune\n");
		return fortuneService.getFortune();
	}

}
