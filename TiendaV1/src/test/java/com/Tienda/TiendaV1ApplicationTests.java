package com.Tienda;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Tienda.modelo.Pokedex;
import com.Tienda.modelo.Pokemon;
import com.Tienda.modelo.Usuario;
import com.Tienda.service.PokedexImpl;
import com.Tienda.service.PokemonImpl;
import com.Tienda.service.UsuarioImpl;

@SpringBootTest
class TiendaV1ApplicationTests {
	@Autowired
	UsuarioImpl uServ;
	@Autowired
	PokedexImpl dexServ;
	@Autowired
	PokemonImpl monServ;

	@Test
	void contextLoads() {
		List<Pokemon> listaPokemons = monServ.listarPokemones();
		Pokedex pDex = new Pokedex(1, listaPokemons);
		dexServ.agregarUnPokedex(pDex);
		Usuario usu1 = new Usuario(1, "Ignacio", "1234", "entrenador", pDex);
		uServ.agregarUnUsuario(usu1);
	}

}
