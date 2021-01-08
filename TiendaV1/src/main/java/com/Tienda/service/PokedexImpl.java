package com.Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tienda.Repository.PokedexRepo;
import com.Tienda.modelo.Pokedex;

@Service
public class PokedexImpl implements IPokedex {
	@Autowired
	PokedexRepo pRepo;

	@Override
	public List<Pokedex> listarPokedexs() {
		return pRepo.findAll();
	}

	@Override
	public Pokedex buscarPokedexPorId(int id) {
		if (pRepo.getOne(id) != null) {
			return pRepo.getOne(id);
		} else {
			return null;
		}
	}

	@Override
	public void borrarUnPokedex(int id) {
		if (pRepo.getOne(id) != null) {
			pRepo.deleteById(id);
		}
	}

	@Override
	public Pokedex modificarUnPokedex(Pokedex pokedex) {
		if (pRepo.getOne(pokedex.getIdPokedex()) != null) {	
			return pRepo.save(pokedex);
		} else {
			return null;
		}
	}

	@Override
	public Pokedex agregarUnPokedex(Pokedex pokedex) {
			return pRepo.save(pokedex);
	}
}