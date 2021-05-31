package aloha.home.project.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long>{

	List<Solicitud> findByTiposol(String tipo_solicitud);
	
}
