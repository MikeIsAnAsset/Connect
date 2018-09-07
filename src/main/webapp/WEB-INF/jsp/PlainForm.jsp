<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>
	<h1>This is a plain form</h1>

	<form action="addJobFirstTime" id="submit-job" method="Post" enctype="multipart/form-data"
		 >
		>
		<div class="form-group">
			<label for="file">Company One-Minute Video Pitch</label>
			<input name="file" class="input-file" type="file"
				value="upload" /> <br>
		</div>
		<button class="btn btn-success btn-lg pull-right" type="submit">Preview!</button>
	</form>

</body>


</html>