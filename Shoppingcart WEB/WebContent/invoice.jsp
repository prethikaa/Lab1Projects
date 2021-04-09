<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.ItemMasterDTO" %>
    <%@ page import="java.util.Set" %>
    <%@ page import="java.util.HashSet" %>
     <%@ page import="java.util.HashMap" %>
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
<title>Invoice</title>
</head>
<style>
body {
  background: #64dfdf;
  background: linear-gradient(to right, #fecea8, #f73859);
}
h1{
font-size:300%;
text-align: center;
color:#ff8585;
}
.table{
margin-top:2rem;
margin-bottom:5rem;}
#btn{
margin-left:2rem;}
.btn{

margin-left:1rem;}

.table-danger{
margin-top:3rem;


}
.f{
margin-left:25rem;
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
<body>


	<table class="table" border="1">
	<tr>
	<th>Item No</th>
	<th>Item Description</th>
	<th>Item Price</th>
	<th>Item Quantity</th>
	<th>Item Unit</th>
	</tr>

	<c:forEach items="${totaldetails.getItemdetails()}" var="item">
	<tr>
	<td>${item.getItemno()}</td> 
	<td>${item.getItemdescription()}</td>
	<td>${item.getItemqty()}</td>
	<td>${item.getItemprice()}</td>
	<td>${item.getItemunit()}</td>
	</tr>
</c:forEach>
		</table>
		<div class="btn-group">
		<form class="btn-group" action="pdf.do" method="post">
	<input type="hidden" name="formid" value="pdf">
	<div><input class=" f btn btn-dark" type="submit" value="Create PDF"></div></form>
	<form action="excel.do" method="post">
	<input type="hidden" name="formid" value="excel">
	<div><input class="btn btn-danger" type="submit" value="Create Excel"></div>
	</form>
	<form action="email.do" method="post">
	<input  type="hidden" name="formid" value="email">
	<div><input class="btn btn-warning" type="submit" value="Send Email"></div>
	</form>
	
	<form action="sms.do" method="post">
	<input type="hidden" name="formid" value="sms">
	<div><input class="btn btn-success"  type="submit" value="Send SMS"></div>
	</form>
	</div>
</body>
</html>