<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<%@include file="/WEB-INF/components/bootstrap.jsp"%>
<title>Insert title here</title>
</head>
<body>
<%@include file="/WEB-INF/components/navbar.html" %>
	<button type="button" class="btn btn-primary float-right m-5"
		data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">Add Item</button>
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Add new Item to
						list</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="menulist" method="POST">
						<div class="form-group">
							<label for="item-name" class="col-form-label">Item Name:</label>
							<input type="text" class="form-control" id="item-name"
								name="itemName">
						</div>
						<div class="form-group">
							<label for="item-price" class="col-form-label">Item
								Price:</label> <input type="number" class="form-control" id="item-price"
								name="itemPrice">
						</div>
						<div class="form-group">
							<label for="item-type" class="col-form-label">Categeory:</label>
							<select class="custom-select mb-3" id="item-type" name="categeory" >
								
								<c:forEach items="${Menu}" var="item">
								<option value=${item.categeory }>${item.categeory }</option>
								</c:forEach>
							</select>
						</div>
						
					</div>
					
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Add Item</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<!-- Button trigger modal -->


<!-- Modal -->

	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Menu Items</th>
				<th scope="col">Price</th>				
				<th scope="col">Categeory</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${Menu}" var="item">
				<tr>
					<th scope="row">${item.itemid}</th>
					<td>${item.itemName }</td>
					<td>${item.itemPrice }</td>
					<td>${item.categeory }</td>
					<td>
					<a  href="update/${item.itemid }" data-toggle="modal" data-target="#updateModal" data-whatever="@mdo"><i class="fa fa-edit pr-3"></i>
					<a href="delete/${item.itemid }" "><i class="fas fa-trash-alt text-danger "></i></a>	
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<!--Update product details starts here -->
	
	<div class="modal fade" id="updateModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Update Item to
						list</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="${pageContext.request.contextPath }/menulist" method="POST">
						<div class="form-group">
							<label for="item-name" class="col-form-label">Item Name:</label>
							<input type="text" class="form-control" id="item-name"
								name="itemName" value="${items.itemName }">
						</div>
						<div class="form-group">
							<label for="item-price" class="col-form-label">Item
								Price:</label> <input type="number" class="form-control" id="item-price"
								name="itemPrice" value="${items.itemPrice }">
						</div>
						<div class="form-group">
							<label for="item-type" class="col-form-label">Categeory:</label>
							<input type="text" class="form-control" id="item-type" name="categeory" value="${items.categeory }" >
						</div>
					</div>
					
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Update Item</button>
					</div>
				</form>
			</div>
		</div>
	
</body>
</html>