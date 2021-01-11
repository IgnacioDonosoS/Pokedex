package com.Tienda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Tienda.Repository.UsuarioRepo;
import com.Tienda.modelo.Pokemon;
import com.Tienda.modelo.Usuario;

@Service
public class UsuarioImpl implements IUsuario {

	@Autowired
	UsuarioRepo uRepo;
	@Autowired
	UsuarioImpl usuarioServ;
	@Autowired
	PokemonImpl pokemonServ;

	@Override
	public List<Usuario> listarUsuarios() {
		return uRepo.findAll();
	}

	@Override
	public Usuario buscarUsuarioPorId(int id) {
		if (uRepo.getOne(id) != null) {
			return uRepo.getOne(id);
		} else {
			return null;
		}
	}

	@Override
	public void borrarUnUsuario(int id) {
		if (uRepo.getOne(id) != null) {
			uRepo.deleteById(id);
		}
	}

	@Override
	public Usuario modificarUnUsuario(Usuario usuario) {
		if (uRepo.getOne(usuario.getIdUsuario()) != null) {
			return uRepo.save(usuario);
		} else {
			return null;
		}
	}

	@Override
	public Usuario agregarUnUsuario(Usuario usuario) {
		return uRepo.save(usuario);

	}

	@Override
	public Usuario buscarUsuarioPorNombre(String nombre) {
		if (uRepo.findByNombre(nombre) != null) {
			return uRepo.findByNombre(nombre);
		} else {
			return null;
		}
	}

	@Override
	public Usuario filtrarPokemonesPorIdEnUsuario(Usuario usuario) {
		List<Pokemon> todosPokemones = pokemonServ.listarPokemones();
		int numeroArray = pokemonServ.listarPokemones().size();
		ArrayList<Pokemon> listaFiltrada = new ArrayList<Pokemon>();
		for (int i = 0; i < numeroArray; i++) {
			for (int j = 0; j < usuario.getPokedex().getPokemon().size(); j++) {
				if (todosPokemones.get(i).getIdPokemon() == usuario.getPokedex().getPokemon().get(j).getIdPokemon()) {
					listaFiltrada.add(usuario.getPokedex().getPokemon().get(j));
				}
			}
		} 
		usuario.getPokedex().setPokemon(listaFiltrada);
		return usuario;
	}
}