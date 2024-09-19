package sueldosDinamicos;

public class Empleado {
	
	private String nombre;
	private double sueldoFijo;
	private double ventas;
	private int horasExtras;
	private double porcentaje;
	private double valorHora;
	private CalculadorDeSueldo calculador;
	
	public Empleado(String nombre, double sueldoFijo, double ventas, int horasExtras, double porcentaje,
			double valorHora, CalculadorDeSueldo calculador) {
		this.calculador = calculador;
		this.nombre = nombre;
		this.sueldoFijo = sueldoFijo;
		this.ventas = ventas;
		this.horasExtras = horasExtras;
		this.porcentaje = porcentaje;
		this.valorHora = valorHora;
	}
	
	public double getSueldo() {
		return this.calculador.calcularSueldo(this);
	}
	
	public void setCalculador(CalculadorDeSueldo nuevo) {
		this.calculador = nuevo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoFijo() {
		return sueldoFijo;
	}
	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}
	public double getVentas() {
		return ventas;
	}
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	public int getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public boolean equals(Object otro) {
		try {
			Empleado otroE = (Empleado)otro;
			return this.getNombre().equals(otroE.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	}
	

}
