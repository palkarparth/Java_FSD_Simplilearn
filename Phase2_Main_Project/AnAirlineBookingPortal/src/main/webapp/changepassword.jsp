<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Forgot Password</h2>
		<form action="changepassword2.jsp" method="post">

			Old Password : <input type="text" name="oldpassword"><br>
			<br> New Password : <input type="text" name="newpassword"><br>
			<br> Conform Password : <input type="text" name="cnfmpassword"><br>
			<br>
			<button>Change Password</button>
			<br>


		</form>
	</center>
</body>
</html>