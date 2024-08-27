package series;

public class Episodio {
 private String titulo;
 private String descripcion;
 private boolean visto;
 private int calificacion;
 
 	public Episodio(String titu, String descrip, boolean vist, int cali) {
 		this.setTitulo(titu);
 		this.setDescripcion(descrip);
 		this.setVisto(vist);
 		this.setCalificacion(cali);
 		
 	}
 
 	/*● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.*/
 	public void setCalificacion(int calificacionDada) {
		if(this.getVisto() && calificacionDada >= 1 && calificacionDada <= 5) {
 			this.calificacion = calificacionDada;
 		}else if(calificacionDada < 0) {
 			System.out.println("Calificacion no valida");
 		}
		else {
 			this.calificacion = -calificacionDada;
 		}
		
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

	public boolean getVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public int getCalificacion() {
		return calificacion;
	}

	
 	
}
