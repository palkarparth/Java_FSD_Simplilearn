<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = (String) session.getAttribute("user");
	%>
	<center>
		<img alt="payment done" width="300" height="500"
			src="https://complaintroom.in/uploads/complaints/6087ee660fb20/Screenshot_2021-04-27-16-22-59-487_net.one97.paytm.jpg">
		<br>
		<br>
		<form action="finalpage.jsp">
			<button>Done</button>
	</center>
	</form>
</body>
</html>