package avion;

public class Avion1 {			
	private String color;
	private String marca;
	private int capacidad;	
	private int cantidadAsientos;
	private int balance;

	/*public Avion1() {//constructor
		color = "Negro";
		marca = "Boing777";
		capacidad = 100;
		cantidadAsientos = 100;
	}*/
	
	public Avion1() {//constructor
		this("Negro_defec","Boing777",100,90);
	}
	
	
	public Avion1(String color) {
		this();//llama al construc por defecto
		this.setColor(color);
	}
	public Avion1(String color,String marca,int capacidad,int cantidadAsientos) {
		this.setCantidadAsientos(cantidadAsientos);
		this.setCapacidad(capacidad);
		this.setColor(color);
		this.setMarca(marca);
	}
	
	public int getCantidadAsientos() {
		return cantidadAsientos;
	}
	
	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setColor(String colorDado) {
		if(!colorDado.equals("rojo")) {
			this.color = colorDado;
		}else {
			this.color = "rojo_cambio";
		}
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
		if (this.cantidadAsientos > 0) {
			this.balance = capacidad / cantidadAsientos;
		} else {
			this.balance = 0;
		}
	}
}


