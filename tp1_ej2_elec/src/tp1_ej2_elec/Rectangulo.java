package tp1_ej2_elec;

public class Rectangulo {
	private PuntoGeometrico V1;
	private PuntoGeometrico V2;
	private PuntoGeometrico V3;
	private PuntoGeometrico V4;
	private double areaMayor;
	
	public Rectangulo(PuntoGeometrico vv1,PuntoGeometrico vv2,PuntoGeometrico vv3,PuntoGeometrico vv4) {
		this.setV1(vv1);
		this.setV2(vv2);
		this.setV3(vv3);
		this.setV4(vv4);
	}
	public double area(double base, double altura) {
		return base * altura;
		
	}
	public boolean esRectangulo() {
		double lado = V1.distanciaEuclidea(V2);
		double lado1 = V2.distanciaEuclidea(V3);
		return lado == lado1;
	}
	//Determinar si está acostado o parado (si el alto es más que el ancho). 
	public boolean acostado() {
		double lado = V1.distanciaEuclidea(V2);
		double lado1 = V2.distanciaEuclidea(V3);
		return lado > lado1;
	}
	
    // Método para comparar áreas
    public int compararArea(double otraArea) {
        double miArea = this.area(V1.distanciaEuclidea(V2),V1.distanciaEuclidea(V3));
        if (miArea > otraArea) {
            return 1;
        } else if (miArea < otraArea) {
            return -1;
        } else {
            return 0;
        }
    }
	public void desplazarRec(int desplaX,int desplaY) {
		V1.Desplazar(desplaX, desplaY);
		V2.Desplazar(desplaX, desplaY);
		V3.Desplazar(desplaX, desplaY);
		V4.Desplazar(desplaX, desplaY);
		
	}
    @Override
	public String toString() {
		return "rec1("+V1+","+V2+","+V3+","+V4+")";
	}
	public PuntoGeometrico getV1() {
		return V1;
	}

	public void setV1(PuntoGeometrico v1) {
		V1 = v1;
	}

	public PuntoGeometrico getV2() {
		return V2;
	}

	public void setV2(PuntoGeometrico v2) {
		V2 = v2;
	}

	public PuntoGeometrico getV3() {
		return V3;
	}

	public void setV3(PuntoGeometrico v3) {
		V3 = v3;
	}

	public PuntoGeometrico getV4() {
		return V4;
	}

	public void setV4(PuntoGeometrico v4) {
		V4 = v4;
	}
	
}
