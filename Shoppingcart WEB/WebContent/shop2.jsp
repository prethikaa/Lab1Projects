<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.util.Set" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&family=Pangolin&display=swap" rel="stylesheet">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/c6b4a2b7e4.js" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Groccery Shop</title>
</head>
<style>
body {
  background: #64dfdf;
  background: linear-gradient(to right, #e3fdfd, #a6e3e9);
}
h1{
font-size:300%;
text-align: center;
color:#ff8585;
}
#btn{
margin-left:2rem;}
.btn{
padding:2mm;

margin-top:3rem;
margin-left:33rem;}
.table-danger{
margin-top:3rem;
margin-left:25rem;
}
.table{
background-color:#defcf9;
}
h1{
font-family: 'Asul', sans-serif;
  font-size: 4rem;
  color: #693c72;}
  .item{
  font-family: 'Noto Serif', serif;
 	font-size:2rem;
  color: #693c72;
  }
</style>
<body >
		<jsp:include page="logout.jsp"></jsp:include>

	<h1>Grocery Shop </h1> <i class="fas fa-shopping-basket"></i>
	<form action="shopping.do" method="post">
	<input type="hidden" name="formid" value="shopping">
	<input type="hidden" name="shopid" value="fruits">
	<input type="hidden" name="currentid" value="grocery"> 
	<table class="table" border="1">
	<tr class="table">
	<th class="item">Item Name</th>
	<th class="item">Item Quantity</th>
	<th class="item">Image</th>
	<th class="item">Select</th>
	</tr>

	<c:forEach items="${items}" var="item">
	<tr class="table">
	<td>${item.getItemdescription()}</td> 
	<td><select id=btn class="b btn btn-info dropdown-toggle" name=<c:out value='${item.getItemno()}' />>
	<option value="0">Select quantity</option>
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	</select></td>
	<td><img src=<c:out value='${item.getImage()}'/> width="100" height="100"></td>
	<td><input type="checkbox" name="selected" value=<c:out value='${item.getItemno()}' />></td>
	</tr>
</c:forEach>
		</table>
		<input class="btn btn-lg btn-outline-success text-uppercase" type="submit" value="Continue Shopping">
	</form>
</body>
</html>