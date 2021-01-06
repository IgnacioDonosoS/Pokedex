package com.Tienda.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tienda.modelo.Pokemon;
import com.Tienda.modelo.Usuario;

public interface PokemonRepo extends JpaRepository<Pokemon, Integer> {

	public List<Pokemon> listarPokemones();
	public Pokemon buscarPokemonPorId(int id);
	public void borrarUnPokemon(int id);
	public Pokemon modificarUnPokemon(Pokemon pokemon);
	public Pokemon agregarUnPokemon(Pokemon pokemon);
}