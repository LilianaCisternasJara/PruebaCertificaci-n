package cl.aiep.prueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.prueba.dao.CursoDao;
import cl.aiep.prueba.entities.Curso;
import cl.aiep.prueba.repositories.CursoRepository;

@Service
public class CursoService implements CursoDao{
	
	@Autowired
	private CursoRepository repo;

	@Override
	public List<Curso> listar() {
		return repo.findAll();
	}

	@Override
	public Curso buscar(String id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Curso agregar(Curso curso) {
		return repo.save(curso);
	}

	@Override
	public void eliminar(String id) {
		repo.deleteById(id);
		
	}

	
}
