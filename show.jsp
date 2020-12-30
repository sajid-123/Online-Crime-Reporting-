<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: white;
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
			height="160px" />
	</header>
	<body>
		<%@page import="java.util.*"%>
		<%@page import="sajid.getrecord"%>
		<%@page import="java.util.Iterator"%>
		<form action="display" style="max-width: 500px; margin: auto"
			method="post">
			<h2>Access the Detail By ID_NO</h2>
			<div class="input-container">
				<label for="usrnm"><b>Enter FIR-Number</b></label> <i
					class="fa fa-user icon"></i> <input class="input-field" type="text"
					placeholder="FIR-Number" name="usrnm">
			</div>
			<button type="submit" class="registerbtn">Access</button>
		</form>
		<table border="1" width="1300">
			<tr>
				<td width="130"><b>ID</b></td>
				<td width="125"><b>Fir_NO</b></td>
				<td width="128"><b>Mobile_NO</b></td>
				<td width="130"><b>Status</b></td>
				<td width="122"><b>Section</b></td>
			</tr>
			<%Iterator itr;%>
			<% List data= (List)request.getAttribute("data"); %>
			<% for (int i=0; i<data.size(); i++ ) {%>
			<tr>
				<%getrecord ob=(getrecord)data.get(i); %>
				<td><%= ob.getId() %></td>
				<td><%=ob.getFIR_NO() %></td>
				<td><%= ob.getMobile_No()%></td>
				<td><%= ob.getStaus()%></td>

				<td><%= ob.getSect()%></td>




			</tr>


			<%}%>


		</table>

	</body>
</html>
