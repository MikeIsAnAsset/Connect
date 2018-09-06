<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%--    <%@ include file="/WEB-INF/jsp/layout/layout.jsp" %> --%>
<link rel="stylesheet" type="text/css" href="nav.css">
<!-- <link rel="stylesheet" href="/css/addJobFirstTime.css"> -->
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <c:import url="/WEB-INF/jsp/layout/navbar.jsp"></c:import>  
<%--    <%@ include file="/WEB-INF/jsp/layout/navbar.jsp" %> --%>
   <br>
   <br>
   <br>
<form:form action="/register" method="POST" modelAttribute="user">
<br>
Email: <form:input path="email"/>
<br>

FirstName: <form:input path="firstName"/>
<br>

LastName:  <form:input path="lastName"/>
<br>

Password: <form:password path="password"/>
<br>

<input type="submit">
</form:form>

</body>
   <%@ include file="/WEB-INF/jsp/layout/footer.jsp" %>
</html>