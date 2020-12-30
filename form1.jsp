<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: black;
}

* {
	box-sizing: border-box;
}

/* Add padding to containers */
.container {
	padding: 16px;
	background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>
</head>
<header>
	<header class="w3-container w3-red w3-center" style="padding: 18px 0px">
		<img src="download10.png" style="margin-left: 580px" width="150px"
			height="160px" />\

	</header>
	<body>

		<form action="fir" method="post">
			<div class="container">
				<h1 style="text-align: center">FIR Registeration</h1>
				<h2>Registration Number is ${data}</h2>
				<hr>

				<label for="v"><b>Name of Victiim</b></label> <input type="text"
					placeholder="Enter Victim's Name" name="v" required> <label
					for="fv"><b>Father's Name of Victim</b></label> <input type="text"
					placeholder="Enter Victim's Name" name="fv" required> <label
					for="av"><b>Full Address of Victim</b></label> <input type="text"
					placeholder="Enter Victim's Address" name="av" required> <label
					for="mb"><b> Victim's Mobile-No</b></label> <input type="text"
					placeholder="Enter Victim's Mobile-No " name="mb" required>

				<label for="na"><b>Name of Accused</b></label> <input type="text"
					placeholder="Enter Name of Accused " name="na" required> <label
					for="fa"><b>Father's Name of Accused</b></label> <input type="text"
					placeholder="Enter Victim's Name" name="fa" required> <label
					for="aa"><b>Full Address of Accused</b></label> <input type="text"
					placeholder="Enter Victim's Name" name="aa" required> <label
					for="p"><b>Event-place</b></label> <input type="text"
					placeholder="Enter Event-place " name="p" required> <label
					for="d"><b>Date</b></label> <input type="Text"
					placeholder="YYYY-MM-DD" name="d" required> <label for="t"><b>Time</b></label>
				<input type="Text" placeholder="HH:MM:SS" name="t" required>

				<label for="dt"><b>Event-Detail</label> <input type="Text"
					placeholder="Enter Event-Details" name="dt" required>
				<hr>
				<label for="r"><b>R-NO</label> <input type="Text"
					placeholder="Registration_no" name="r" required>
				<hr>
				<button type="submit" class="registerbtn">Register</button>
			</div>

			<div class="container signin">
				<p>
					Already have an account? <a href="#">Sign in</a>.
				</p>
			</div>
		</form>

	</body>
</html>
