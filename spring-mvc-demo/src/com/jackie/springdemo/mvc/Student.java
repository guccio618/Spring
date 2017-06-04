package com.jackie.springdemo.mvc;

import java.util.HashMap;
import java.util.Map;

/*** this class is used for form the demo of tags && text field ***/

public class Student {
	private String firstName;
	private String lastName;
	private String country;	
	private String favoriateLanguage;
	private String[] operatingSystems;
	
	private Map<String, String> favoriateLanguageOptions;
	
	
	
//	private LinkedHashMap<String, String> countryOptions;
	
//	public LinkedHashMap<String, String> getCountryOptions() {
//	return countryOptions;
//}

	public Student() {
		// populate favoriate language options:
		favoriateLanguageOptions = new HashMap<>();
		favoriateLanguageOptions.put("Java", "Java");
		favoriateLanguageOptions.put("C#", "C#");
		favoriateLanguageOptions.put("PHP", "PHP");
		favoriateLanguageOptions.put("Ruby", "Ruby");	
		
		// populate country options: used ISO country code
//		countryOptions = new LinkedHashMap<>();
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("DE", "Gremany");
//		countryOptions.put("IN", "India");
//		countryOptions.put("CN", "China");
	}

	public String getFirstName() {
		System.out.println("[Student]: inside the getFirstName method, firstname is: " + firstName);
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("[Student]: inside the setFirstName method, firstname is: " + firstName);
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("[Student]: inside the getLastName method, lastname is: " + lastName);
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("[Student]: inside the setLastName method, lastname is: " + lastName);
		this.lastName = lastName;
	}

	public String getCountry() {
		System.out.println("[Student]: inside the getCountry method");
		return country;
	}

	public void setCountry(String country) {
		System.out.println("[Student]: inside the setCountry method");
		this.country = country;
	}

	public Map<String, String> getFavoriateLanguageOptions() {
		System.out.println("[Student]: inside the getFavoriateLanguageOptions method");
		return favoriateLanguageOptions;
	}

	public String getFavoriateLanguage() {
		System.out.println("[Student]: inside the getFavoriateLanguage method");
		return favoriateLanguage;
	}

	public void setFavoriateLanguage(String favoriateLanguage) {
		System.out.println("[Student]: inside the setFavoriateLanguage method");
		this.favoriateLanguage = favoriateLanguage;
	}

	public String[] getOperatingSystems() {
		System.out.println("[Student]: inside the getOperatingSystems method");
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		System.out.println("[Student]: inside the setOperatingSystems method");
		this.operatingSystems = operatingSystems;
	}

}
