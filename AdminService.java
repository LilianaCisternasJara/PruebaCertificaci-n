package cl.aiep.prueba.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.prueba.dao.AdminDao;
import cl.aiep.prueba.entities.Admin;
import cl.aiep.prueba.repositories.AdminRepository;

@Service
public class AdminService implements AdminDao{
	
	@Autowired
	private AdminRepository repo;

	@Override
	public Admin agregar(Admin admin) {
		return repo.save(admin);
	}

	@Override
	public void eliminar(String id) {
		repo.deleteById(id);
		
	}

	@Override
	public Admin buscar(String id) {
		return repo.findById(id).orElse(null);
	}

}
