function mostrar(id){
document.getElementById("pokedex1").style.display = "none";
document.getElementById("pokedex" + id).style.display = "none";
document.getElementById("tablaObtenidos").style.display = "block";
}
function seleccionar(id){
document.getElementById("pokedex" + id).style.display = "block";
document.getElementById("tablaObtenidos").style.display = "none";
}
function siguiente(id){
document.getElementById("pokedex" + id).style.display = "none";
document.getElementById("pokedex" + (id+1)).style.display = "block";
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
function cincoAnteriores()
{
document.getElementById("pokedex" + id).style.display = "none";
document.getElementById("pokedex" + (id-5)).style.display = "block";
}

