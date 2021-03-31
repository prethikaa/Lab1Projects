<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&family=Pangolin&display=swap" rel="stylesheet">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/c6b4a2b7e4.js" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Select language page</title>
</head>
<style>
body{
  font-family: 'Asul', sans-serif;
  }
  #title{
  background-color: #ff4c68;
  color:white;
}
h1{
 font-family: 'Asul', sans-serif;
  font-size: 3rem;
  color: #693c72;
}

.row{
padding:3% 25% 7% 15%;
}
.b{

margin-left:12rem;}
.title-image{
  width: 60%;
  margin-top:3rem;
  margin-left:7rem;
  transform: rotate(25deg);
  position:absolute;
}
</style>
<body>
	<section id=title>
	<div class="row">
      <div class="col-lg-6 ">
      <h1>Select the Languages you wish to continue...</h1>
     </div>
  <div class="col-lg-6 ml-auto">
      <img class="title-image" src="https://play-lh.googleusercontent.com/YstkMQTYWoGLq2b3mN0h7--8Je_MF2BXH8MJNXtH0udlpubWhSZkqA1LvQ_nry8xMQ=s180" alt="iphone-mockup">
      </div>
     </div>
<form action="lang.do;jsessionid=<%=session.getId()%>" method="post">
	<input type="hidden"  name="formid" value="lang">
		<select class="b btn btn-dark dropdown-toggle" name="language">
			<option  value="ta">Tamil</option>
			<option value="te">Telugu</option>
			<option value="hi">Hindi</option>
		</select>
	<input type="submit" class="btn btn-dark s"  value="Select  " >
	</form>

	</section>
	
</body>
</html>