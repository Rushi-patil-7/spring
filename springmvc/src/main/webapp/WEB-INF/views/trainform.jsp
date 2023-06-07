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

<title>Reservation Form</title>
</head>
<body>
	<h1 class="text-center text-capitalize">to proceed your journy, Kidly fill below details</h1>
	<div class="container w-50 mt-5 " >
		<form action="formprocess" method="POST">

			<div class="form-group row">
				<label for="inputEmail3" class="col-sm-2 col-form-label">Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="inputEmail3"
						placeholder="Enter Your Name" name="name">
				</div>
			</div>

			<fieldset class="form-group">
				<div class="row">
					<legend class="col-form-label col-sm-2 pt-0">Gender</legend>
					<div class="col-sm-10 d-flex">
						<div class="form-check mr-3">
							<input class="form-check-input" type="radio" name="gridRadios"
								id="gridRadios1" value="option1" checked> <label
								class="form-check-label" for="gridRadios1" name="gender">Male
							</label>
						</div>
						<div class="form-check ml-3">
							<input class="form-check-input" type="radio" name="gridRadios"
								id="gridRadios2" value="option2"> <label
								class="form-check-label" for="gridRadios2" name="gender">Female
							</label>
						</div>

					</div>
				</div>
			</fieldset>
			<div class="container d-flex">
				<div class="form-group">

					<div class="">
						<input type="text" class="form-control" placeholder="Seat No"
							name="seatNo">
					</div>
				</div>
				<div class="form-group ">

					<div class="">
						<input type="text" class="form-control" placeholder="Ticket No"
							name="ticketNo">
					</div>
				</div>
			</div>
			<div class="d-flex">
				<div class="form-group col-md-4">
					<label for="inputState">Arrival Point</label> <select
						id="inputState" class="form-control" name="arrival">
						<option selected>Choose...</option>
						<option>Mumbai</option>
						<option>Pune</option>
						<option>Nashik</option>
						<option>malegaon</option>
						<option>chalisgaon</option>
						<option>jalgaon</option>
						<option>Dhule</option>
					</select>
				</div>
				<div class="form-group col-md-4">
					<label for="inputState">Destination Point</label> <select
						id="inputState" class="form-control" name="destination">
						<option selected>Choose...</option>
						<option>Mumbai</option>
						<option>Pune</option>
						<option>Nashik</option>
						<option>malegaon</option>
						<option>chalisgaon</option>
						<option>jalgaon</option>
						<option>Dhule</option>
					</select>
				</div>
			</div>
			<h3>Aavailable Trains :</h3>
			<div class="form-group col-md-4">
				<label for="inputState">Select Train</label> <select id="inputState"
					class="form-control" name="trainName">
					<option selected>Choose...</option>
					<option>Mumbai Express</option>
					<option>Pune Express</option>
					<option>Nashik Express</option>
					<option>malegaon Express</option>
					<option>chalisgaon Express</option>
					<option>jalgaon Express</option>
					<option>Dhule Express</option>
				</select>
			</div>
			<div class="d-flex">
				<div class="col">
					<input type="text" class="form-control" placeholder="Train No"
						name="trainNo">
				</div>
				<div class="col">
					<input type="text" class="form-control" placeholder="Total Fare"
						name="fare">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-2">Payment</div>
				<div class="col-sm-10">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" id="gridCheck1">
						<label class="form-check-label" for="gridCheck1"> Tick
							this checkbox, if you have made payment </label>
					</div>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-10">
					<button type="submit" class="btn btn-primary">Generate
						Ticket</button>
				</div>
			</div>

		</form>
	</div>

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
