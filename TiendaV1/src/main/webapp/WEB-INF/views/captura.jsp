<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="js/index.js"></script>
</head>
<body>
	<h1>Acá se ingresa el pokemon</h1>

	<table>
		<!-- here should go some titles... -->
		<tr>
			<th>Id:</th>
			<th>Nombre:</th>
			<th>Miniatura:</th>
			<th>Agregar a tu colección</th>
		</tr>
	
	<c:forEach items="${pokemonesFaltantes}" var="p">
		<tr>
			<td>${p.idPokemon}</td>
			<td>${p.nombrePokemon}</td>
			<td><img src="${p.miniaturas}"/></td>
			<td><form method="POST" action="agregarPoke" id="pokeAgregar${p.idPokemon}">
			<input type="hidden" value="${p.idPokemon}" name="pokeAgregar"> 
			<input type="button" value="Agregar" id="pokeAgregar${p.idPokemon}" onclick="pokesAgregar(${p.idPokemon})">
			 <input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}">
			 </form></td>
	   </tr>
	</c:forEach>
</table>

</body>
</html>