<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
login successfull with user ${user.email }<br/>
country ${user.country}
<ul>
<li>
<a href ="${pageContext.request.contextPath}/cd/showForm">Continue</a>
</ul>
</body>
</html>