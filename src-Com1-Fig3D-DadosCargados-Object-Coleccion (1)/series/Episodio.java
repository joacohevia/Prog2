package series;

public class Episodio {
	final static int MAX_CALIFICACION = 5;
	String titulo;
	String descripcion;
	boolean visto;
	int calificacion;
	
	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.calificacion = -1;
		this.visto = false;
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

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public boolean setCalificacion(int calificacion) {
		if (0 < calificacion && calificacion <= MAX_CALIFICACION) {
			this.calificacion = calificacion;
			return true;
		}
		else
			return false;
				
	}
	
	
	
}
