<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Customer Form</title>
	<style type="text/css">
		.error {color:red;}
	</style>
</head>
<body>
	<div>
		<i>Fill out the form. Asterisk (*) means required.</i>
		<br><br>
		<form:form action="customerProcess" modelAttribute="customer" method="POST">
			First name: <form:input path="firstName"/>

			<br><br>
			Last name: <form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error" />
			<br><br>
			Free passes: <form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error" />
			<br><br>
			Course Code: <form:input path="courseCode"/>
			<form:errors path="courseCode" cssClass="error" />
			<br><br>
			<input type="submit" name="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>