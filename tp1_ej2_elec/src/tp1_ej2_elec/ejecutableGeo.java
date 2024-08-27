package tp1_ej2_elec;

public class ejecutableGeo {

	public static void main(String[] args) {
		
		//primero creo un objeto por cada punto
	   PuntoGeometrico ver1 = new PuntoGeometrico(1, 0);
	   PuntoGeometrico ver2 = new PuntoGeometrico(8, 0);
	   PuntoGeometrico ver3 = new PuntoGeometrico(1, 2);
	   PuntoGeometrico ver4 = new PuntoGeometrico(8, 2);
	   
	   PuntoGeometrico ver10 = new PuntoGeometrico(2, 0);
	   PuntoGeometrico ver20 = new PuntoGeometrico(9, 0);
	   PuntoGeometrico ver30 = new PuntoGeometrico(2, 3);
	   PuntoGeometrico ver40 = new PuntoGeometrico(9, 3);
	   
	   Rectangulo rec1 = new Rectangulo(ver1,ver2,ver3,ver4);
	   System.out.println(rec1);
	   //rec1.desplazarRec(1, 1);
	   //System.out.println(rec1);
	   Rectangulo rec2 = new Rectangulo(ver10,ver20,ver30,ver40);
	   System.out.println(rec2);
	   
	   double distBas = ver1.distanciaEuclidea(ver2);//desde 1x hasta la otra punta de la base,
	   //LLAMA A VER1(PUNTOGEOMETRICO) PARA CALCULAR LA DISTANCIA
	   double distAlt = ver1.distanciaEuclidea(ver3);//desde 1x hasta la otra punta del techo del rec
	   System.out.println(distBas+","+distAlt);
	   double area = rec1.area(distBas,distAlt);//rec1 porq la funcion area esta en la clase rectangulo
	   System.out.println(area);
	   
	   double distBas1 = ver10.distanciaEuclidea(ver20);
	   double distAlt1 = ver10.distanciaEuclidea(ver30);
	   System.out.println(distBas1+","+distAlt1);
	   double area1 = rec2.area(distBas1, distAlt1);
	   System.out.println(area1);
	   
	   if(rec2.esRectangulo()) {
		   System.out.println("es cuadrado");
	   }else {
		   System.out.println("no es cuadrado");
	   }
	   int sies = rec1.compararArea(area1);
	   System.out.println(sies);
	   
	   Rectangulo4 rec4 = new Rectangulo4(ver1, 7, 3);
       System.out.println(rec4);
		
		/*PuntoGeometrico geo1 = new PuntoGeometrico();
		PuntoGeometrico geo2 = new PuntoGeometrico(3,4);
		PuntoGeometrico geo3 = new PuntoGeometrico(7,1);
		System.out.println(geo2);
		double dist = geo2.distanciaEuclidea(geo3);//Llama al metodo distanciaEuclidea de geo2
		                                           //(3,4), pasando geo3(7,1) como parámetro
		System.out.println(dist);*/
		
		
		/*Electro elec1 = new Electro();
		Electro elec2 = new Electro("gris plata",10,100,2,"nommm");

		System.out.println(elec2);*/
	}

}
