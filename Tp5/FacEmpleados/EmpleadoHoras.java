package Tp5.FacEmpleados;

public class EmpleadoHoras extends Empleado {

	private double horas;
	private double precioHora;

	public EmpleadoHoras(String nombre, int dni, double sueldo, double horas, double precioHora) {
		super(nombre, dni, sueldo);
		this.horas = horas;
		this.precioHora = precioHora;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	public double getSueldo() {
		return super.getSueldo() + horas*precioHora;
	}
	
}
