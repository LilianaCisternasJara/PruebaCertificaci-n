package cl.aiep.prueba.dao;

import java.util.List;

import cl.aiep.prueba.entities.Curso;

public interface CursoDao {
	
	List<Curso> listar();
	Curso buscar (String id);
	Curso agregar(Curso curso);
	void eliminar (String id);

}
