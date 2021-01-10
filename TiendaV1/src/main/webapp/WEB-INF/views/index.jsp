<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/estiloPokedex.css"
	media="screen" />
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="js/index.js"></script>
<title>Document</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions"%>
</head>
<body class="row m-0 bg-dark justify-content-center align-items-center vh-100">
	<c:forEach items="${usuario.pokedex.pokemon}" var="u" begin="0" end="0" varStatus="i">
		<div id="pokedex0" style="display:block">
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
						<img src="${u.imagen}" alt="psykokwak" height="170" />
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
					<button id="leftcross" onclick= "anteriorPokemon0()">
						<div id="leftT"></div>
					</button>
					<button id="topcross" onclick= "cincoSiguientes(0)">
						<div id="upT"></div>
					</button>
					<button id="rightcross" onclick= "siguientePokemon0()">
						<div id="rightT"></div>
					</button>
					<button id="midcross">
						<div id="midCircle"></div>
					</button>
					<button id="botcross" onclick="cincoAnteriores(0)">
						<div id="downT"></div>
					</button>
				</div>
			</div>
			<div id="right">
				<div id="stats">
					<strong>Nombre:</strong> ${u.nombrePokemon} <br /> <strong>Tipo:</strong>
					${u.tipoPokemon}<br /> <strong>Altura:</strong> ${u.altura} metros<br />
					<strong>Peso:</strong> ${u.peso} Kg. <br> <strong>Evoluciones</strong><br />
					${u.frase}
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
				<button id="yellowBox1" onclick="mostrar(${i.count})">Colección</button>
				<div id="yellowBox2" class="btn"></div>
				<div id="bg_curve1_right"></div>
				<div id="bg_curve2_right"></div>
				<div id="curve1_right"></div>
				<div id="curve2_right"></div>
			</div>
		</div>
	</c:forEach>

	<c:forEach items="${usuario.pokedex.pokemon}" var="p" begin="1" end="${numeroPokemones - 2}" varStatus="i">
		<div id="pokedex${i.count}" style="display: none">
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
						<img src="${p.imagen}" alt="psykokwak" height="170" />
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
					<button id="leftcross" onclick="anterior(${i.count})">
						<div id="leftT"></div>
					</button>
					<button id="topcross" onclick="cincoSiguientes(${i.count})">
						<div id="downT"></div>
					</button>
					<button id="rightcross" onclick="siguiente(${i.count})">
						<div id="rightT"></div>
					</button>
					<button id="midcross">
						<div id="midCircle"></div>
					</button>
					<button id="botcross" onclick="cincoAnteriores(${i.count})">
						<div id="downT"></div>
					</button>
				</div>
			</div>
			<div id="right">
				<div id="stats">
					<strong>Nombre:</strong> ${p.nombrePokemon} <br /> <strong>Tipo:</strong>
					${p.tipoPokemon}<br /> <strong>Altura:</strong> ${p.altura} metros<br />
					<strong>Peso:</strong> ${p.peso} Kg.<br /> <strong>Evoluciones</strong><br />
					${p.frase}
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
				<button id="yellowBox1"
					onclick="mostrar(${i.count})">Colección</button>
				<div id="yellowBox2" class="btn"></div>
				<div id="bg_curve1_right"></div>
				<div id="bg_curve2_right"></div>
				<div id="curve1_right"></div>
				<div id="curve2_right"></div>
			</div>
		</div>
	</c:forEach>
	
	<c:forEach items="${usuario.pokedex.pokemon}" var="u" begin="${numeroPokemones - 1}" end="${numeroPokemones - 1}" varStatus="i">
		<div id="pokedex${numeroPokemones-1}" style="display:none">
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
						<img src="${u.imagen}" alt="psykokwak" height="170" />
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
					<button id="leftcross" onclick="anterior(${numeroPokemones-1})">
						<div id="leftT"></div>
					</button>
					<button id="topcross" onclick="cincoSiguientes(${numeroPokemones-1})">
						<div id="upT"></div>
					</button>
					<button id="rightcross" onclick="siguientePokemonFinal()">
						<div id="rightT"></div>
					</button>
					<button id="midcross">
						<div id="midCircle"></div>
					</button>
					<button id="botcross" onclick="cincoAnteriores(${numeroPokemones-1})">
						<div id="downT"></div>
					</button>
				</div>
			</div>
			<div id="right">
				<div id="stats">
					<strong>Nombre:</strong> ${u.nombrePokemon} <br /> <strong>Tipo:</strong>
					${u.tipoPokemon}<br /> <strong>Altura:</strong> ${u.altura} metros<br />
					<strong>Peso:</strong> ${u.peso} Kg. <br> <strong>Evoluciones</strong><br />
					${u.frase}
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
				<button id="yellowBox1" onclick="mostrar(${i.count})">Colección</button>
				<div id="yellowBox2" class="btn"></div>
				<div id="bg_curve1_right"></div>
				<div id="bg_curve2_right"></div>
				<div id="curve1_right"></div>
				<div id="curve2_right"></div>
			</div>
		</div>
	</c:forEach>
	
</body>






<div id="tablaObtenidos" style="display: none">
	<table>
		<!-- here should go some titles... -->
		<tr>
			<th>Nombre:</th>

			<th>Imagen:</th>
		</tr>
		<c:forEach items="${usuario.pokedex.pokemon}" var="m" varStatus="i">
			<tr>
				<td id="pokemon${i.count}" class="btn"
					onclick="seleccionar(${i.count})">${m.nombrePokemon}</td>
				<td id="pokemon${i.count}" class="btn"
					onclick="seleccionar(${i.count})"><img
					src="${m.miniaturas}" /></td>
			</tr>
		</c:forEach>
	</table>
<input type="hidden" id="numeroPokemones" value="${numeroPokemones}">

</div>



</body>
</html>