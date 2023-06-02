<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Contact us Form</title>
</head>
<body>

	<h2 class="text-center mt-5 pt-2">Contact with Us</h2>
	<form action="processform" method ="post" class="container mt-5">
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input
				type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email" name="userEmail">
		</div>
		<div class="form-group">
			<label for="userName">User Name</label> <input type="userName"
				class="form-control" id="userName" aria-describedby="usernameHelp"
				placeholder="Enter User Name" name="username">
		</div>
		<div class="form-group">
			<label for="mobile">User Name</label> <input type="mobile"
				class="form-control" id="userName" aria-describedby="mobileHelp"
				placeholder="Enter User Name" name="mobile">
		</div>
		<div class="form-group">
			<label for="exampleFormControlTextarea1">Type a message for us: </label>
			<textarea class="form-control" id="exampleFormControlTextarea1"
				rows="3" name="feedback"></textarea>
		</div>
		<div class="container text-center">
			<button class ="btn btn-success" type ="submit">Submit form</button>
		</div>
	</form>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>