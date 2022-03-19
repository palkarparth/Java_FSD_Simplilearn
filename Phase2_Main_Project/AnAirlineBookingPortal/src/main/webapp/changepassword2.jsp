<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String pwd = request.getParameter("oldpassword");
String chg = request.getParameter("cnfmpassword");
String username = request.getParameter("username");%>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="Parth@123"/>  
<sql:query dataSource="${db}" var="rs">  
	SELECT password from user;  
</sql:query>  

<c:set var="password" value="<%=pwd %>"/>  
	<sql:update dataSource="${db}" var="count">  
		update user set password="<%=chg%>" WHERE password =?
	 <sql:param value="${password}" />  

</sql:update> 
	<% request.getRequestDispatcher("loginpage.jsp").include(request, response);
out.println("<SPAN  style ='color:red' 'text-align: centre'> Password change </SPAN>");
%> 
</body>
</html>