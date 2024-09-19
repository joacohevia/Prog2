package empleadosV2;

public abstract class Empleado {
/*NO ES EL 5 - 7 
 * En esta version hay empleados con sueldo fijo, otros empleados 
 * que cobran por comision y otros por hora trabajada
 */
	private String nombre;
	private int dni;
	
	
	public Empleado(String nombre, int dni ) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		
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

	public abstract double getSueldo();


	
	public boolean equals(Object o1) {
		if (o1 instanceof Empleado) {
			Empleado ee = (Empleado)o1;
			return ee.getDni() == dni;
		} else {
			return false;
		}
	}
	
}
