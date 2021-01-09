function mostrar(id){
document.getElementById("pokedex1").style.display = "none";
document.getElementById("pokedex" + id).style.display = "none";
document.getElementById("tablaObtenidos").style.display = "block";
}
function seleccionar(id){
document.getElementById("pokedex" + id).style.display = "block";
document.getElementById("tablaObtenidos").style.display = "none";
}
