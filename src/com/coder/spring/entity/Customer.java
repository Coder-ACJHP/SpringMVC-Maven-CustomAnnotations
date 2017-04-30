package com.coder.spring.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.coder.spring.validation.CourseCode;

public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="must be greather than zero")
	@Max(value=10, message="must be less than ten or equals")
	private Integer freePasses;

	@CourseCode() // you can modify it from here like another annotations.
//	@CouseCode(value="Coder", message="It's must start with Coder")
	private String courseCode;
	
	public Customer() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
