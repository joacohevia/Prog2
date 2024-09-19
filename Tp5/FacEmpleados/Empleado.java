package Tp5.FacEmpleados;

public class Empleado {

	private String nombre;
	private int dni;
	private double sueldo;
	
	public Empleado(String nombre, int dni, double sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public boolean equals(Object o1) {
		if (o1 instanceof Empleado) {
			Empleado ee = (Empleado)o1;
			return ee.getDni() == dni;
		} else {
			return false;
		}
	}

	
	
}
