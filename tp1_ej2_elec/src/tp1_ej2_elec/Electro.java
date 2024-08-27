package tp1_ej2_elec;

public class Electro {
	private String nombre;
	private double precioBase;
	private String color;
	private int consumoEnergetico;
	private double peso;
	private int consumoRecomendado = 45;
	private int numGamaAlta = 3;
	
	public String toString() {
		 return "elec2("+color+","+consumoEnergetico+","+precioBase+","+peso+","+nombre+")";
		//"elec1("+color+","+consumoEnergetico+","+precioBase+","+peso+")";//funcion para mostrar todo en una linea
	 }
	
	public Electro() {
		this("gris plata",10,100,2);
	}
	
	public Electro(String colo,int consumo,double precio,double pes) {
		this.setPrecioBase(precio);
		this.setColor(colo);
		this.setConsumoEnergetico(consumo);
		this.setPeso(pes);
	}
	public Electro(String colo,int consumo,double precio,double pes,String nombr) {
		this.setNombre(nombr);
		this.setPrecioBase(precio);
		this.setColor(colo);
		this.setConsumoEnergetico(consumo);
		this.setPeso(pes);
	}
	public boolean gamaAlta() {
		return this.balance() > numGamaAlta;
	}
	public double balance() {
		return precioBase / peso;
	}
	
	public boolean esBajoConsumo() {
	    return consumoEnergetico < consumoRecomendado;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(int consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}

