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

	@Test
void contextLoads() {
		
		Usuario a = new Usuario();
		a.setIdUsuario(1);
		a.setNombre("angela");
		a.setPassword(encoder.encode("12345"));
		a.setRol("entrenador");
		List<Pokemon> pmon = monServ.listarPokemones();
		Pokedex pdex = new Pokedex(1, pmon);
		dexServ.agregarUnPokedex(pdex);
		a.setPokedex(pdex);
		uServ.agregarUnUsuario(a);
		
	Usuario d = new Usuario();
	d.setIdUsuario(2);
	d.setNombre("nacho");
	d.setPassword(encoder.encode("12345"));
	d.setRol("entrenador");
	ArrayList<Pokemon> pmone = new ArrayList<Pokemon>();
	pmone.add(monServ.buscarPokemonPorId(25));
	pmone.add(monServ.buscarPokemonPorId(1));
	pmone.add(monServ.buscarPokemonPorId(2));
	pmone.add(monServ.buscarPokemonPorId(3));
	pmone.add(monServ.buscarPokemonPorId(4));
	pmone.add(monServ.buscarPokemonPorId(5));
	pmone.add(monServ.buscarPokemonPorId(6));
	pmone.add(monServ.buscarPokemonPorId(7));
	pmone.add(monServ.buscarPokemonPorId(8));
	pmone.add(monServ.buscarPokemonPorId(9));
	Pokedex pdexe = new Pokedex(2, pmone);
	dexServ.modificarUnPokedex(pdexe);
	d.setPokedex(pdexe);
	uServ.modificarUnUsuario(d);
	}

}
