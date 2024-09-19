package figurasAbstractas;

public class Figura3D extends Figura {
	Figura2D base;
	int altura;
	
	public Figura3D(String nombre, Figura2D base, int altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double getVolumen() {
		return this.base.getArea() * this.altura;
	}
	
	public String toString() {
		return super.toString() + " Volumen: " + this.getVolumen() + "Base: " + this.getBase().toString();
	}
}
