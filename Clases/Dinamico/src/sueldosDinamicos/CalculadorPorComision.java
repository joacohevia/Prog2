package sueldosDinamicos;

public class CalculadorPorComision extends CalculadorDeSueldo {

	public double calcularSueldo(Empleado empleado) {
		return super.calcularSueldo(empleado) + 
				empleado.getVentas() * empleado.getPorcentaje();
	}
}
