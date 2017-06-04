package com.jackie.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**********************************************
 * Used for single bean scopes test
 * 
 **********************************************/

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// non-arg constructor
	public TennisCoach() {
		System.out.println("[TennisCoach]: in the mothod of non-arg constructor\n");
	}
	
	// constructor with args
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		System.out.println("[TennisCoach]: in the mothod of constructor with arg\n");
		this.fortuneService = fortuneService;
	}
	
	// add an init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("\n[TennisCoach]: in the init mothod, doMyStartupStuff\n");
	}
		
	// add an destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("\n[TennisCoach]: in the destroy mothod, doMyCleanupStuff\n");
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
