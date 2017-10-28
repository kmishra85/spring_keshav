<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
<h1>Enter the Details</h1>
<form:form action="findCustomer.cj" method="post" commandName="customer">
Customer Id:<form:select path="customerId">
			<form:option value="1">Select Id form ...</form:option>	
			<c:forEach items="${key1}" var="li">
				<form:option value="${li}">${li}</form:option>
			</c:forEach>	
			</form:select>
			<form:errors path="customerId"></form:errors>
<input type="submit" value="Find">
</form:form>
</center>
</body>
</html>