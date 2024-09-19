package figurasAbstractas;

public class Figura2DFija extends Figura2DAreaFija {
	
	private double perimetroFijo;
	
	public Figura2DFija(String nombre, double areaFija, double perimetroFijo) {
		super(nombre, areaFija);
		this.perimetroFijo = perimetroFijo;
	}

	@Override
	public double getPerimetro() {
		return this.perimetroFijo;
	}

}
