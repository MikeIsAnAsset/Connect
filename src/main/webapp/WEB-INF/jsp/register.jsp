<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./styles/styles.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<nav class="navbar navbar-default">
  			<div class="container-fluid">
   				<div class="navbar-header">
      				<a class="navbar-brand" href="#">Controller Trade</a>
    				</div>
    				<ul class="nav navbar-nav">
      				<li class="active"><a href="#">Home</a></li>
      				<li><a href="/about">About</a></li>
      				<li><a href="/sell">Sell Item</a></li>
    				</ul>
    				<ul class="nav navbar-nav navbar-right">
    					<li><a href="/login">Sign In</a></li>
      				<li><a href="/signup">Sign Up</a></li>
    				</ul>
 			 </div>
		</nav>
		
		<div className="container">
		<form:form action="/register" method="POST" modelAttribute="user">
		
		<div class="form-group">
			<label for="firstName"> First name </label> <form:input type="text"
				class="form-control" path="firstName" id="firstName"
				placeholder="First Name"/>
		</div>
		<div class="form-group">
			<label for="lastName"> Last name </label> <form:input type="text"
				class="form-control" path="lastName" id="lastName"
				placeholder="Last Name"/>
		</div>
		<div class="form-group">
			<label for="email"> Email address </label> <form:input type="text"
				class="form-control" path="email" id="exampleInputEmail1"
				placeholder="Email"/>
		</div>
		<div class="form-group">
			<label for="password"> Password </label> <form:input type="text"
				class="form-control" path="password" id="password"
				placeholder="Password"/>
		</div>
		<input type="submit"></input> 
		</form:form>
		
		</div>

		
</body>
</html>