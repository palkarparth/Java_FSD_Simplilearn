<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name=(String)session.getAttribute("user"); %>
<jsp:useBean id="hello" class="com.simplilearn.userdetails" scope="session"></jsp:useBean>

  <h1>Thank you   <jsp:getProperty name="hello" property="fullname" />  <br>
</h1><h2>Please visit again.....</h2>
</body>
</html>