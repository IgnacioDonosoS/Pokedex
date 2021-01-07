package com.Tienda.service;

import java.util.List;
import com.Tienda.modelo.Pokemon;

public interface IPokemon {

	public List<Pokemon> listarPokemones();
	public Pokemon buscarPokemonPorId(int id);
	public void borrarUnPokemon(int id);
	public Pokemon modificarUnPokemon(Pokemon pokemon);
	public Pokemon agregarUnPokemon(Pokemon pokemon);
}
