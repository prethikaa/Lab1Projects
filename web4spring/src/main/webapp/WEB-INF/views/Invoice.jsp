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
Customer Name = ${AllDetails.getCustomer().getCustomerName()}
Date = ${AllDetails.getDate()}
<table>
<thead>
<tr>
<th>Item Name</th>
<th>Item Unit</th>
<th>Item Image</th>
<th>Item Price</th>
<th>Item Quantity</th>
<th>Total</th>
</tr>
</thead>
<tbody>
<c:forEach items="${AllDetails.getHm()}" var="item">
<tr>
<td>${item.key.getItemdescription()}</td>
<td>${item.key.getItemunit()}</td>
<td><img src="${item.key.getImage()}"></td>
<td>${item.key.getItemprice()}</td>
<td>${item.value}</td>
<td>${item.key.getItemprice()*item.value}</td>

</tr>
</c:forEach>
</tbody>
</table>

<a href="createpdf"><button>Get Pdf</button></a>
<a href="createExcel"><button>Get Excel</button></a>
<a href="sendSMS"><button>Get Sms</button></a>
<a href="sendMail"><button>Get Mail</button></a>

</body>
</html>