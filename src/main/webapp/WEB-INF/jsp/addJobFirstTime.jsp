<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First time adding job</title>
<script type="text/javascript">
	
</script>
</head>
<body>
	<c:import url="/WEB-INF/jsp/layout/navbar.jsp"></c:import>
	<h1>Try it out! Preview your job post!</h1>
	

	<form:form  action="addJobFirstTime" method="Post" modelAttribute="job"
		commandName="job">
		
			
		
		
		<form:label path="typeOfRole">Type of Role</form:label>
		<!-- 		<label for="Role">Type of Role</label> -->
		<form:input path="typeOfRole" name="Role" />

		<label for="jobTitle">Job Title: </label>
		<form:input path="jobTitle" name="jobTitle" />
		<br>

		<label for="jobType">Job Type: </label>
		<form:input path="jobType" name="jobType" />
		<br>

		<label for="jobCategory">Job Category: </label>
		<form:input path="jobCategory" name="jobCategory" />
		<br>

		<label for="description">Job Description: </label>
		<form:input path="description" name="description" />
		<br>

		<!-- Skills object -->

		<table>
			<tr>
				<td><form:checkboxes items="${fieldNames}"
						path="selectedSkills" /></td>
			</tr>
		</table>




		<%-- itemValue="${fieldNames.getName()}" itemLabel="skills"  --%>


		<%-- <label for="skills">Required Skills: </label>
		<form:input path="skills" name="skills" />
		<br>

		<form:hidden path="checkboxSelections" />

		<c:set var="jsSkillsObject" value="${skills}" />

		<script var keyNames=Object.keys(jsSkillsObject);></script>

		<c:forEach var="fieldname" items="keyNames">
			<input id="fieldname" name="fieldname" type="checkbox"
				value="Spring MVC" checked="checked" />
			<label for="fieldname">${ fieldname}</label>
		</c:forEach>

		
<!-- console.log(keyNames); // Outputs ["a","b","c"] -->


<select>

        <c:forEach var="field" items="${object['class'].declaredFields}">
        
        
        // get field names of skills object and display them as checkboxes.  if checked, then that sets the boolean field.
        
        
        // use skills.declaredfields to get an array of objects, each being a field name of my skills object   
        <% Object [] fieldNamesAsObject = {skills.getDeclaredFields()};    
        %>
        
        <% ArrayList<Object> fieldNamesAsObject = skills.getDeclaredFields();    
        %>        
        
        
        
        // loop through array to get string name of each object field name, so I need to 
        // create arrayList to hold string names
        	
        	<% ArrayList<String> fieldNames;%>
        
        // for each ojbect in the array of objects (each a class?)
        // 		append the fieldNames with object.getName
        
        <% forEach (Object obj : fieldNamesAsObject)
        forEach (Object obj: skills.getDeclaredFields())
        {
        		fieldNames.add(obj.getName);
        	
        } %>
        

        
        
        
            <c:catch><li><span>${field.name}</span>${object[field.name]}</li></c:catch>
        </c:forEach>
</select>





 --%>

		<%-- <label for="companyName">Company Name: </label>
		<form:input path="companyProfile.companyName" name="companyName" />
		<br>

		<label for="companyName">Company Name: </label>
		<form:input path="companyProfile.companyName" name="companyName" />
		<br>

		<label for="companyName">Company Name: </label>
		<form:input path="companyProfile.companyName" name="companyName" />
		<br>

		<label for="companyName">Company Name: </label>
		<form:input path="companyProfile.companyName" name="companyName" />
		<br>

		<label for="companyName">Company Name: </label>
		<form:input path="companyProfile.companyName" name="companyName" />
		<br>

		<label for="companyName">Company Name: </label>
		<form:input path="companyProfile.companyName" name="companyName" />
		<br>

		<label for="companyName">Company Name: </label>
		<form:input path="companyProfile.companyName" name="companyName" />
		<br>
 --%>







		<!-- Getting company information -->
		<label for="companyName">Company Name: </label>
		<form:input path="companyProfile.companyName" name="companyName" />
		<br>

		<label for="isCompanyNameConfidential"> Is Company Name
			Confidential?</label>
		<form:select path="companyProfile.isCompanyNameConfidential"
			name="isCompanyNameConfidential">
			<br>
			<form:option value="false" selected="selected">No</form:option>
			<form:option value="true">Yes</form:option>
		</form:select>
		<br>

		<!-- Main address of company -->
		<label for="address">Main Address of Company:</label>
		<form:input path="companyProfile.address.address" name="address" />
		<br>

		<label for="city">City:</label>
		<form:input path="companyProfile.address.city" name="city" />
		<br>

		<label for="state">State:</label>
		<form:input path="companyProfile.address.state" name="state" />
		<br>

		<label for="zip">ZIP:</label>
		<form:input path="companyProfile.address.zip" name="zip" />
		<br>

		<!-- TODO:  add modal to ask if a different address should be associated with this job -->

		<label for="phone">Main phone:</label>
		<form:input path="companyProfile.phone" name="phone" />
		<br>

		<label for="website">Website:</label>
		<form:input path="companyProfile.website" name="website" />
		<br>

		<label for="industry">Industry:</label>
		<form:input path="companyProfile.industry" name="industry" />
		<br>

		<label for="companySize">Company Size:</label>
		<form:input path="companyProfile.companySize" name="companySize" />
		<br>

		<label for="companyLogo">Company Logo:</label>
		<form:input path="companyProfile.companyLogo" name="companyLogo" />
		<br>

		<label for="companyOneLineTextPitch">Company One-Line Text
			Pitch:</label>
		<form:input path="companyProfile.companyOneLineTextPitch"
			name="companyOneLineTextPitch" />
		<br>

		<label for="companyVideoPitch">Company One-Minute Video Pitch</label>
		<form:input path="companyProfile.companyVideoPitch"
			name="companyVideoPitch" />
		<br>


		<form:button type="submit" name="submit">Submit</form:button>
	
		</div>
	
	</form:form>
</body>
<%@ include file="/WEB-INF/jsp/layout/footer.jsp"%>
</html>