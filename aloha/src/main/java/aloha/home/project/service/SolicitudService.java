package aloha.home.project.service;

import aloha.home.project.domain.Solicitud;
import aloha.home.project.exception.SolicitudNotFoundException;

public interface SolicitudService {
	
	//Create
	Solicitud create(Solicitud usuario);
	
	//Update
	Solicitud update(Solicitud usuario);
		
	//Delete
	void delete(long id) throws SolicitudNotFoundException;
	
	//FindPorId
	Solicitud findById(long id) throws SolicitudNotFoundException;
	
	//Todos los usuarios
	Iterable<Solicitud> findAll();
	
}
