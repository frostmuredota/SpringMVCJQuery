<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/buttons.js" />"></script>
</head>
<body>
	<div id="d1" class="div1"></div>
	<table align="center">
		<tr>

		<tr>
			<th colspan="4">Select a Color</th>
				</tr>
		
		<tr>
		<td><input type="radio" name="figure" id="r1"/>Yellow<input type="radio"
				name="figure" id="r2"/>Blue<input type="radio" name="figure" id="r3" />Red<input
				type="radio" name="figure" id="r4" />Black</td>
		</tr>
		<tfoot align="center">
		<tr>
		<td><button id="bcolor">Change!!</button></td>
		</tr>
		</tfoot>
		
	</table>
</body>
</html>
