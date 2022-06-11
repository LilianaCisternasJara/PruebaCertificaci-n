package cl.aiep.prueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.prueba.dao.UsuarioDao;
import cl.aiep.prueba.entities.Usuario;
import cl.aiep.prueba.repositories.UsuarioRepository;

@Service
public class UsuarioService implements UsuarioDao{
	
	@Autowired
	private UsuarioRepository repo;

	@Override
	public Usuario agregar(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public void eliminar(String rut) {
		repo.deleteById(rut);
		
	}

	@Override
	public Usuario actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscar(String rut) {
		return repo.findById(rut).orElse(null);
	}

	@Override
	public List<Usuario> listar() {
		return repo.findAll();
	}

}
