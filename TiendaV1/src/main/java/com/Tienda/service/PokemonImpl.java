package com.Tienda.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Tienda.Repository.PokemonRepo;
import com.Tienda.modelo.Pokemon;

@Service
public class PokemonImpl implements IPokemon{
	
	@Autowired
	PokemonRepo pRepo;
	
	@Override
	public List<Pokemon> listarPokemones() {
		return pRepo.findAll();
	}

	@Override
	public Pokemon buscarPokemonPorId(int id) {
		if (pRepo.getOne(id) != null) {
			return pRepo.getOne(id);
		} else {
			return null;
		}
	}

	@Override
	public void borrarUnPokemon(int id) {
		if (pRepo.getOne(id) != null) {
			pRepo.deleteById(id);
		}
	}

	@Override
	public Pokemon modificarUnPokemon(Pokemon pokemon) {
		if (pRepo.getOne(pokemon.getIdPokemon()) != null) {
			pRepo.save(pokemon);
			return pokemon;
		} else {
			return null;
		}
	}

	@Override
	public Pokemon agregarUnPokemon(Pokemon pokemon) {
		if (pRepo.getOne(pokemon.getIdPokemon()) == null) {
			pRepo.save(pokemon);
			return pokemon;
		} else {
			return null;
		}
	}

}
