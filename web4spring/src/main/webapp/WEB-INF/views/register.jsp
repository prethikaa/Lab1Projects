<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<spring:form commandName="customer" method="post" action="submitregisterform">
	
		UserName:<spring:input path="user.uname"/>
		PassWord:<spring:input path="user.upass"/>
		Customer Name :<spring:input path="customerName"/>
		Customer Phone :<spring:input path="customerPhone"/>
		Customer Address :<spring:input path="customerAddress"/>
		Customer Email :<spring:input path="customerEmail"/>
		<input type="submit" value="register..">
		
	</spring:form>
</body>
</html>