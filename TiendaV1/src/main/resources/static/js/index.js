function mostrar(id) {
	document.getElementById("pokedex0").style.display = "none";
	document.getElementById("pokedex" + id).style.display = "none";
	document.getElementById("tablaObtenidos").style.display = "block";
	document.getElementById("titulo").style.visibility = "hidden"
	document.getElementById("titulo1").style.visibility = "hidden"
}

function seleccionar(id) {
	document.getElementById("pokedex" + (id - 1)).style.display = "block";
	document.getElementById("tablaObtenidos").style.display = "none";
	document.getElementById("titulo").style.visibility = "visible"; 
	document.getElementById("titulo1").style.visibility = "visible"; 
}

function siguiente(id) {
	document.getElementById("pokedex" + id).style.display = "none";
	document.getElementById("pokedex" + (id + 1)).style.display = "block";
}

function siguientePokemonFinal() {
	document.getElementById("pokedex" + (document.getElementById("numeroPokemones").value - 1)).style.display = "none";
	document.getElementById("pokedex0").style.display = "block";
}

function siguientePokemon0() {
	document.getElementById("pokedex0").style.display = "none";
	document.getElementById("pokedex1").style.display = "block";
	document.getElementById("tablaObtenidos").style.display = "none";
}

function anterior(id) {

	document.getElementById("pokedex" + id).style.display = "none";
	document.getElementById("pokedex" + (id - 1)).style.display = "block";
}
function anteriorPokemon0() {

	document.getElementById("pokedex" + (document.getElementById("numeroPokemones").value - 1)).style.display = "block";
	document.getElementById("pokedex" + (0)).style.display = "none";
}


function cincoSiguientes(id) {
	if ((id + 5) > (document.getElementById("numeroPokemones").value) - 1) {
		document.getElementById("pokedex" + id).style.display = "none";
		document.getElementById("pokedex" + (document.getElementById("numeroPokemones").value - 1)).style.display = "block";
	} else {
		document.getElementById("pokedex" + id).style.display = "none";
		document.getElementById("pokedex" + (id + 5)).style.display = "block";
	}
	}


	function cincoAnteriores(id) {
		if ((id - 5) < 0) {
			document.getElementById("pokedex" + id).style.display = "none";
			document.getElementById("pokedex0").style.display = "block";
		} else {
			document.getElementById("pokedex" + id).style. display = "none";
			document.getElementById("pokedex" + (id - 5)).style.display = "block";
		}
	}

function irA(){
	location.href = "captura"
}