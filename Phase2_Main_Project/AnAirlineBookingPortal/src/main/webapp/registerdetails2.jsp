<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<%
	String name = (String) session.getAttribute("user");
	%>
<jsp:useBean id="hello" class="com.simplilearn.userdetails"
		scope="session" />
	<jsp:setProperty property="*" name="hello" />  
	<jsp:forward page="reviewdetails.jsp" />
</body>


</html>