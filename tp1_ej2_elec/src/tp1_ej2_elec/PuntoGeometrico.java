package tp1_ej2_elec;


public class PuntoGeometrico {
	private int X;
	private int Y;
	private double distanciaEuclidea;
	
	public PuntoGeometrico() {
		this.setX(X);
		this.setY(Y);
	}
	public PuntoGeometrico(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public double distanciaEuclidea(PuntoGeometrico dist) {
		double X1 = this.X - dist.getX();
		double Y1 = this.Y - dist.getY();
		return Math.sqrt(Math.pow(X1, 2) + Math.pow(Y1, 2));
		//Distancia= (X1−X2)^2 + (Y1-Y2)^2  Math.pow(base, exponente) eleva base al expo
		
	}
	public void Desplazar(int numX, int numY){
		this.X += numX;
		this.Y += numY;
	}
    @Override

	public String toString() {
		 return "("+X+","+Y+")";
		//"elec1("+color+","+consumoEnergetico+","+precioBase+","+peso+")";//funcion para mostrar todo en una linea
	 }
	
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
}
