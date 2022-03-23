<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acquista Biglietto</title>
</head>
<body>
	<% LocalTime orario = (LocalTime)request.getAttribute("orario"); %>
	
	<h1> <%= orario %></h1>
	
</body>
</html>