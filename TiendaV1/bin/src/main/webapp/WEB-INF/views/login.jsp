<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<body>
	<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<link href="css/estiloLogin.css" rel="stylesheet">
	<script src="js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<title>Document</title>
</head>


<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">
<div class="container">
	<div class="card card-login mx-auto text-center bg-white">
		<div class="card-header mx-auto bg-white">
			<span> <img src="img/pokedexlogo.jpg" class="w-75" alt="Logo">
				<img src="img/pokeball.png" class="" alt="Logopokeball"></span>



			<!--            <h1>-->
			<?php //echo $message?>
			<!--</h1>-->

		</div>
		<div class="card-body">
			<form action="/login" method="Post" accept-charset="UTF-8"
				role="form">
				<div class="input-group form-group">
					<div class="input-group-prepend">
						<span class="input-group-text"><i class="fas fa-user"></i></span>
					</div>
					<input type="text" name="username" class="form-control"
						placeholder="Usuario">
				</div>

				<div class="input-group form-group">
					<div class="input-group-prepend">
						<span class="input-group-text"><i class="fas fa-key"></i></span>
					</div>
					<input type="password" name="password" class="form-control"
						placeholder="Contraseña">
				</div>



				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}"> <input
					class="btn btn-lg btn-danger btn-block" type="submit"
					value="Iniciar Sesión">

			</form>
		</div>
	</div>
</div>
</body>
</html>