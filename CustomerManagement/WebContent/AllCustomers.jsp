<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    
   import="com.cg.model.*"
    %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<link href="css/style.css" rel="stylesheet"/>

</head>

<body>
<center>
<h1>Details of the customers</h1>
<a href="index.cj">HOME</a>
<a href="start.cj">ADD NEW</a> <span>|</span>
<a href="findAll.cj">LIST</a>
	
	<table>
	<tr>
		<th>Customer ID:</th>
		<th>Customer Name:</th>
		<th>Customer Mobile:</th>
		<th>Customer Email:</th>
		<th>Customer DOB:</th>
		
	</tr>
	<c:forEach items="${ key1}" var="li">
	<tr>
		
		<td>${ li.customerId}</td>
		<td>${ li.customerName}</td>
		<td>${ li.customerMobile}</td>
		<td>${ li.customerEmail}</td>
		<td>${ li.customerDOB}</td>
		<td><a href="update.cj?customerId=${li.customerId}">EDIT</a></td>
		<td><a href="delete.cj?customerId=${li.customerId }">DELETE</a></td>
		
		
	</tr>
	</c:forEach>
	</table>	
	



</center>
</body>
</html>