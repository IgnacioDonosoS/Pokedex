package com.Tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tienda.modelo.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String nombre);
}
