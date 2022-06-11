package cl.aiep.prueba.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.prueba.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, String>{
	
	public Optional<Admin> findByUsuario(String usuario);

}
