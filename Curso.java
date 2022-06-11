package cl.aiep.prueba.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "nombre", length = 80, nullable=false)
	private String nombre;
	
	@Column(name = "descripcion", length = 100, nullable=false)
	private String descripcion;
	
	@Column(name = "contenidos", length = 100, nullable=false)
	private String contenidos;
	
	@Column(name = "f_inicio", nullable=false)
	private Date fInicio;
	
	@Column(name = "f_termino", nullable=false)
	private Date fTermino;
	
	@Column(name = "cant_cupos", nullable=false)
	private Integer cantCupos;
	
	@Column(name = "imagen_ref", nullable=false)
	private byte[] imagenRef;

	@OneToMany(mappedBy= "curso")
	private List<Usuario> usuarios;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getContenidos() {
		return contenidos;
	}

	public void setContenidos(String contenidos) {
		this.contenidos = contenidos;
	}

	public Date getfInicio() {
		return fInicio;
	}

	public void setfInicio(Date fInicio) {
		this.fInicio = fInicio;
	}

	public Date getfTermino() {
		return fTermino;
	}

	public void setfTermino(Date fTermino) {
		this.fTermino = fTermino;
	}

	public Integer getCantCupos() {
		return cantCupos;
	}

	public void setCantCupos(Integer cantCupos) {
		this.cantCupos = cantCupos;
	}

	public byte[] getImagenRef() {
		return imagenRef;
	}

	public void setImagenRef(byte[] imagenRef) {
		this.imagenRef = imagenRef;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
