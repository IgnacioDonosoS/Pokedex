package com.Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Tienda.Repository.UsuarioRepo;
import com.Tienda.modelo.Usuario;

@Service
public class UsuarioImlp implements IUsuario {

	@Autowired
	UsuarioRepo uRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public Usuario registerNewUserAccount(Usuario u) {
		Usuario user = new Usuario();
		user.setNombre(u.getNombre());
		user.setPassword(passwordEncoder.encode(u.getPassword()));
		user.setRol("entrenador");
		return uRepo.save(user);
	}

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
			uRepo.save(usuario);
			return usuario;
		} else {
			return null;
		}
	}

	@Override
	public Usuario agregarUnUsuario(Usuario usuario) {
		if (uRepo.getOne(usuario.getIdUsuario()) == null) {
			uRepo.save(usuario);
			return usuario;
		} else {
			return null;
		}
	}
}