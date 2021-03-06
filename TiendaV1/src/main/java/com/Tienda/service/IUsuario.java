package com.Tienda.service;

import java.util.List;

import com.Tienda.modelo.Usuario;

public interface IUsuario {

	public List<Usuario> listarUsuarios();
	public Usuario buscarUsuarioPorId(int id);
	public void borrarUnUsuario(int id);
	public Usuario modificarUnUsuario(Usuario usuario);
	public Usuario agregarUnUsuario(Usuario usuario);
	public Usuario buscarUsuarioPorNombre(String nombre);
	public Usuario filtrarPokemonesPorIdEnUsuario(Usuario usuario);
	public List<Integer> calculoComplejo(List<Integer> stock);
}
