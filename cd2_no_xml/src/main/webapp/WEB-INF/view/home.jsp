<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processLogin" modelAttribute="user" method="post">
Email Address<form:input path="email"/><br/>
Password<form:password path="password" /><br/>
 Country:<form:select path="country">
<form:option value="INDIA" label="INDIA"/>
<form:option value="USA" label="USA"/>
<form:option value="UK" label="UK"/>
<form:option value="RUSSIA" label="RUSSIA"/>
</form:select><br/><br/>
<input type="submit" value="login" />
</form:form>
</body>
</html>