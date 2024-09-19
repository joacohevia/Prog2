package empleadosV2;

public class EmpleadoComision extends Empleado{

	private double ventas;
	private double porcentaje;
	
	public EmpleadoComision(String nombre, int dni,  double ventas, double porcentaje) {
		super(nombre, dni);
		this.ventas = ventas;
		this.porcentaje = porcentaje;
	}
	public double getVentas() {
		return ventas;
	}
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	///////
	public double getSueldo() {
		return  ventas*porcentaje;
	}
}
