package cl.aiep.prueba.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import cl.aiep.prueba.services.UsuarioService;


@SuppressWarnings("deprecation")
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private BCryptPasswordEncoder bCPE;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		BCryptPasswordEncoder bCPE = new BCryptPasswordEncoder();
		return bCPE;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/js/**").permitAll()
		.antMatchers("/css/**").permitAll()
		.antMatchers("/administradores").permitAll()
		.antMatchers("/cursos/**").permitAll()
		.antMatchers("/detalles/**").permitAll()
		.antMatchers("/formulario1/**").permitAll()
		.antMatchers("/formulario2/**").permitAll()
		.antMatchers("/formulario3/**").permitAll()
		.antMatchers("/paginainicio/**").permitAll()
		.antMatchers("/registro").permitAll()
		.antMatchers("/creacioncursos").hasAnyAuthority("ADMIN")
		.antMatchers("/panel").hasAnyAuthority("USUARIO")
		.anyRequest().authenticated()
		.and() 
		.formLogin().loginPage("/login").permitAll()
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login");
	}
	
	}
