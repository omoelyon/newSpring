<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Customer registration form</title>
		<style type="text/css">
			.error{
				color:red;
			}
		</style>
	</head>
	<body>
		<i>fill out the form. Asterisk (*) means required</i>
		<form:form action="processForm" modelAttribute="customer">
			first name: <form:input path="firstName"/>
			
			<br><br>
			
			last name(*): <form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"/>
			
			<br><br>
			Free passes: <form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error"/>
			
			<br><br>
			
			postal code: <form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error"/>
			<br><br>
			
			course code: <form:input path="courseCode"/>
			<form:errors path="courseCode" cssClass="error"/>
			
			<br><br>
			<input type="submit" value="submit" />
		</form:form>
	</body>
</html>