<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="bootstrap.jsp" %>
</head>

<body>
<form action="register" method="post">
<input type="text" placeholder="Enter Namee " class="form-control">
<input type="text" placeholder="Enter Branch " class="form-control">
<input type="email" placeholder="Enter Email " class="form-control">
<input type="password" placeholder="Enter Password " class="form-control">
<input type="number" placeholder="Enter PhoneNumber " class="form-control">
<button type="submit">Register</button>
</form>

</body>
</html>