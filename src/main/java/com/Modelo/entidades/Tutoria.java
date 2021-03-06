package com.Modelo.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tutoria
 *
 */
@Entity
@Table(name = "Tutoria")
public class Tutoria implements Serializable {

	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTutoria")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "docente")
	private Docente docente;
	@ManyToOne
	@JoinColumn(name = "estudiante")
	private Estudiante estudiante;
	@ManyToOne
	@JoinColumn(name = "horario")
	private Horario horario;
	@Column(name = "estado")
	private String estado;
	@ManyToOne
	@JoinColumn(name="fecha")
	private Fecha fecha = new Fecha();

	public Tutoria() {
		super();
	} 
	
	public Tutoria(Docente docente, Estudiante estudiante, Horario horario, Fecha fecha) {
		super();
		this.docente = docente;
		this.estudiante = estudiante;
		this.horario = horario;
		this.estado = "Pendiente";
		this.fecha = fecha;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Tutoria estado=" + estado ;
	}
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Tutoria)) {
			return false;
		}
		Tutoria other = (Tutoria) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
}
