<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Welcome to product List</h2>
	<h3>Here some of our products</h3>
	
	<h4>here is our first product, ${productName} </h4>
	<h4>price of ${productName} is  ${price }</h4>
	<h4>here is some of our product list, </h4>
	
	<c:forEach var="item" items="${productlist}" >
	
	<ul>
		<li>${item }</li>
	</ul>

	</c:forEach>
	
</body>
</html>