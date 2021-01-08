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
		uServ.agregarUnUsuario(a);
	}

}
