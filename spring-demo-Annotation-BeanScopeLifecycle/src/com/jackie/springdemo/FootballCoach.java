package com.jackie.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**********************************************
 * Used for prototype bean scope 
 * & leftcycle method
 * 
 **********************************************/

@Component
@Scope("prototype")
public class FootballCoach implements Coach {
	private FortuneService fortuneService;

	// non-arg constructor
	public FootballCoach() {
		System.out.println("[FootballCoach]: in the mothod of non-arg constructor\n");
	}

	// add an init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("\n[FootballCoach]: in the init mothod, doMyStartupStuff\n");
	}

	// add an destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("\n[FootballCoach]: in the destroy mothod, doMyCleanupStuff\n");
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
