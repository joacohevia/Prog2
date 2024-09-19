package empleadosV2;

public class EmpleadoSueldoFijo extends Empleado{
 
	private double sueldo;


	public EmpleadoSueldoFijo(String nombre, int dni, double sueldo) {
		super(nombre, dni);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
