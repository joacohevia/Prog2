package figurasHerencia;

public class Figura2D extends Figura{
	
	public Figura2D(String nombre) {
		super(nombre);
	}
	
	public double getArea() {
		return 0;
	}
	
	public double getPerimetro() {
		return 0;
	}
	
	public String toString() {
		return super.toString() + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro();
	}
	

}
