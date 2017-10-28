<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1>Registration Success!</h1>
<h1>Thank you for registering</h1>
<h2>Name:</h2>${k.customerName}
<h2>ID:</h2>${k.customerId}
<h2>Mobile</h2>${k.customerMobile}
<h2>Email</h2>${k.customerEmail}
<h2>Date of Birth</h2>${k.customerDOB}



</center>
</body>
</html>