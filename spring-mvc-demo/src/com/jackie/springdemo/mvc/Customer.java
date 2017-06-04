package com.jackie.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.jackie.springdemo.mvc.validation.CourseCode;


public class Customer {
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to zero")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	
	/********************************************* 
	 * Custom Form Validation 
	 * 		does not need to pass the default value and error message 
	 * 		because it is given in the definition.
	 *
	 *********************************************/
	@CourseCode(value="TOPS", message="must start with TOPS")
	private String courseCode;
	
	
	public String getFirstName() {
		System.out.println("[Customer]: inside of the getter, getFirstName");
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		System.out.println("[Customer]: inside of the setter, setFirstName");
		this.firstName = firstName;
	}
	
	public String getLastName() {
		System.out.println("[Customer]: inside of the getter, getLastName");
		return lastName;
	}
	
	public void setLastName(String lastName) {
		System.out.println("[Customer]: inside of the setter, setLastName");
		this.lastName = lastName;
	}
	
	public Integer getFreePasses() {
		System.out.println("[Customer]: inside of the getter, getFreePasses");
		return freePasses;
	}
	
	public void setFreePasses(Integer freePasses) {
		System.out.println("[Customer]: inside of the setter, setFreePasses");
		this.freePasses = freePasses;
	}
	
	public String getPostalCode() {
		System.out.println("[Customer]: inside of the getter, getPostalCode");
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		System.out.println("[Customer]: inside of the setter, setPostalCode");
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		System.out.println("[Customer]: inside of the getter, getCourseCode");
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		System.out.println("[Customer]: inside of the setter, setCourseCode");
		this.courseCode = courseCode;
	}
	
}
