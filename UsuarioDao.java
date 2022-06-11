package cl.aiep.prueba.dao;

import java.util.List;

import cl.aiep.prueba.entities.Usuario;

public interface UsuarioDao {

	Usuario agregar (Usuario usuario);
	void eliminar (String rut);
	Usuario actualizar (Usuario usuario);
	Usuario buscar(String rut);
	List<Usuario> listar();
}
