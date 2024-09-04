package metYAttsDeClase;

import java.awt.BorderLayout;

public class Persona {

	private String nombre;
	private int edad;
	private int dni;
	private static int minimoVoto=16;
	private static int contador =0;
	
	public static final int ERROR = -1;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		contador ++;
		dni = contador;
		//ATRIBUTO DE CLASE NO LO INICIALIZO EN EL CONSTRUCTOR
		//minimoVoto = 16;
	}
	
	public int getDni() {
		return dni;
	}
	public static void setMinimoVoto(int x) {
		minimoVoto = x;
		int z = 3;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public boolean puedeVotar() {
		if (this.getEdad()>minimoVoto)
			return true;
		else
			return false;
	}
	
	public static int getCantidadPersonasCreadas() {
		return contador;
	}
	
	
	public static void main(String[] args) {
		Persona.setMinimoVoto(17);
		Math.random();
		
		Persona p1 = null;
		Persona p2 = new Persona("Juan",16);
		
		for(int i = 0; i<154; i++) {
			p1 = new Persona("nnn",15);
		}
		
		System.out.println(p1.getCantidadPersonasCreadas());
	}
}
