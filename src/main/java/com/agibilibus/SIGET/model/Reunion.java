package com.agibilibus.SIGET.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "reuniones")
public class Reunion {
	@Id
	private int idReunion;
	private String titulo;
	private String descripcion;
	private LocalDate dia;
	private LocalDate horaInicio;
	private LocalDate horaFin;
	private Usuario organizador;
	private List<Usuario> asistentes;
	private String url;

	public Reunion(int idReunion, String titulo, String descripcion, LocalDate dia, LocalDate horaInicio,
	        LocalDate horaFin, Usuario organizador, List<Usuario> asistentes, String url) {
		super();
		this.idReunion = idReunion;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.organizador = organizador;
		this.asistentes = asistentes;
		this.url = url;
	}

	public int getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFecha() {
		return dia;
	}

	public void setFecha(LocalDate fecha) {
		this.dia = fecha;
	}

	public LocalDate getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalDate horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalDate getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalDate horaFin) {
		this.horaFin = horaFin;
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}

	public List<Usuario> getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(List<Usuario> asistentes) {
		this.asistentes = asistentes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
