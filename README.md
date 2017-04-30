# Spring MVC Enterprice (Custom annotations)

In this project we gonna create own validation annotation(s) and for example 
we will use it in Spring MVC & Maven web application.

Check this two classes : 

1 : <a href="https://github.com/Coder-ACJHP/SpringMVCenterptice/blob/master/src/com/coder/spring/validation/CourseCode.java">CourseCode</a>
In this class we need to create <br> @Annotation class and give it some rules like : @Constraint("tell him from which class will gate rules"), <br>
@Target("tell to app where it can use it like {ElementType.METHOD//in method, ElementType.FIELD//in fields}"), @Retention("tell to app what the policy like: RetentionPolicy.RUNTIME")

<code>

        // define default course code
	public String value() default "CoderACJHP";
	
	// define default error code
	public String message() default "must start with CoderACJHP";
	
	// define default grups
	public Class<?>[] groups() default {};
	
	// define default peyloads
	public Class<? extends Payload>[] payload() default {};
  
</code>

<br>
2: <a href="https://github.com/Coder-ACJHP/SpringMVCenterptice/blob/master/src/com/coder/spring/validation/CourseCodeConstraintValidator.java">CourseCodeConstraintValidator</a><br>
<pre>
In this class we need to create validation logic it's very basic, just at first make the 
class implements ConstraintValidator interface and implemet all methods and override them as you want.
</pre>
<br>
<br>
<label>That's it enjoy!</label><br>
<b><i>Thank you for reading this.<i><b>
