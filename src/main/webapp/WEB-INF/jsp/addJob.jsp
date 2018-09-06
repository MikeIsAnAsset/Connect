<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a job</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/layout/navbar.jsp"></c:import> 
	<form:form action="addJobFirstTime" method="Post" modelAttribute="job"
		commandName="job">
		<%-- <form:label path="Role"></form:label> --%>
		<label for="Role">Type of Role</label>
		<form:input path="typeOfRole" name="Role" />
		<form:input path="companyProfile.companyName" name="companyName" />
		<br>
		<form:select path="companyProfile.isCompanyNameConfidential"
			name="isCompanyNameConfidential">
			<br>
			
			<form:option value="false" >No</form:option>
			<form:option value="true" selected="selected">Yes</form:option>
		</form:select>
		<!-- Main address of company -->
		<form:input path="companyProfile.address.address" name="address" />
		<br>
		<form:input path="companyProfile.address.city" name="city" />
		<br>
		<form:input path="companyProfile.address.state" name="state" />
		<br>
		<form:input path="companyProfile.address.zip" name="zip" />
		<br>

		<!-- TODO:  add modal to ask if a different address should be associated with this job -->

		<form:input path="companyProfile.phone" name="phone" />
		<br>
		<form:input path="companyProfile.website" name="website" />
		<br>
		<form:input path="companyProfile.industry" name="industry" />
		<br>
		<form:input path="companyProfile.companySize" name="companySize" />
		<br>


		<form:input path="companyProfile.companyLogo" name="companyLogo" />
		<br>
		<form:input path="companyProfile.companyOneLineTextPitch"
			name="companyOneLineTextPitch" />
		<br>
		<form:input path="companyProfile.companyVideoPitch"
			name="companyVideoPitch" />
		<br>
		<form:button type="submit">Submit</form:button>
		<!-- 	<input type="submit" value="Add Job"> -->
	</form:form>
</body>
<%@ include file="/WEB-INF/jsp/layout/footer.jsp" %>
</html>