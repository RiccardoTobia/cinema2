<%@page import="org.zefiro.cinemaweb.model.Film"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InfoFilm</title>
</head>
<body style="background-color: Darkblue; color: gold;">
	<% Film movie = (Film) request.getAttribute("film"); %>	
	<h1 style="text-align:center;"> <%= movie.getTitolo() %></h1>
		
	<h3>Trama:</h3>
	<p> <%= movie.getDescrizione() %></p>
	
	<h3>Orario: </h3><p><%= movie.getOraInizio() %></p>
	
	
	<a href="AcquistoBiglietti?ora=<%= movie.getOraInizio()%>&posti=<%= movie.getPosti()%>"><button>acquista biglietto</button></a>
	
</body>
</html>