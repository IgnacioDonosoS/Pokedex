package com.Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Tienda.Repository.UsuarioRepo;
import com.Tienda.modelo.Usuario;

@Service
public class UsuarioImpl implements IUsuario {

	@Autowired
	UsuarioRepo uRepo;


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
			return uRepo.save(usuario);
		} else {
			return null;
		}
	}

	@Override
	public Usuario agregarUnUsuario(Usuario usuario) {
			return uRepo.save(usuario);

	}
}