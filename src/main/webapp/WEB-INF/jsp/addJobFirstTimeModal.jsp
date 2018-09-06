<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link rel="stylesheet" href="/css/addJobFirstTime.css">



<!-- <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
 -->
</head>


<div class="modal fade " id="addJobFirstTimeModal" tabindex="-1"
	role="dialog">
	<div class="modal-dialog " role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title">PREVIEW: Add a job to !</h4>
			</div>
			<div class="modal-body displayFlexGrow modalSizing">

				<div class="container">
					<div class="stepwizard">
						<div class="stepwizard-row setup-panel ">
							<div class="stepwizard-step">
								<a href="#step-1" type="button"
									class="btn btn-primary btn-circle">1</a>
								<p>Job</p>
							</div>
							<div class="stepwizard-step">
								<a href="#step-2" type="button"
									class="btn btn-default btn-circle" disabled="disabled">2</a>
								<p>Skills</p>
							</div>
							<div class="stepwizard-step">
								<a href="#step-3" type="button"
									class="btn btn-default btn-circle" disabled="disabled">3</a>
								<p>Company</p>
							</div>
							<div class="stepwizard-step">
								<a href="#step-4" type="button"
									class="btn btn-default btn-circle" disabled="disabled">4</a>
								<p>Branding</p>
							</div>
						</div>
					</div>

					<%-- 	<form:form action="addJobFirstTime" method="Post"
											modelAttribute="job" commandName="job"> --%>


					<form:form action="addJobFirstTime" id="submit-job" method="Post"
						modelAttribute="job" role="form" enctype="multipart/form-data">


						<div class="row setup-content" id="step-1" max-width="100%">
							<div class="col-xs-12 alignment">
								<div class="col-md-12">
									<!-- <h3>Add Job</h3> -->
									<div class="form-group">
										<form:label path="typeOfRole">Type of Role</form:label>
										<!-- 		<label for="Role">Type of Role</label> -->
										<form:input path="typeOfRole" name="Role" required="required"
											class="form-control" />
										<br>
									</div>

									<div class="form-group">
										<label for="jobTitle">Job Title: </label>
										<form:input path="jobTitle" name="jobTitle" />
										<br>
									</div>

									<div class="form-group">
										<label for="jobType">Job Type: </label>
										<form:input path="jobType" name="jobType" />
										<br>
									</div>

									<div class="form-group">
										<label for="jobCategory">Job Category: </label>
										<form:input path="jobCategory" name="jobCategory" />
										<br>
									</div>

									<div class="form-group">
										<label for="description">Job Description: </label>
										<form:input path="description" name="description" />
										<br>
									</div>



									<!-- <label class="control-label">First Name</label> <input
										maxlength="100" type="text" required="required"
										class="form-control" placeholder="Enter First Name" />
 -->
								</div>
								<!-- 	<div class="form-group">
									<label class="control-label">Last Name</label> <input
										maxlength="100" type="text" required="required"
										class="form-control" placeholder="Enter Last Name" />
								</div> -->
								<div class="form-group">
									<button
										class="modal-footer btn btn-primary nextBtn btn-lg pull-right"
										type="button">Next</button>
								</div>
							</div>
						</div>

						<div class="row setup-content" id="step-2">
							<div class="col-xs-12">
								<div class="col-md-12">
									<!-- 	<h3>Add Skills</h3> -->
									<div class="form-group">
										<!-- Skills object -->

										<table>
											<c:if test="${not empty fieldNames}">

												<tr>
													<td><form:checkboxes items="${fieldNames}"
															path="selectedSkills" element="div class='checkbox'" /></td>
												</tr>
											</c:if>
										</table>
									</div>








									<!-- 									<div class="form-group">
										<label class="control-label">Company Name</label> <input
											maxlength="200" type="text" required="required"
											class="form-control" placeholder="Enter Company Name" />
									</div>
									<div class="form-group">
										<label class="control-label">Company Address</label> <input
											maxlength="200" type="text" required="required"
											class="form-control" placeholder="Enter Company Address" />
									</div> -->
									<button class="btn btn-primary nextBtn btn-lg pull-right"
										type="button">Next</button>
								</div>
							</div>
						</div>

						<div class="row setup-content" id="step-3">
							<div class="col-xs-12 alignment">
								<div class="col-md-12">
									<!-- 	<h3>Add Company</h3> -->
									<div class="form-group">
										<!-- Getting company information -->
										<label for="companyName">Company Name: </label>
										<form:input path="companyProfile.companyName"
											name="companyName" />
										<br>
									</div>

									<div class="form-group">
										<label for="isCompanyNameConfidential"> Is Company
											Name Confidential?</label>
										<form:select path="companyProfile.isCompanyNameConfidential"
											name="isCompanyNameConfidential">
											<br>
											<form:option value="false" selected="selected">No</form:option>
											<form:option value="true">Yes</form:option>
										</form:select>
										<br>
									</div>

									<div class="form-group">
										<!-- Main address of company -->
										<label for="address">Main Address of Company:</label>
										<form:input path="companyProfile.address.address"
											name="address" />
										<br>
									</div>

									<div class="form-group">
										<label for="city">City:</label>
										<form:input path="companyProfile.address.city" name="city" />
										<br>
									</div>

									<div class="form-group">
										<label for="state">State:</label>
										<form:input path="companyProfile.address.state" name="state" />
										<br>
									</div>

									<div class="form-group">
										<label for="zip">ZIP:</label>
										<form:input path="companyProfile.address.zip" name="zip" />
										<br>
									</div>

									<!-- TODO:  add modal to ask if a different address should be associated with this job -->

									<div class="form-group">
										<label for="phone">Main phone:</label>
										<form:input path="companyProfile.phone" name="phone" />
										<br>
									</div>

									<div class="form-group">
										<label for="website">Website:</label>
										<form:input path="companyProfile.website" name="website" />
										<br>
									</div>

									<div class="form-group">
										<label for="industry">Industry:</label>
										<form:input path="companyProfile.industry" name="industry" />
										<br>
									</div>

									<div class="form-group">
										<label for="companySize">Company Size:</label>
										<form:input path="companyProfile.companySize"
											name="companySize" />
										<br>
									</div>

									<button class="btn btn-primary nextBtn btn-lg pull-right"
										type="button">Next</button>

								</div>
							</div>
						</div>



						<div class="row setup-content" id="step-4">
							<div class="col-xs-12 alignment">
								<div class="col-md-12">



									<div class="form-group">
										<label for="companyLogo">Company Logo:</label>
										<form:input path="companyProfile.companyLogo"
											name="companyLogo" />
										<br>
									</div>

									<div class="form-group">
										<label for="companyOneLineTextPitch">Company One-Line
											Text Pitch:</label>
										<form:input path="companyProfile.companyOneLineTextPitch"
											name="companyOneLineTextPitch" />
										<br>
									</div>

									<%-- <div class="form-group">
										<label for="companyVideoPitch">Company One-Minute
											Video Pitch</label>
										<form:input path=""
											name="companyVideoPitch" class="input-file" type="file" value="upload"/>
										<br>
									</div> --%>
									
										<div class="form-group">
										<label for="companyVideoPitch">Company One-Minute
											Video Pitch</label>
										<input 
											name="companyVideoPitch" class="input-file" type="file" value="upload"/>
										<br>
									</div>
									
									
									
									

<!--           File Button 
          <div class="form-group">
            <label class=" control-label" for="filebutton">Avatar</label>
            <div class="">
              <input id="filebutton" name="filebutton" class="input-file" type="file" value="filebutton">
            </div>
          </div>
 -->









									<!-- <div class="modal-footer row setup-content" id="step-4">
										<div class="col-xs-12">
											<div class="col-md-12">
												<h3>Step 4</h3> -->
												<button class="btn btn-success btn-lg pull-right"
													type="submit">Preview!</button>
										<!-- 	</div>
										</div>
									</div> -->

								</div>
							</div>
						</div>










					</form:form>

				</div>

			</div>
			<!-- 		<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Save changes</button>
			</div> -->

		</div>
		/.modal-content
	</div>
	/.modal-dialog /.modal
</div>

<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="/js/addNewJobFirstTime.js" type="text/javascript"></script>

<!-- <script type="text/javascript">
$("#submit-job").submit();
$("#submit-file").submit();

</script> -->

</html>


