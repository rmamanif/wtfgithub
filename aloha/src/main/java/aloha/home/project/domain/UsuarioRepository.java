package aloha.home.project.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository
	extends JpaRepository<Usuario, Long>{
	
	Usuario findByCorreoAndPassword(String correo, String password);
	
}
