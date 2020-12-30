<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

.input-container {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	width: 100%;
	margin-bottom: 15px;
}

.icon {
	padding: 10px;
	background: dodgerblue;
	color: white;
	min-width: 50px;
	text-align: center;
}

.input-field {
	width: 100%;
	padding: 10px;
	outline: none;
}

.input-field:focus {
	border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
	background-color: dodgerblue;
	color: white;
	padding: 15px 20px;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.btn:hover {
	opacity: 1;
}
</style>
</head>
<body>
	
	<div class="w3-container w3-red " style="padding:18px 0px">
<h1 style="text-align:center" ><b>Online Cyber Security Analysis</b> </h1>

</div>
<img src="ab.png" width="1350" height="250" >
	<form action="reg" style="max-width: 500px; margin: auto" method="post">
		<h2>First Registration Page</h2>
		<div class="input-container">
			<i class="fa fa-user icon"></i> <input class="input-field"
				type="text" placeholder="Username" name="usrnm">
		</div>

		<div class="input-container">
			<i class="fa fa-mobile icon"></i> <input class="input-field"
				type="text" placeholder="Mobile_no" name="psw">
		</div>

		<button type="submit" class="btn">Register</button>
	</form>

</body>
</html>

