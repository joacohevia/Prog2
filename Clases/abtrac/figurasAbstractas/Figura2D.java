package figurasAbstractas;

public abstract class Figura2D extends Figura {
	
	public Figura2D(String nombre) {
		super(nombre);
	}
	
	public abstract double getArea();
	
	public abstract double getPerimetro();
	
	public String toString() {
		return super.toString() + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro();
	}
	

}
