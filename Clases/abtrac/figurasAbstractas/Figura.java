package figurasAbstractas;

public  class Figura {
	
	String nombre;
	
	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "Nombre: " + this.getNombre();
	}

}
