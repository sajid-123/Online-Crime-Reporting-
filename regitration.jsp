<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, h1, h2, h3, h4, h5, h6 {
	font-family: "Lato", sans-serif
}

.w3-bar, h1, button {
	font-family: "Montserrat", sans-serif
}

.fa-anchor, .fa-coffee {
	font-size: 200px
}
</style>
<body>

	<!-- Navbar -->

	<!-- Navbar on small screens -->
	<div id="navDemo"
		class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large">
		<a href="#" class="w3-bar-item w3-button w3-padding-large">Link
			1nvvcjhsf</a> <a href="#" class="w3-bar-item w3-button w3-padding-large">Link
			2</a> <a href="#" class="w3-bar-item w3-button w3-padding-large">Link
			3</a> <a href="#" class="w3-bar-item w3-button w3-padding-large">Link
			4</a>
	</div>
	</div>

	<!-- Header -->
	<header class="w3-container w3-red w3-center" style="padding: 18px 0px">
		<img src="download5.jpg" style="margin: 0" />

	</header>
	<marquee style="color: green">
		<i><b>Here you can register an FIR with correct Time and
				Event-place and you may take help by clicking on the option of
				contact & about</b></i>
	</marquee>
	<div class="w3-container w3-red w3-center" style="padding: 18px 0px">
		<a href="secret.jsp"
			class="w3-button w3-black w3-padding-large w3-large w3-margin-top">Registration</a>
		<a href="login.jsp"
			class="w3-button w3-black w3-padding-large w3-large w3-margin-top">Login
			Access</a> <a href="password.jsp"
			class="w3-button w3-black w3-padding-large w3-large w3-margin-top">Change
			Password</a>

	</div>
	<!-- Second Grid -->
	<div class="w3-container w3-red ">
		<img src="download.jpg" style="margin-left: 0px" width="300px"
			height="200px" /> <img src="download3.jpg" style="margin-left: 20px"
			width="300px" height="200px" /> <img src="download7.jpg"
			style="margin-left: 20px" width="300px" height="200px" /> <img
			src="download8.jpg" style="margin-left: 20px" width="300px"
			height="200px" />
	</div>
	<!-- Footer -->
	<footer class="w3-container w3-padding-64 w3-center w3-opacity">
		<div class="w3-xlarge w3-padding-32">
			<i class="fa fa-facebook-official w3-hover-opacity"></i> <i
				class="fa fa-instagram w3-hover-opacity"></i> <i
				class="fa fa-snapchat w3-hover-opacity"></i> <i
				class="fa fa-pinterest-p w3-hover-opacity"></i> <i
				class="fa fa-twitter w3-hover-opacity"></i> <i
				class="fa fa-linkedin w3-hover-opacity"></i>
		</div>
		<p>
			Powered by <a href="https://www.w3schools.com/w3css/default.asp"
				target="_blank">w3.css</a>
		</p>
	</footer>

	<script>
// Used to toggle the menu on small screens when clicking on the menu button
function myFunction() {
  var x = document.getElementById("navDemo");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
  } else { 
    x.className = x.className.replace(" w3-show", "");
  }
}
</script>

</body>
</html>