package Tp5.FacEmpleados;

public class EmpleadoComision extends Empleado{

	private double ventas;
	private double porcentaje;
	
	public EmpleadoComision(String nombre, int dni, double sueldo, double ventas, double porcentaje) {
		super(nombre, dni, sueldo);
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
		return super.getSueldo() + ventas*porcentaje;
	}
}
