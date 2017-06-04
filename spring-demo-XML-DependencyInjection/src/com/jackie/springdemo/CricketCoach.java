package com.jackie.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	private String phoneNumber;
	private int age;
	
	// non-arg constructor
	public CricketCoach() {
		System.out.println("[CricketCoach]: in the mothod of non-arg constructor");
	}
	
	// constructor with args
	public CricketCoach(FortuneService fortuneService) {
		System.out.println("[CricketCoach]: in the mothod of constructor with args");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		System.out.println("[CricketCoach]: in the mothod of getDailyWorkout");
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("[CricketCoach]: in the mothod of getDailyFortune");
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		System.out.println("[CricketCoach]: in the getter mothod, getFortuneService");
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("[CricketCoach]: in the setter mothod, setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		System.out.println("[CricketCoach]: in the getter mothod, getEmailAddress");
		return "My email is " + emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("[CricketCoach]: in the setter mothod, setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		System.out.println("[CricketCoach]: in the getter mothod, getTeam");
		return "My team is " + team;
	}

	public void setTeam(String team) {
		System.out.println("[CricketCoach]: in the setter mothod, setTeam");
		this.team = team;
	}

	public String getPhoneNumber() {
		System.out.println("[CricketCoach]: in the getter mothod, getPhoneNumber");
		return "My phone number is " + phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		System.out.println("[CricketCoach]: in the setter mothod, setPhoneNumber");
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		System.out.println("[CricketCoach]: in the getter mothod, getAge");
		return age;
	}

	public void setAge(int age) {
		System.out.println("[CricketCoach]: in the setter mothod, setAge");
		this.age = age;
	}
	
}
