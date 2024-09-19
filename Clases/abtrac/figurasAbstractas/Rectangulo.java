package figurasAbstractas;

public class Rectangulo extends Figura2D {
	
	// Ya heredo nombre
	int base, altura;
	
	public Rectangulo(int base, int altura, String nombre) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//@Override
	public double getArea() {
		return this.base * this.altura;
	}
	
	public double getPerimetro() {
		return (this.base + this.altura) * 2;
	}
	
	public String toString() {
		return super.toString() + " Base: " + this.base + " Altura: " + this.altura;
	}
	

}
