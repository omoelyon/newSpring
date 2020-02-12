<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
	<title>customer confirmation</title>
	</head>
	<body>
		<h2>hello world of spring</h2>
		
		<br><br>
		
			the customer ${customer.firstName} ${customer.lastName}
		
		<br><br>
		free passes = ${customer.freePasses}
		<br><br>
		postal code = ${customer.postalCode}
		<br><br>
		course code = ${customer.courseCode}
	</body>

</html>