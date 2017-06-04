package com.jackie.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	// non-arg constructor
	public BaseballCoach() {
		System.out.println("[BaseballCoach]: in the mothod of non-arg constructor");
	}
	
	// constructor with args
	public BaseballCoach(FortuneService fortuneService) {
		System.out.println("[BaseballCoach]: in the mothod of constructor with args");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		System.out.println("[BaseballCoach]: in the mothod of getDailyWorkout");
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		System.out.println("[BaseballCoach]: in the mothod of getDailyFortune");
		return "Just Do It: " + fortuneService.getFortune();
	}

}
