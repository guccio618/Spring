package com.jackie.springdemo;

import org.springframework.stereotype.Component;

/**********************************************
 * Used for Default bean Id test
 * 
 **********************************************/

@Component
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		System.out.println("[BasketballCoach]: in the mothod of getDailyWorkout");
		return "Practice your crossover";
	}

}
