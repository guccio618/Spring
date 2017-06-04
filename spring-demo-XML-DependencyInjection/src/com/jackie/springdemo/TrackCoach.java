package com.jackie.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// non-arg constructor
	public TrackCoach() {
		System.out.println("[TrackCoach]: in the mothod of non-arg constructor");
	}
	
	// constructor with args
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("[TrackCoach]: in the mothod of constructor with args");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		System.out.println("[TrackCoach]: in the mothod of getDailyWorkout");
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		System.out.println("[TrackCoach]: in the mothod of getDailyFortune");
		return "Just Do It: " + fortuneService.getFortune();
	}

}
