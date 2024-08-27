package deportivo;

import java.time.LocalDateTime;

public class Turno {
	private String tipoCancha;
	private String idCancha;
	private Usuario usuarios;
	private String nombre;
	private LocalDateTime fechaHora;
	
	public Turno(String tipoCancha,String idCancha, Usuario usuario, LocalDateTime fechaHor) {
		this.tipoCancha = tipoCancha;
		this.idCancha = idCancha;
		this.usuarios = usuario;
		this.fechaHora = fechaHor;
	}
	
	
	public double calcularPrecio() {
		double precio = tipoCancha.equals("Futbol")? 400 : 100;
					//compara si es futbol da true->400: si es false->100
		if(usuarios.verficarSocio()) {
			precio *= 0.9;
		}
		return precio;
	}
	
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	
	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipoCancha() {
		return tipoCancha;
	}
	public void setTipoCancha(String tipoCancha) {
		this.tipoCancha = tipoCancha;
	}
	public String getIdCancha() {
		return idCancha;
	}
	public void setIdCancha(String idCancha) {
		this.idCancha = idCancha;
	}
	public Usuario getUsuario() {
		return usuarios;
	}
	public void setUsuario(Usuario usuario) {
		this.usuarios = usuario;
	}
	
	
}
