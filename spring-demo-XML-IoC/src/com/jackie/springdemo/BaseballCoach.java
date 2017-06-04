package com.jackie.springdemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "BaseballCoach: Spend 30 minutes on batting practice";
	}

}
