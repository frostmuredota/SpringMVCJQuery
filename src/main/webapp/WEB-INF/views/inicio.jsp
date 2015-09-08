<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Spring MVC </title>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
<script type="text/javascript" src="<c:url value="/resources/js/initsession.js" />"></script>
</head>
<body>
		<br>
	<br>
	<div class="index">
		<h2>${message}</h2>
		<form method="post" action="exito.html" id="session" novalidate="novalidate">
			<table align="center">
				<tr>
					<td><label for="username">Username:</label></td>
					<td><input name="username" id="username"/>
					<label id="l1"></label></td>
				</tr>
				<tr>
					<td><label for="password">Password:</label></td>
					<td><input name="password" type="password" id="password"/>
					<label id="l2"></label></td>
				</tr>
				<tr>
				<td colspan=2><input type="submit" name="submit" value="Log In" /></td>
				</tr>
			</table>
		</form>
		<h3><font color="red">${error}</font></h3>
		
	</div>
</body>
</html>