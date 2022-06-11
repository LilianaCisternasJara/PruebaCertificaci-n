package cl.aiep.prueba.dao;

import cl.aiep.prueba.entities.Admin;

public interface AdminDao {
	
	Admin agregar (Admin admin);
	void eliminar (String id);
	Admin buscar (String id);

}
