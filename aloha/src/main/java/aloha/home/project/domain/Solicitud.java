package aloha.home.project.domain;

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
@Table(name = "solicitud")
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column (name="id")
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="usuario_id")
	Usuario usuarioid;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="tiposol")
	private String tiposol;
	
	@Column(name="superficie")
	private int superficie;
	
	@Column(name="provincia")
	private String provincia;
	
	@Column(name="distrito")
	private String distrito;
	
	@Column(name="habitaciones")
	private int habitaciones;
	
	@Column(name="banos")
	private String banos;
	
	@Column(name="presupuesto")
	private int presupuesto;
	
	@Column(name="cochera")
	private boolean cochera;
	
	@Column(name="estado")
	private boolean estado;
	
	public Solicitud() {
		super();
	}

	public Solicitud(long id, Usuario usuarioid, String titulo, String tiposol, int superficie, String provincia,
			String distrito, int habitaciones, String banos, int presupuesto, boolean cochera, boolean estado) {
		super();
		this.id = id;
		this.usuarioid = usuarioid;
		this.titulo = titulo;
		this.tiposol = tiposol;
		this.superficie = superficie;
		this.provincia = provincia;
		this.distrito = distrito;
		this.habitaciones = habitaciones;
		this.banos = banos;
		this.presupuesto = presupuesto;
		this.cochera = cochera;
		this.estado = estado;
	}

	public Solicitud(Usuario usuarioid, String titulo, String tiposol, int superficie, String provincia,
			String distrito, int habitaciones, String banos, int presupuesto, boolean cochera, boolean estado) {
		super();
		this.usuarioid = usuarioid;
		this.titulo = titulo;
		this.tiposol = tiposol;
		this.superficie = superficie;
		this.provincia = provincia;
		this.distrito = distrito;
		this.habitaciones = habitaciones;
		this.banos = banos;
		this.presupuesto = presupuesto;
		this.cochera = cochera;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario getUsuarioid() {
		return usuarioid;
	}

	public void setUsuarioid(Usuario usuarioid) {
		this.usuarioid = usuarioid;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTiposol() {
		return tiposol;
	}

	public void setTiposol(String tiposol) {
		this.tiposol = tiposol;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public String getBanos() {
		return banos;
	}

	public void setBanos(String banos) {
		this.banos = banos;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public boolean isCochera() {
		return cochera;
	}

	public void setCochera(boolean cochera) {
		this.cochera = cochera;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", usuarioid=" + usuarioid + ", titulo=" + titulo + ", tiposol=" + tiposol
				+ ", superficie=" + superficie + ", provincia=" + provincia + ", distrito=" + distrito
				+ ", habitaciones=" + habitaciones + ", banos=" + banos + ", presupuesto=" + presupuesto + ", cochera="
				+ cochera + ", estado=" + estado + "]";
	}

	
	
}
