<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/estiloPokedex.css"
	media="screen" />
<title>Document</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<c:forEach items="${usuario.Pokemon}" var="u">
		<div id="pokedex">
			<div id="left">
				<div id="logo"></div>
				<div id="bg_curve1_left"></div>
				<div id="bg_curve2_left"></div>
				<div id="curve1_left">
					<div id="buttonGlass">
						<div id="reflect"></div>
					</div>
					<div id="miniButtonGlass1"></div>
					<div id="miniButtonGlass2"></div>
					<div id="miniButtonGlass3"></div>
				</div>
				<div id="curve2_left">
					<div id="junction">
						<div id="junction1"></div>
						<div id="junction2"></div>
					</div>
				</div>
				<div id="screen">
					<div id="topPicture">
						<div id="buttontopPicture1"></div>
						<div id="buttontopPicture2"></div>
					</div>
					<div id="picture">
						<img
							src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/200653/psykokwak.gif"
							alt="psykokwak" height="170" />
					</div>
					<div id="buttonbottomPicture"></div>
					<div id="speakers">
						<div class="sp"></div>
						<div class="sp"></div>
						<div class="sp"></div>
						<div class="sp"></div>
					</div>
				</div>
				<div id="bigbluebutton"></div>
				<div id="barbutton1"></div>
				<div id="barbutton2"></div>
				<div id="cross">
					<div id="leftcross">
						<div id="leftT"></div>
					</div>
					<div id="topcross">
						<div id="upT"></div>
					</div>
					<div id="rightcross">
						<div id="rightT"></div>
					</div>
					<div id="midcross">
						<div id="midCircle"></div>
					</div>
					<div id="botcross">
						<div id="downT"></div>
					</div>
				</div>
			</div>
			<div id="right">
				<div id="stats">

					<strong>Name:</strong>
					<c:out value="${u.pokemon.nombrePokemon}"></c:out>
					<br /> <strong>Type:</strong>
					<c:out value="${u.pokemon.tipoPokemon}"></c:out>
					Water<br /> <strong>Altura:</strong>
					<c:out value="${u.pokemon.altura}"></c:out>
					<br /> <strong>Peso:</strong>
					<c:out value="${u.pokemon.peso}"></c:out>
					<br /> <br /> <strong>Evoluciones</strong><br />
					<c:out value="${u.pokemon.frase}"></c:out>
				</div>
			</div>
			<div id="blueButtons1">
				<div class="blueButton"></div>
				<div class="blueButton"></div>
				<div class="blueButton"></div>
				<div class="blueButton"></div>
				<div class="blueButton"></div>
			</div>
			<div id="blueButtons2">
				<div class="blueButton"></div>
				<div class="blueButton"></div>
				<div class="blueButton"></div>
				<div class="blueButton"></div>
				<div class="blueButton"></div>
			</div>
			<div id="miniButtonGlass4"></div>
			<div id="miniButtonGlass5"></div>
			<div id="barbutton3"></div>
			<div id="barbutton4"></div>
			<div id="yellowBox1"></div>
			<div id="yellowBox2"></div>
			<div id="bg_curve1_right"></div>
			<div id="bg_curve2_right"></div>
			<div id="curve1_right"></div>
			<div id="curve2_right"></div>
		</div>
	</c:forEach>

</body>
</html>