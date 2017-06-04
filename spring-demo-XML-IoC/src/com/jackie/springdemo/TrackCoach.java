package com.jackie.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "TrackCoach: Run a hard 5k";
	}

}
