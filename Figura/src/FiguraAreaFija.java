
public class FiguraAreaFija extends Figura {
  double area;

public FiguraAreaFija(String nombre, double area) {
	super(nombre);
	this.area = area;
}

public double getArea() {
	return area;
}
  
}
