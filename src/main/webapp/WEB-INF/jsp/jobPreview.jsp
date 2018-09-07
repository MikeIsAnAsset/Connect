<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <% Job job = (Job) request.getAttribute("job"); %> --%>
<%-- <%@ page import="org.springframework.web.servlet.ModelAndView" %> --%>
<%-- <% ModelAndView mav = (Map) ModelAndView.getModelMap("job"); %>
 --%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/tabContent.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/layout/navbar.jsp"></c:import>



	<table class="table table-borderless">
		<tbody>
			<tr height="15%">

				<td width="30%">
					<div style="max-width: 100%">
						<ul class="grid cs-style-4">
							<li><figure>
									<div>
										<img src="images/gallery-img1.jpg" alt="image 1">
									</div>
									<figcaption>
										<h1>Sapien arcu</h1>
										<small>Cum sociis natoque penatibus.</small> <a href="#">Read
											More</a>
									</figcaption>
								</figure></li>
						</ul>
					</div>
				</td>




				<td>
				
					<%-- <ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item"><a class="nav-link active" id="home-tab"
			data-toggle="tab" href="#home" role="tab" aria-controls="home"
			aria-selected="true">Home</a></li>
		<li class="nav-item"><a class="nav-link" id="profile-tab"
			data-toggle="tab" href="#profile" role="tab" aria-controls="profile"
			aria-selected="false">Profile</a></li>
		<li class="nav-item"><a class="nav-link" id="contact-tab"
			data-toggle="tab" href="#contact" role="tab" aria-controls="contact"
			aria-selected="false">Contact</a></li>
	</ul>
	<div class="tab-content width="40%" id="myTabContent">
		<div class="tab-pane fade show" id="home" role="tabpanel"
			aria-labelledby="home-tab">${job.description}</div>
		<div class="tab-pane fade" id="profile" role="tabpanel"
			aria-labelledby="profile-tab">aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..</div>
		<div class="tab-pane fade" id="contact" role="tabpanel"
			aria-labelledby="contact-tab">fffffffffffffffffffffffffffffffff...</div>
	</div>
				 --%>
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					<!-- <ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item"><a class="nav-link active" id="home-tab"
			data-toggle="tab" href="#home" role="tab" aria-controls="home"
			aria-selected="true">Home</a></li>
		<li class="nav-item"><a class="nav-link" id="profile-tab"
			data-toggle="tab" href="#profile" role="tab" aria-controls="profile"
			aria-selected="false">Profile</a></li>
		<li class="nav-item"><a class="nav-link" id="contact-tab"
			data-toggle="tab" href="#contact" role="tab" aria-controls="contact"
			aria-selected="false">Contact</a></li>
			
				<li class="nav-item"><a class="nav-link" id="mike-tab"
			data-toggle="tab" href="#mike" role="tab" aria-controls="mike"
			aria-selected="false">mike</a></li>
			
	</ul>
	<div class="tab-content" id="myTabContent">
		<div class="tab-pane fade show active tab-content1" id="home" role="tabpanel"
			aria-labelledby="home-tab"><small>TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT</small></div>
		<div class="tab-pane fade" id="profile" role="tabpanel"
			aria-labelledby="profile-tab">aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..</div>
		<div class="tab-pane fade" id="contact" role="tabpanel"
			aria-labelledby="contact-tab">fffffffffffffffffffffffffffffffff...</div>
			
			<div class="tab-pane fade" id="mike" role="tabpanel"
			aria-labelledby="mike-tab">mike</div>
	</div> -->


					<ul class="nav nav-tabs" id="myTab" role="tablist"
						style="padding-top: 15px">
						<li class="nav-item"><a class="nav-link active"
							id="jobDescription-tab" data-toggle="tab" href="#jobDescription"
							role="tab" aria-controls="jobDescription" aria-selected="true">Job
								Description</a></li>

						<li class="nav-item"><a class="nav-link"
							id="skillsRequired-tab" data-toggle="tab" href="#skillsRequired"
							role="tab" aria-controls="skillsRequired" aria-selected="false">Skills
								Required</a></li>

						<li class="nav-item"><a class="nav-link"
							id="otherRequirements-tab" data-toggle="tab"
							href="#otherRequirements" role="tab"
							aria-controls="otherRequirements" aria-selected="false">Other
								Requirements</a></li>

						<li class="nav-item"><a class="nav-link" id="jobPerks-tab"
							data-toggle="tab" href="#jobPerks" role="tab"
							aria-controls="jobPerks" aria-selected="false">Job Perks</a></li>

						<li class="nav-item"><a class="nav-link"
							id="growthOpportunity-tab" data-toggle="tab"
							href="#growthOpportunity" role="tab"
							aria-controls="growthOpportunity" aria-selected="false">Growth
								Opportunity</a></li>
					</ul>
					<div class="tab-content" id="myTabContent">
						<div class="tab-pane fade active tab-content1" id="jobDescription"
							role="tabpanel" aria-labelledby="jobDescription-tab">${job.description}</div>

						<div class="tab-pane fade tab-content1" id="skillsRequired"
							role="tabpanel" aria-labelledby="skillsRequired-tab">


							<c:forEach var="entry" items="${job.selectedSkills}">
Name:  ${entry} <br />

							</c:forEach>






							
						</div>

						<div class="tab-pane fade tab-content1" id="otherRequirements"
							role="tabpanel" aria-labelledby="otherRequirements-tab">These are the requirements</div>

						<div class="tab-pane fade tab-content1" id="jobPerks"
							role="tabpanel" aria-labelledby="jobPerks-tab">These are the perks</div>

						<div class="tab-pane fade tab-content1" id="growthOpportunity"
							role="tabpanel" aria-labelledby="growthOpportunity-tab">This is the growth Opportunity</div>
					</div>

				</td>
			</tr>
		</tbody>
	</table>


      	<!--List of sheet music files with option to upload a new file-->
      	file start here 
      	<ul>
      		<c:forEach var="smFile" items="${allsmFiles}">
      			
      			
      			this is a test for each
      			
      			<li>
      				
      				
      				
      				
      				
      				
      				<img src="data:image/jpg;base64,${smFile.showPicture()}" class="img-circle"

height="65" width="65" alt="Avatar">
      				
      				
      			</li>
      		</c:forEach>
      	</ul>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<!-- 	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script> -->

	<script src="/js/bootstrap.min.js"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>


</body>
<%-- <%@ include file="/WEB-INF/jsp/layout/footer.jsp" %> --%>
</html>