package com.Tienda.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tienda.Repository.PokemonRepo;
import com.Tienda.modelo.Pokemon;

@Service
public class PokemonImpl implements IPokemon{
	
	@Autowired
	PokemonRepo poRepo;
	
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
			poRepo.save(pokemon);
			return pokemon;
		} else {
			return null;
		}
	}

	@Override
	public Pokemon agregarUnPokemon(Pokemon pokemon) {
		if (poRepo.getOne(pokemon.getIdPokemon()) == null) {
			poRepo.save(pokemon);
			return pokemon;
		} else {
			return null;
		}
	}

}