package com.Tienda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Tienda.modelo.Pokemon;

@Service
public interface IPokemon {

	public List<Pokemon> listarPokemones();
	public Pokemon buscarPokemonPorId(int id);
	public void borrarUnPokemon(int id);
	public Pokemon modificarUnPokemon(Pokemon pokemon);
	public Pokemon agregarUnPokemon(Pokemon pokemon);
}
