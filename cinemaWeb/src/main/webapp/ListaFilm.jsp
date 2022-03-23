<%@page import="org.zefiro.cinemaweb.model.Film"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Programma</title>
</head>
<body style="background-color: DarkBlue;">
	<h1 style="color: gold; text-align: center">Programma di oggi</h1>
	
		
	<table align="center" style="padding-top:10px; color: gold;">
		<thead>
			<tr>
				<th style="width: 20em; border: 1px solid black;">Titolo</th>
				<th style="width: 20em; border: 1px solid black;">Autore</th>
				<th style="width: 20em; border: 1px solid black;">Genere</th>
			</tr>
		</thead>
		<tbody>
			
	
		<%
			List<Film> list = (List<Film>) request.getAttribute("list"); %>
		<%
			for(Film movie : list){
				
		%>
				<tr>
					<td style="width: 20em; border: 1px solid black; text-align: center;"><a style="color: gold" href="GetInfoFilm?titolo=<%= movie.getTitolo()%>"><%= movie.getTitolo()%></a></td>
					<td style="width: 20em; border: 1px solid black; text-align: center;"><%= movie.getRegista()%></td>
					<td style="width: 20em; border: 1px solid black; text-align: center;"><%= movie.getOraInizio()%></td>
				</tr>
		<% 
			}
		%>
	
		</tbody>
	
	</table>
	
	
</body>
</html>