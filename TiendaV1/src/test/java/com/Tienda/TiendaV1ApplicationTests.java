package com.Tienda;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@SuppressWarnings("null")
	@Test
void contextLoads() {
		
		Usuario a = new Usuario();
		a.setIdUsuario(1);
		a.setNombre("angela");
		a.setPassword(encoder.encode("12345"));
		a.setRol("entrenador");
		List<Pokemon> pmon = monServ.listarPokemones();
		Pokedex pdex = new Pokedex(1, pmon);
		dexServ.modificarUnPokedex(pdex);
		a.setPokedex(pdex);
		uServ.modificarUnUsuario(a);
		Usuario d = new Usuario();
		d.setIdUsuario(2);
		d.setNombre("nacho");
		d.setPassword(encoder.encode("12345"));
		d.setRol("entrenador");
		ArrayList<Pokemon> pmone = new ArrayList<Pokemon>();
		pmon.add(monServ.buscarPokemonPorId(25));
		Pokedex pdexe = new Pokedex(2, pmone);
		dexServ.modificarUnPokedex(pdexe);
		d.setPokedex(pdexe);
		uServ.agregarUnUsuario(d);
	}

}
