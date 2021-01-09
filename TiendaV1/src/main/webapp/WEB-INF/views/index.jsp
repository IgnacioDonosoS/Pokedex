<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/estiloPokedex.css"
	media="screen" />
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<title>Document</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<c:forEach items="${usuario.pokedex.pokemon}" var="u" begin="0" end="0">
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
						<img src="${u.imagen }" alt="psykokwak" height="170" />
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
					<strong>Nombre:</strong> ${u.nombrePokemon} <br /> <strong>Tipo:</strong>
					${u.tipoPokemon}<br /> <strong>Altura:</strong> ${u.altura} metros<br />
					<strong>Peso:</strong> ${u.peso} Kg.<br /> <br /> <strong>Evoluciones</strong><br/>
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
				<div id="yellowBox1"></div>
				<div id="yellowBox2"></div>
				<div id="bg_curve1_right"></div>
				<div id="bg_curve2_right"></div>
				<div id="curve1_right"></div>
				<div id="curve2_right"></div>
			</div>
		</div>
	</c:forEach>

	<c:forEach items="${usuario.pokedex.pokemon}" var="p" begin="1">
		<div id="pokedex${p.idPokemon}" style="display: none">
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
						<img src="${p.imagen }" alt="psykokwak" height="170" />
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
					<strong>Nombre:</strong> ${p.nombrePokemon} <br /> <strong>Tipo:</strong>
					${p.tipoPokemon}<br /> <strong>Altura:</strong> ${p.altura} metros<br />
					<strong>Peso:</strong> ${p.peso} Kg.<br /> <br /> <strong>Evoluciones</strong><br />
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
				<div id="yellowBox1"></div>
				<div id="yellowBox2"></div>
				<div id="bg_curve1_right"></div>
				<div id="bg_curve2_right"></div>
				<div id="curve1_right"></div>
				<div id="curve2_right"></div>
			</div>
		</div>
	</c:forEach>
</body>






<div id="tablaObtenidos">
	<table>
    <!-- here should go some titles... -->
    <tr>
        <th>Nombre:</th>
        
        <th>Imagen:</th>
    </tr>
   <c:forEach items="${usuario.pokedex.pokemon}" var="m">
    <tr>
        <td id="pokemon${m.idPokemon}" class="btn">
            ${m.nombrePokemon}
        </td>
        <td id="pokemon${m.idPokemon}" class="btn">
            <img src="${m.miniaturas}"/>
        </td>
    </tr>
    </c:forEach>
</table>
	

</div>



</body>
</html>