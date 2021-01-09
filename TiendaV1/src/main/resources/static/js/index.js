function mostrar(id){
document.getElementById("pokedex0").style.display = "none";
document.getElementById("pokedex" + id).style.display = "none";
document.getElementById("tablaObtenidos").style.display = "block";
}
function seleccionar(id){
document.getElementById("pokedex" + (id-1)).style.display = "block";
document.getElementById("tablaObtenidos").style.display = "none";
}
function siguiente(id){
document.getElementById("pokedex" + id).style.display = "none";
document.getElementById("pokedex" + (id+1)).style.display = "block";
}
function siguientePokemon0(){
document.getElementById("pokedex0").style.display = "none";
document.getElementById("pokedex1").style.display = "block";
document.getElementById("tablaObtenidos").style.display = "none";
}
function anterior(id){
document.getElementById("pokedex" + id).style.display = "none";
document.getElementById("pokedex" + (id-1)).style.display = "block";
}
function cincoSiguientes(id)
{
document.getElementById("pokedex" + id).style.display = "none";
document.getElementById("pokedex" + (id+5)).style.display = "block";
}
function cincoAnteriores(id)
{
document.getElementById("pokedex" + id).style.display = "none";
document.getElementById("pokedex" + (id-5)).style.display = "block";
}

