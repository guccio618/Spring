package com.jackie.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**********************************************
 * Used for field Injection and value injection
 * 
 **********************************************/

@Component
public class TabletennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${jackie.emailAddress}")
	private String emailAddress;
	
	@Value("Los Angeles Laker")
	private String team;
	
	// non-arg constructor
	public TabletennisCoach() {
		System.out.println("[TabletennisCoach]: in the mothod of non-arg constructor\n");
	}
	
	@Override
	public String getDailyWorkout() {
		System.out.println("[TabletennisCoach]: in the mothod of getDailyWorkout\n");
		return "play tabletennis";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("[TabletennisCoach]: in the mothod of getDailyFortune\n");
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		System.out.println("[TabletennisCoach]: in the mothod of getter, getEmailAddress\n");
		return "my email address is " + emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("[TabletennisCoach]: in the mothod of setter, setEmailAddress\n");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		System.out.println("[TabletennisCoach]: in the mothod of getter, getTeam\n");
		return "my team is " + team;
	}

	public void setTeam(String team) {
		System.out.println("[TabletennisCoach]: in the mothod of setter, setTeam\n");
		this.team = team;
	}

	
}
