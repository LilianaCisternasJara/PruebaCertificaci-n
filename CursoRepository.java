package cl.aiep.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.prueba.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, String>{

}
