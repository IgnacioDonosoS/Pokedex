function mostrar(id) {
    document.getElementById("pokedex0").style.display = "none";
    document.getElementById("pokedex" + id).style.display = "none";
    document.getElementById("tablaObtenidos").style.display = "block";
}

function seleccionar(id) {
    document.getElementById("pokedex" + (id - 1)).style.display = "block";
    document.getElementById("tablaObtenidos").style.display = "none";
}

function siguiente(id) {
    if ((id) > document.getElementById("numeroPokemones").value) {
        alert("No tienes más pokemones")
    } else {
        document.getElementById("pokedex" + id).style.display = "none";
        document.getElementById("pokedex" + (id + 1)).style.display = "block";
    }

}

function siguientePokemon0() {
    document.getElementById("pokedex0").style.display = "none";
    document.getElementById("pokedex1").style.display = "block";
    document.getElementById("tablaObtenidos").style.display = "none";
}

function anterior(id) {
    if ((id - 1) < 0) {
        alert("Llegaste al pokemon número 1")

    } else {
        document.getElementById("pokedex" + id).style.display = "none";
        document.getElementById("pokedex" + (id - 1)).style.display = "block";
    }

}

function cincoSiguientes(id) {
    if ((id + 5) > document.getElementById("numeroPokemones").value) {
        alert("No tienes 5 más pokemones")
    } else {
        document.getElementById("pokedex" + id).style.display = "none";
        document.getElementById("pokedex" + (id + 5)).style.display = "block";
    }
  function cincoSiguientePokemon0() {
    document.getElementById("pokedex0").style.display = "none";
    document.getElementById("pokedex4").style.display = "block";
    document.getElementById("tablaObtenidos").style.display = "none";
}

    function cincoAnteriores(id) {
        if ((id - 5) < 0) {
            alert("Llegaste al pokemon número 1")
        } else {
            document.getElementById("pokedex" + id).style.display = "none";
            document.getElementById("pokedex" + (id - 5)).style.display = "block";
        }
    }
}
