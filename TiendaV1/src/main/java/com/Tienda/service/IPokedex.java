package com.Tienda.service;

import java.util.List;

import com.Tienda.modelo.Pokedex;

public interface IPokedex {
	
	public List<Pokedex> listarPokedexs();
	public Pokedex buscarPokedexPorId(int id);
	public void borrarUnPokedex(int id);
	public Pokedex modificarUnPokedex(Pokedex pokedex);
	public Pokedex agregarUnPokedex(Pokedex pokedex);

}
