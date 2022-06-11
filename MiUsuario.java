package cl.aiep.prueba.userdetails;

import java.util.Collection;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MiUsuario implements UserDetails{
	
	private User user;
	private String nombre;
	private String apellido;
	

	public MiUsuario(User user, String nombre, String apellido) {
		this.user = user;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return ((UserDetails) user).getAuthorities();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return ((UserDetails) user).getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return ((UserDetails) user).isAccountNonExpired();
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return ((UserDetails) user).isAccountNonLocked();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return ((UserDetails) user).isCredentialsNonExpired();
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return ((UserDetails) user).isEnabled();
	}

}
