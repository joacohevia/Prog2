package sistEncuesta;

import elementos.Persona;

public class Usuario extends Persona {
	private int dni;
	
	public Usuario(String nombre, String apellido,int dni) {
		super(nombre, apellido);
		this.setDni(dni);
	}
	 public void responderEncuestausua(Encuesta encu){
	        encu.responderEncuesta();
	    }

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	
}
