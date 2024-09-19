package sueldosDinamicos;

public class CalculadorPorHorasExtras extends CalculadorDeSueldo {

	@Override
	public double calcularSueldo(Empleado empleado) {
		return super.calcularSueldo(empleado) + 
				empleado.getHorasExtras() * empleado.getValorHora();
	}
	
}
