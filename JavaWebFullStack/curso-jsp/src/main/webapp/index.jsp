<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Curso JSP</title>
	</head>
	
	<body>
	
		<h1>Bem Vindo ao Curso JSP</h1>
		
		<form action="ServletLogin" method="post">
		
			<input type="hidden" value="<%= request.getParameter("url") %>" name="url">
		
			<table>
				<tr>
					<td><label>Usuário:</label></td>
					<td><input name="user" type="text"></td>
				</tr>
				<tr>
					<td><label>Senha:</label></td>
					<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="acessar" ></td>
				</tr>
			</table>
			
		</form>
		
		<h4>${msg}</h4>
	
	</body>
	
</html>