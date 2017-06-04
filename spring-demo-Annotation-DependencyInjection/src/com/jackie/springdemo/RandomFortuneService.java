package com.jackie.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

/**********************************************
 * Used for Qualifier test
 * 
 **********************************************/

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"This gift card is for you",
			"Diligence is the methor of good luck",
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();

	public RandomFortuneService() {
		System.out.println("[RomdanFortuneService]: in the mothod of non-arg constructor\n");
	}
	
	@Override
	public String getFortune() {
		System.out.println("[RomdanFortuneService]: in the mothod of getFortune\n");
		
		// pick a random string from data array
		int index = myRandom.nextInt(data.length);
		return data[index];	
	}

}
