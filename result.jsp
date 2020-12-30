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
		<%@page import="sajid.disp"%>
		<%@page import="java.util.Iterator"%>
		<table border="1" width="1360">
			<tr>
				<td width="40"><b>ID</b></td>
				<td width="40"><b>FIR_NO</b></td>
				<td width="40"><b>Name</b></td>
				<td width="40"><b>Father's Name(victim)</b></td>
				<td width="40"><b>Address(victim)</b></td>
				<td width="40"><b>Mobile_no</b></td>
				<td width="40"><b>Name(Accused)</b></td>
				<td width="40"><b>Father's Name(Accused)</b></td>
				<td width="40"><b>Address(Accused)</b></td>
				<td width="40"><b>Event_place</b></td>
				<td width="40"><b>Time</b></td>
				<td width="40"><b>Event_Detail</b></td>
				<td width="40"><b>Date</b></td>
			</tr>
			<%Iterator itr;%>
			<% List data= (List)request.getAttribute("data"); %>
			<% for (int i=0; i<data.size(); i++ ) {%>
			<tr>
				<%disp ob=(disp)data.get(i); %>
				<td><%= ob.getId() %></td>
				<td><%=ob.getRegistraion_no() %></td>
				<td><%= ob.getName()%></td>
				<td><%= ob.getFname()%></td>
				<td><%= ob.getAdd()%></td>
				<td><%= ob.getM_no()%></td>
				<td><%= ob.getAname()%></td>
				<td><%= ob.getFname_a()%></td>
				<td><%= ob.getAdd_a()%></td>
				<td><%= ob.getEv()%></td>
				<td><%= ob.getTime()%></td>
				<td><%= ob.getE_d()%></td>
				<td><%= ob.getDat()%></td>


			</tr>


			<%}%>


		</table>
		<form action="update" style="max-width: 500px; margin: auto"
			method="post">
			<h2>Access the Detail By ID_NO</h2>
			<div class="input-container">
				<label for="usrnm"><b>Enter Section_NO</b></label> <i
					class="fa fa-user icon"></i> <input class="input-field" type="text"
					placeholder="Section-NO" name="usrnm">
			</div>
			<label for="fir"><b>Enter FIR_NO</b></label> <i
				class="fa fa-user icon"></i> <input class="input-field" type="text"
				placeholder="FIR-NO" name="fir">
			</div>
			<button type="submit" class="registerbtn">Access</button>
		</form>
	</body>
</html>
