<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet"/>
</head>
<body>
<center>
<h1>Element Found:</h1>
<br>
<h2>Name:</h2>${rec.customerName}
<h2>ID:</h2>${rec.customerId}
<h2>Mobile</h2>${rec.customerMobile}
<h2>Email</h2>${rec.customerEmail}
<h2>Date of Birth</h2>${rec.customerDOB}

</center>
</body>
</html>