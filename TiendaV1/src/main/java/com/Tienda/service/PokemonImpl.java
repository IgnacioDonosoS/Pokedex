package com.Tienda.service;

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

		List<Pokemon> listaPokesUsu = usuServ.buscarUsuarioPorNombre(principalNombre).getPokedex().getPokemon();
		List<Pokemon> listaPokes = pokemonServ.listarPokemones();
		for (int i = 0; i < listaPokes.size(); i++) {
			for (int j = 0; j < listaPokesUsu.size(); j++) {
				if (listaPokes.get(i).getIdPokemon() == listaPokesUsu.get(j).getIdPokemon()) {
					listaPokes.remove(i);
				}
				;
			}
		}
		return listaPokes;
	}

	@Override
	public Pokemon agregarPokeUsuario(String principalNombre, int idPoke) {
		Usuario usu1 = usuServ.buscarUsuarioPorNombre(principalNombre);
		List<Pokemon> listaPokesUsu = usu1.getPokedex().getPokemon();
		listaPokesUsu.add(pokemonServ.buscarPokemonPorId(idPoke));
		Pokedex pdex = new Pokedex();
		pdex.setIdPokedex(usu1.getPokedex().getIdPokedex());
		pdex.setPokemon(listaPokesUsu);
		pokedexServ.modificarUnPokedex(pdex);
		return pokemonServ.buscarPokemonPorId(idPoke);
	}

}