package aloha.home.project.service;

import aloha.home.project.domain.Usuario;
import aloha.home.project.exception.UsuarioNotFoundException;

public interface UsuarioService {
	
	//Create
	Usuario create(Usuario usuario);
	
	//Update
	Usuario update(Usuario usuario);
		
	//Delete
	void delete(long id) throws UsuarioNotFoundException;
	
	//FindPorId
	Usuario findById(long id) throws UsuarioNotFoundException;
	
	//Todos los usuarios
	Iterable<Usuario> findAll();
	
	//Login
	Usuario findByCorreoAndPassword(String correo, String password) throws UsuarioNotFoundException;
	
}
