package figurasAbstractas;

public class Circulo extends Figura2D {
	int radio;
	
	public Circulo(int radio, String nombre) {
		super(nombre);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	public int getDiametro() {
		return radio * 2;
	}
	
	@Override
	public double getArea() {
		return Math.PI * this.radio * this.radio;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	
	public String toString() {
		return super.toString() + " Radio: " + this.radio;
	}

}
