package com.Tienda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Tienda.service.PokedexImpl;
import com.Tienda.service.PokemonImpl;
import com.Tienda.service.UsuarioImpl;

@Controller
public class WebController {

	@Autowired
	PokedexImpl pokedexServ;	
	@Autowired
	PokemonImpl pokemonServ;
	@Autowired
	UsuarioImpl usuarioServ;
	
	
	
	
}
