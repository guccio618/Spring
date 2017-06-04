package com.jackie.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**********************************************
 * Used for method Injection
 * 
 **********************************************/

@Component
public class FootballCoach implements Coach {
	private FortuneService fortuneService;
	
	// non-arg constructor
	public FootballCoach() {
		System.out.println("[FootballCoach]: in the mothod of non-arg constructor\n");
	}
	
	// getter
	public FortuneService getFortuneService() {
		System.out.println("[FootballCoach]: in the mothod of getter, getFortuneService\n");
		return fortuneService;
	}
	
	// setter
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("[FootballCoach]: in the mothod of setter, setFortuneService\n");
		this.fortuneService = fortuneService;
	}
	
	// method injection
	@Autowired
	@Qualifier("databaseFortuneService")
	public void doMethodInjection(FortuneService fortuneService) {
		System.out.println("[FootballCoach]: in the mothod of doMethodInjection\n");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		System.out.println("[FootballCoach]: in the mothod of getDailyWorkout\n");
		return "Kick the football";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("[FootballCoach]: in the mothod of getDailyFortune\n");
		return fortuneService.getFortune();
	}

}
