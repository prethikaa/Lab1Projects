<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/myjsptags.tld" prefix="mytags" %>
<%@page import="java.util.ResourceBundle"%>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&family=Pangolin&display=swap" rel="stylesheet">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/c6b4a2b7e4.js" crossorigin="anonymous"></script>
</head>
<style>
    :root {
  --input-padding-x: 1.5rem;
  --input-padding-y: .75rem;
}
body {
  background: #f39189;
  background: linear-gradient(to right, rgb(224, 5, 54), #d8ac9c);
}
.card-signin {
  border: 0;
  border-radius: 1rem;
  box-shadow: 0 0.5rem 1rem 0 rgba(1, 0, 0, 0.1);
  color:#9c3d54;

}
.card-signin .card-title {
  margin-bottom: 2rem;
  font-weight: 300;
  font-size: 1.5rem;
}
.card-signin .card-body {
  padding: 2rem;
}
.form-signin {
  width: 100%;
}
.form-signin .btn {
  font-size: 80%;
  border-radius: 5rem;
  letter-spacing: .1rem;
  font-weight: bold;
  padding: 1rem;
  transition: all 0.2s;
}
.form-label-group {
  position: relative;
  margin-bottom: 1rem;
}
.form-label-group input {
  height: auto;
  border-radius: 2rem;
}
.form-label-group>input,
.form-label-group>label {
  padding: var(--input-padding-y) var(--input-padding-x);
}
.form-label-group>label {
  position: absolute;
  top: 0;
  left: 0;
  display: block;
  width: 100%;
  margin-bottom: 0;
  line-height: 1.5;
  color: #495057;
  border: 1px solid transparent;
  border-radius: .25rem;
  transition: all .1s ease-in-out;
}
.form-label-group input::-webkit-input-placeholder {
  color: transparent;
}
.form-label-group input:-ms-input-placeholder {
  color: transparent;
}
.form-label-group input::-ms-input-placeholder {
  color: transparent;
}
.form-label-group input::-moz-placeholder {
  color: transparent;
}
.form-label-group input::placeholder {
  color: transparent;
}
.form-label-group input:not(:placeholder-shown) {
  padding-top: calc(var(--input-padding-y) + var(--input-padding-y) * (2 / 3));
  padding-bottom: calc(var(--input-padding-y) / 3);
}
.form-label-group input:not(:placeholder-shown)~label {
  padding-top: calc(var(--input-padding-y) / 3);
  padding-bottom: calc(var(--input-padding-y) / 3);
  font-size: 12px;
  color: #777;
}
h1{
font-size:380%;
text-align: center;
color:#48426d;
}
</style>
<body>
<h1>
  WEB
  <small class="text-muted" >Shopping Cart  <i class="fas fa-shopping-cart"></i></small>
</h1>
  <div class="container mt-5">
    <div class="row mt-5">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto mt-5">
        <div class="card card-signin my-5 mt-5">
          <div class="card-body">
            <h5 class="card-title text-center mt-5">Sign In</h5>
            <form action="login.do" method="post" class="form-signin">
            <input type="hidden" name="formid" value="login">
		
              <div class="form-label-group">
                <input type="text" class="form-control" name="uname" placeholder="Username" required autofocus>
                
                              <label for="username"><mytags:bundle key="username"/></label>

              </div>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" name="upass" placeholder="Password" required>
                <label for="inputPassword"><mytags:bundle key="password"/></label>
              </div>
              <button class="btn btn-lg btn-dark btn-block text-uppercase" type="submit"><i class="fas fa-sign-in-alt"></i>  Sign in</button>
              
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>