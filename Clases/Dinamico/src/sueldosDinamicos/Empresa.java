package sueldosDinamicos;

import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Empleado> empleados;
	
	public Empresa() {
		this.empleados = new ArrayList<>();
	}
	
	public void addEmpleado(Empleado nuevo) {
		if (!empleados.contains(nuevo))
			this.empleados.add(nuevo);
	}
	
	public double calcularSueldos() {
		double total = 0;
		for (int i = 0; i < this.empleados.size(); i++)
			total += this.empleados.get(i).getSueldo();
		return total;
	}

}
