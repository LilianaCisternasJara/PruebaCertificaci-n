package cl.aiep.prueba.dto;

import java.sql.Date;

public class CursoDto {
	
	private String id;
	private String nombre;
	private String descripcion;
	private String contenidos;
	private Date fInicio;
	private Date fTermino;
	private Integer cantCupos;
	private byte[] imagenRef;
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
	

}
