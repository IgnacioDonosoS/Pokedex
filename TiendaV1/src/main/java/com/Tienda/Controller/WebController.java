package com.Tienda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Tienda.service.PokedexImpl;
import com.Tienda.service.PokemonImpl;
import com.Tienda.service.UsuarioImpl;

@Controller
public class WebController {

	@Autowired PokedexImpl pokedexServ;	
	@Autowired PokemonImpl pokemonServ;
	@Autowired UsuarioImpl usuarioServ;
	
	@GetMapping("/login")
	public String getLogin(String username, Model model)
	{
		model.addAttribute("usuario", usuarioServ.buscarUsuarioPorNombre(username));
		return "login";
	}
	@PostMapping("/login")
	public String login(String username, Model model) {
		model.addAttribute("usuario", usuarioServ.buscarUsuarioPorNombre(username));
		return "index";
	}

	
	@GetMapping("/")
	public String inicio(Authentication auth) {
		
		if (auth.getAuthorities().contains(new SimpleGrantedAuthority("entrenador"))) {
			return "index";
		}else {
			return "login";
		}	
		
	}
	
}
