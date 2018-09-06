<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>

		<c:forEach items="${mapPins}" var="mapPinObject">
			<c:forEach items="${mapPinObject.getTraining()}" var="training">
				<ul style="list-style-type:none">
					<li><a href="/map?q=${training}">${training}</a></li>
				</ul>
			</c:forEach>

			<c:forEach items="${mapPinObject.getCoworking()}" var="coworking">
				<ul>
					<li><a href="/map?q=${coworking}">${coworking}</a></li>
				</ul>
			</c:forEach>
			
			<c:forEach items="${mapPinObject.getFunding()}" var="funding">
				<ul>
					<li><a href="/map?q=${funding}">${funding}</a></li>
				</ul>
			</c:forEach>
			
			<c:forEach items="${mapPinObject.getGuides()}" var="guides">
				<ul>
					<li><a href="/map?q=${guides}">${guides}</a></li>
				</ul>
			</c:forEach>
		</c:forEach>

	</div>

	<!-- 







for (GoogleMapPins object : MapPin.googleMapPins) {
	 for (ArrayList<String> ojbectField : object) {
		 <ul>
		 	<li><a href=${objectField}></a></li>
		 
		 </ul> 
	 }
 }
 
	for (Map.Entry<String,Object> entry : MapPin.entrySet()) {
	    String key = entry.getKey();
	    GoogleMapsPins value = entry.getValue();
	}

<li>    value.              </li>

Map myMap = (Map) request.getAttribute("training");  -->


	<c:if test="${not empty q}">
		<iframe width="600" height="450" frameborder="0" style="border: 0"
			id="idForiFrame"
			src="https://www.google.com/maps/embed/v1/place?key=AIzaSyDS3rP5L3ulLcs9tzMg4N3ozAZdWyqNbVA
    &q=${q}"
			allowfullscreen> </iframe>

	</c:if>

</body>
</html>