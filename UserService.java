package cl.aiep.prueba.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cl.aiep.prueba.entities.Usuario;
import cl.aiep.prueba.repositories.UsuarioRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UsuarioRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> optional = repo.findByEmailIsAndPasswordIs(username, username);
		if(optional.isPresent())
		{
			Usuario u = optional.get();
			ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
			roles.add(new SimpleGrantedAuthority("ADMIN"));
			roles.add(new SimpleGrantedAuthority(u.getDireccion()));
			User userDT = new User();
			Usuario usuario = new Usuario();
			return (UserDetails) usuario;
		}
		else
		{
			throw new UsernameNotFoundException(username);
		}
	}
	
	

}
