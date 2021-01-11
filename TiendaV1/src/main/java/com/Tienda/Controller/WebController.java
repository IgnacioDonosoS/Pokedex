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
			model.addAttribute("usuario", usu1);
			model.addAttribute("numeroPokemones", usu1.getPokedex().getPokemon().size());
			return "index";
		}else {
			return "login"; 
		}	
		
	}
	
	@GetMapping("captura")
	public String captura(Principal principal, Model model) {
		///Filtra la lista usuario Contra la lista total de pokemones en la bd.
		List<Pokemon> listaPokesUsu = usuarioServ.buscarUsuarioPorNombre(principal.getName()).getPokedex().getPokemon();
		List<Pokemon> listaPokes = pokemonServ.listarPokemones(); 
		for (int i = 0; i < listaPokes.size(); i++) {
		for (int j = 0; j < listaPokesUsu.size(); j++) {
			if (listaPokes.get(i).getIdPokemon()==listaPokesUsu.get(j).getIdPokemon()) {
				listaPokes.remove(i);
			};
		}	
		}
		model.addAttribute("pokemonesFaltantes", listaPokes);
		return "captura";
	}
	
	@PostMapping("agregarPoke")
	public String agregarPoke(Model model, int pokeAgregar, Principal principal) {
		Usuario usu1 = usuarioServ.buscarUsuarioPorNombre(principal.getName());
		List<Pokemon> listaPokesUsu = usu1.getPokedex().getPokemon();
		listaPokesUsu.add(pokemonServ.buscarPokemonPorId(pokeAgregar));
		Pokedex pdex = new Pokedex();
		pdex.setIdPokedex(usu1.getPokedex().getIdPokedex());
		pdex.setPokemon(listaPokesUsu);
		pokedexServ.modificarUnPokedex(pdex);
		
		model.addAttribute("usuario", usu1);
		model.addAttribute("numeroPokemones", usu1.getPokedex().getPokemon().size());
		return "index";
	}
	
}
