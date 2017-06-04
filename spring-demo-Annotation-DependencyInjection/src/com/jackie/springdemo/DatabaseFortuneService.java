package com.jackie.springdemo;

import org.springframework.stereotype.Component;

/**********************************************
 * Used for Qualifier test
 * 
 **********************************************/

@Component
public class DatabaseFortuneService implements FortuneService {

	public DatabaseFortuneService() {
		System.out.println("[DatabaseFortuneService]: in the mothod of non-arg constructor\n");
	}
	
	@Override
	public String getFortune() {
		System.out.println("[DatabaseFortuneService]: in the mothod of getFortune\n");
		return "Today is your lucky day!";
	}
}
