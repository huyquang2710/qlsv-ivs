<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student List</title>
<%@include file="/components/common_css_js.jsp"%>
</head>
<body>
	<div class="container">
		<div class="card mt-3">
				<h2 class="text-center">Student List</h2>
				
				<div class="container mb-3 btn-add">
					<a href="student/add" class="btn btn-outline-success" >Add Student</a>
					<a href="exportPDF" class="btn btn-outline-info" >Export to PDF</a>
				</div>	
					<table class="table table-hover text-center" border="1">
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Name</th>
								<th scope="col">Age</th>
								<th scope="col">Address</th>
								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${ student }" var="student" varStatus="status"> 
								<tr>
									<td>SV-${ student.id }</td>
									<td>${ student.name }</td>
									<td>${ student.age }</td>
									<td>${ student.address }</td>
									<td>
										<div>
											<a href="student/update/${ student.id }" class="btn btn-outline-info btn-action" >Update</a>
											<a href="student/delete/${ student.id }" class="btn btn-outline-danger btn-action" >Delete</a>
										</div>
									</td>
								</tr>
							</c:forEach>			
						</tbody>
					</table>
				</div>
	</div>
</body>
</html>