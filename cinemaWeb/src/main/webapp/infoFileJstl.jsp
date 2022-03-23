<%@page import="org.zefiro.cinemaweb.model.Film"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info film</title>
</head>
<body style="background-color: Darkblue; color: gold;">	
	<h1 style="text-align:center;"> ${film.getTitolo()} </h1>
			
	<h3>Trama:</h3>
	<p> ${film.getDescrizione()}</p>
	
	<h3>Orario: </h3><p>${film.getOraInizio()}</p>
	
	
	<a href="AcquistoBiglietti?ora=${film.getOraInizio()}&posti=${film.getPosti()}"><button>acquista biglietto</button></a>
	
</body>
</html>