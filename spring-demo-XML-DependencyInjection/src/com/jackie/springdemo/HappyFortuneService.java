package com.jackie.springdemo;

public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println("[HappyFortuneService]: in the mothod of non-arg constructor");
	}
	
	@Override
	public String getFortune() {
		System.out.println("[HappyFortuneService]: in the mothod of getFortune");
		return "Today is your lucky day!";
	}

}
