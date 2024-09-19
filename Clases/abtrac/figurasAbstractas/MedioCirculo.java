package figurasAbstractas;

public class MedioCirculo extends Circulo {
	
	public MedioCirculo(int radio, String nombre) {
		super(radio, nombre);
	}
	
	public double getArea() {
		return super.getArea() / 2;
	}
	
	public double getPerimetro() {
		return super.getPerimetro() / 2 + this.getDiametro();
	}
	
	public String getNombre() {
		return super.getNombre() + "MEDIOCIRCULO";
	}
}
