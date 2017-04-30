package com.coder.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements 
					ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
		
	}

	@Override
	public boolean isValid(String theValue, ConstraintValidatorContext theConstraintValidatorContext) {
		// You can do your any business logic here
		boolean result;
		
		if(theValue != null) {
			result = theValue.startsWith(coursePrefix);
		}else {
			result = true;
		}
		
		return result;
	}

}
