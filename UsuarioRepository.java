package cl.aiep.prueba.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.prueba.entities.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, String>{
	
	public Optional<Usuario> findByRut (String rut);
	
	Optional<Usuario> findByEmailIsAndPasswordIs(String email, String password);

}
