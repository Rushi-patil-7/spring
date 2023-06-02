<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First file</title>
</head>
<body>

<%int id = (Integer)request.getAttribute("roll_no");
	String name = (String)request.getAttribute("myname");
	List <String > friendlist =(List<String>) request.getAttribute("myfriend");
%>
	<h1>Hello Rushi</h1>
	<h2>My name is : <%=name %></h2>
	<h2>my roll no is : <%=id %></h2>
	
	<% for(String i :friendlist){ %>
		<ul>
			<li><%=i %></li>
		</ul>
		
		<%}%>
	
</body>
</html>