<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet"/>
</head>
<body>
<center>
<a href="index.cj">HOME</a>
<a href="start.cj">ADD NEW</a> <span>|</span>
<a href="findAll.cj">LIST</a>
<h1>Update Form</h1>
<form:form action="updateSuccess.cj" method="post" modelAttribute="cust" commandName="cust" >
<table>
	<tr>
			<td>Customer Name:</td>
			<td><form:input type="text" path="customerName"/>
				<form:errors path="customerName"/>
			</td>
	</tr>
	<tr>
			<td>Customer Id:</td>
			<td><form:input type="text" path="customerId"/>
				<form:errors path="customerId"/>
			</td>
	</tr>
	<tr>
			<td>Customer Mobile:</td>
			<td><form:input type="text" path="customerMobile"/>
				<form:errors path="customerMobile"/>
			</td>
	</tr>
	<tr>
			<td>Customer Email:</td>
			<td><form:input type="text" path="customerEmail"/>
				<form:errors path="customerEmail"/>
			</td>
	</tr>
	<tr>
			<td>Customer DOB:</td>
			<td><form:input type="text" path="customerDOB"/>
				<form:errors path="customerDOB"/>
			</td>
	</tr>
	<tr>
			<td  colspan="2"><input type="submit" value="Submit Form"></td>
	</tr>
</table>
</form:form>
</center>
</body>
</html>