<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
	<title>student confirmation</title>
	</head>
	<body>
		<h2>hello world of spring</h2>
		
		<br>
		the student ${student.firstName}	${student.lastName} is confirmed.
		<br><br>
		
		Country:${student.country}
		<br><br>
		
		favorite language: ${student.favoriteLanguage}
		
		<br><br>
		Operating Systems: 
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}" >
			<li>${temp}</li>
			</c:forEach>
		</ul>
		
	</body>

</html>