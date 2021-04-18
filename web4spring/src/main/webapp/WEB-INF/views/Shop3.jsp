<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
img {
    width: 3.5rem
}
</style>
<body>
<form action="invoiceform" method="POST">
<table>
<thead>
<tr>
<th>Item name</th>
<th>Item Price</th>
<th>Item Image</th>
<th>Item Unit</th>
<th>Item Quantity</th>
<th>Select</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="item">
<tr>
<td>${item.getItemdescription()}</td>
<td>${item.getItemprice()}</td>
<td><img src="${item.getImage()}"></td>
<td>${item.getItemprice()}</td>
<td> <input type="text" name="${item.getItemno()}"> </td>
<td><input type="checkbox" name="select" value="${item.getItemno()}"></td>
</tr>
</c:forEach>
</tbody>
</table>
<input type="submit" value="get invoice">
</form>
</body>
</html>