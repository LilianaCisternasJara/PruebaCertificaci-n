package cl.aiep.prueba.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@Column(name = "rut")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String rut;
	
	@Column(name= "nombres", nullable = false)
	private String nombres;
	
	@Column(name= "apellidos", nullable = false)
	private String apellidos;
	
	@Column(name= "email", unique = true, nullable = false)
    private String email;
	
	@Column(name= "password", nullable = false)
	private String password;
	
	@Column(name= "telefono", nullable = false)
    private Integer telefono;
	
	@Column(name= "direccion", nullable = false)
    private String direccion;
	
	@Column(name= "region", nullable = false)
	private String region;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="curso", nullable = false)
	private Curso curso;

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
