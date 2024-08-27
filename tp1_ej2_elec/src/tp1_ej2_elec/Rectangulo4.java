package tp1_ej2_elec;

public class Rectangulo4 {
	private PuntoGeometrico vertice;
	private double alto;
	private double largo;
	
	public Rectangulo4(PuntoGeometrico V1,PuntoGeometrico V2, PuntoGeometrico V3) {
		this.vertice = V1;
		this.alto = V1.distanciaEuclidea(V2);
		this.largo = V2.distanciaEuclidea(V3);
	}
	  public Rectangulo4(PuntoGeometrico vertice, double alto, double largo) {
	        this.vertice = vertice;
	        this.alto = alto;
	        this.alto = largo;
	    }
}
