package com.jackie.springdemo;

import org.springframework.stereotype.Component;

/**********************************************
 * Used for Annotation, Dependency Injection
 * 
 **********************************************/

@Component("myTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		System.out.println("[TennisCoach]: in the mothod of getDailyWorkout");
		return "Practice your backhand volley";
	}

}
