package com.Tienda.Controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.comparator.Comparators;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Tienda.modelo.Pokedex;
import com.Tienda.modelo.Pokemon;
import com.Tienda.modelo.Usuario;
import com.Tienda.service.PokedexImpl;
import com.Tienda.service.PokemonImpl;
import com.Tienda.service.UsuarioImpl;

@Controller
public class WebController {

	@Autowired PokedexImpl pokedexServ;	
	@Autowired PokemonImpl pokemonServ;
	@Autowired UsuarioImpl usuarioServ;
	
	@GetMapping("/login")
	public String getLogin()
	{
		return "login";
	}
	
	@GetMapping("/")
	public String inicio(Authentication auth, Principal principal, Model model) {
		Usuario usu1 = usuarioServ.buscarUsuarioPorNombre(principal.getName());
		if (auth.getAuthorities().contains(new SimpleGrantedAuthority("entrenador"))) {
			model.addAttribute("usuario", usuarioServ.filtrarPokemonesPorIdEnUsuario(usu1));
			model.addAttribute("numeroPokemones", usu1.getPokedex().getPokemon().size());
			return "index";
		}else {
			return "login"; 
		}	
		
	}
	
	@GetMapping("captura")
	public String captura(Principal principal, Model model) {
		model.addAttribute("pokemonesFaltantes", pokemonServ.filtrarPokemonFaltante(principal.getName()));
		return "captura";
	}
	
	@PostMapping("agregarPoke")
	public String agregarPoke(Model model, int pokeAgregar, Principal principal) {
		Usuario usu1 = usuarioServ.buscarUsuarioPorNombre(principal.getName());
		pokemonServ.agregarPokeUsuario(principal.getName(), pokeAgregar);
		model.addAttribute("usuario", usuarioServ.filtrarPokemonesPorIdEnUsuario(usu1));
		model.addAttribute("numeroPokemones", usu1.getPokedex().getPokemon().size());
		return "index";
	}
	
}
