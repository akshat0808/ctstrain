<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>

<head>
<style type="text/css">
	.error {color: red}
</style>
	<title>Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error"/>
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		
		Email: <form:input path="email" />
		<form:errors path="email" cssClass="error"/>
		<br><br>
		
		Age: <form:input path="age" />
		<form:errors path="age" cssClass="error"/>
		<br><br>
		
		
		Zipcode: <form:input path="zipCode" />
		<form:errors path="zipCode"/>
		<br><br>
	
		Country:
		
		<%-- <form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select> --%>
		
				
		<br><br>

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br>

		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		MacOS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>
