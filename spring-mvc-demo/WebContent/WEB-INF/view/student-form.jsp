<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <!DOCTYPE html>
 <html>
	 <head>
	 	<title>student form</title>
	 </head>
	 <body>
	 	<form:form action="processForm" modelAttribute="student">
	 		First name: <form:input path="firstName" />
	 		<br><br>
	 		Last name: <form:input path="lastName" />
	 		
	 		<br><br>
	 		country:
	 		<form:select path="country">
	 			<form:options items="${student.countryOptions}" />
	 		</form:select>
	 		
	 		<br><br>
	 		Favorite language: 
	 		Java <form:radiobutton path="favoriteLanguage" value="java"/>
	 		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
	 		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
	 		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
	 		
	 		<br><br>
	 		Operating systems:
	 		linux	<form:checkbox path="operatingSystems" value="linux"/>
	 		Mac OS	<form:checkbox  path="operatingSystems" value="Mac OS"/>
	 		Microsoft Windows <form:checkbox  path="operatingSystems" value="Microsoft Windows"/>
	 		
	 		<br><br>
	 		<input type="submit" value="submit" />
	 	
	 	</form:form>
	 </body>
 
 </html>