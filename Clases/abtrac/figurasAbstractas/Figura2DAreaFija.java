package figurasAbstractas;

// Es abstracta pq no redefine getPerimetro
public abstract class Figura2DAreaFija extends Figura2D {
	// Solo tiene un area fija, pero no conoce su perimetro
	private double areaFija;
	
	public Figura2DAreaFija(String nombre, double areaFija) {
		super(nombre);
		this.areaFija = areaFija;
	}

	@Override
	public double getArea() {
		return this.areaFija;
	}

}
