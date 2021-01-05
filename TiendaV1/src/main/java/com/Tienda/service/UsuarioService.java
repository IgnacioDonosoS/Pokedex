package com.Tienda.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Tienda.Repository.UsuarioRepo;
import com.Tienda.modelo.Usuario;

@Service
public class UsuarioService implements UserDetailsService{

	@Autowired
	UsuarioRepo uRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario1 = uRepo.findByNombre(username);
		ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
        roles.add(new SimpleGrantedAuthority("entrenador"));
		UserDetails userDetails = new User(usuario1.getNombre(), usuario1.getPassword(), roles);
		return userDetails;
	}
	
    public Usuario registerNewUserAccount (Usuario u) {
        Usuario user = new Usuario();
        user.setNombre(u.getNombre());
        user.setPassword(passwordEncoder.encode(u.getPassword()));
        user.setRol("entrenador");

        return uRepo.save(user);

    }
	
	

}
