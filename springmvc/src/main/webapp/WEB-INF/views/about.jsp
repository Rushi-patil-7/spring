<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About page</title>
</head>
<body>
	<%String name =(String) request.getAttribute("name"); 
		String edu =(String) request.getAttribute("education");
	String time = (String) request.getAttribute("time");
		%>
	
	<h1>Hello from about page</h1>
	<h2>Hello Every one Myself,<%=name %> </h2>
	<h3>I have completed <%=edu %> in MCA</h3>
	<h4>Now the timing is, <%=time %></h4>
</body>
</html>