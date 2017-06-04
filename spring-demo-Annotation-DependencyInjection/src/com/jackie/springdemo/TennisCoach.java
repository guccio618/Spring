package com.jackie.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**********************************************
 * Used for Constructor Injection
 * 
 **********************************************/

@Component("myTennisCoach")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// non-arg constructor
	public TennisCoach() {
		System.out.println("[TennisCoach]: in the mothod of non-arg constructor\n");
	}
	
	// constructor with args
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		System.out.println("[TennisCoach]: in the mothod of constructor with arg\n");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		System.out.println("[TennisCoach]: in the mothod of getDailyWorkout\n");
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("[TennisCoach]: in the mothod of getDailyFortune\n");
		return fortuneService.getFortune();
	}

}
