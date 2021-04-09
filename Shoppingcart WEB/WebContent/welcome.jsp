<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&family=Pangolin&display=swap" rel="stylesheet">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/c6b4a2b7e4.js" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<style>
.row{
padding:3% 15% 17% 15%;
}
body{
  font-family: 'Asul', sans-serif;
  }
  #title{
  background-color: #dddddd;
  color:white;
}
h1{
 font-family: 'Asul', sans-serif;
  font-size: 3rem;
  color: #693c72;
}
.btn{
margin-left:7rem;
}
.title-image{
margin-left:3rem;
margin-top:1rem;
  width: 60%;
  
  position:absolute;
}
.s{
margin-top:1rem;}
</style>
<body>

<section id=title>
	<div class="row">
      <div class="col-lg-6 ">
     <h1>
  Welcome
  <small class="text-muted" > <%=session.getAttribute("uname") %></small>
</h1>
     </div>
  <div class="col-lg-6 ml-auto">
      <img class="title-image" src="https://i.pinimg.com/736x/ea/2e/31/ea2e31b3b0408f6d78d594d8fc199924.jpg">
      </div>
     </div>


	<jsp:include   page="logout.jsp"></jsp:include>

	<form action="shopping.do" method="post">
	<input type="hidden" name="formid" value="shopping">		
	<input type="hidden" name="shopid" value="jewellery">
	
		<input type="submit" class="btn btn-success s" value="Do Shopping">
	</form>
	
	
</body>
</html>