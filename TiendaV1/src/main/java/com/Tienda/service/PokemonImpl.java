package com.Tienda.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tienda.Repository.PokemonRepo;
import com.Tienda.modelo.Pokedex;
import com.Tienda.modelo.Pokemon;
import com.Tienda.modelo.Usuario;

@Service
public class PokemonImpl implements IPokemon {

	@Autowired
	PokemonRepo poRepo;
	@Autowired
	UsuarioImpl usuServ;
	@Autowired
	PokemonImpl pokemonServ;
	@Autowired
	PokedexImpl pokedexServ;

	@Override
	public List<Pokemon> listarPokemones() {
		return poRepo.findAll();
	}

	@Override
	public Pokemon buscarPokemonPorId(int id) {
		if (poRepo.getOne(id) != null) {
			return poRepo.getOne(id);
		} else {
			return null;
		}
	}

	@Override
	public void borrarUnPokemon(int id) {
		if (poRepo.getOne(id) != null) {
			poRepo.deleteById(id);
		}
	}

	@Override
	public Pokemon modificarUnPokemon(Pokemon pokemon) {
		if (poRepo.getOne(pokemon.getIdPokemon()) != null) {
			return poRepo.save(pokemon);
		} else {
			return null;
		}
	}

	@Override
	public Pokemon agregarUnPokemon(Pokemon pokemon) {
		return poRepo.save(pokemon);

	}

	@Override
	public List<Pokemon> filtrarPokemonFaltante(String principalNombre) {
		ArrayList<Pokemon> listaPokesUsu = new ArrayList<>(usuServ.buscarUsuarioPorNombre(principalNombre).getPokedex().getPokemon());
		ArrayList<Pokemon> listaFiltrada = new ArrayList<>(pokemonServ.listarPokemones());
		listaFiltrada.removeAll(listaPokesUsu);
		return listaFiltrada;
	}

	@Override
	public Pokemon agregarPokeUsuario(String principalNombre, int idPoke) {
		
		Usuario usu1 = usuServ.buscarUsuarioPorNombre(principalNombre);
		List<Pokemon> listaPokesUsu = usu1.getPokedex().getPokemon();
		listaPokesUsu.add(pokemonServ.buscarPokemonPorId(idPoke));
		Pokedex pdex = new Pokedex(usu1.getPokedex().getIdPokedex(), listaPokesUsu);
		pokedexServ.modificarUnPokedex(pdex);
		return pokemonServ.buscarPokemonPorId(idPoke);
	}

}