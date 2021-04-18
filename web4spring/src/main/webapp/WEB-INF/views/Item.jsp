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
	<spring:form commandName="item" method="post" action="submititemform">
	
		Item Description:<spring:input path="itemdescription"/>
		Item Price:<spring:input path="itemprice"/>
		Item Unit :<spring:input path="itemunit"/>
		Category :<spring:input path="category"/>
		Image:<spring:input path="image"/>
		<input type="submit" value="Insert">
		
	</spring:form>
</body>
</html>