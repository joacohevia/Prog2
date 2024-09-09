
public class AdminFiguras {

	
	public static void imprimir(Figura f1) {
		System.out.println("la " + f1.getNombre()+  
		                   " tiene un area de " + f1.getArea() +
		                   " y un perimetro de " + f1.getPerimetro());
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rectangulo r1 = new Rectangulo(10,20);
		double area = r1.getArea();
		System.out.println("El " + r1.getNombre() +
				+ area);
		
		Circulo c1 = new Circulo(10);
		double area2 = c1.getArea();
		System.out.println("El "+ c1.getNombre() +
				+ area2);
		
		
		
		Figura f1 = new Figura("Cualquiera");
	    // CONTROL DE ES UN
		//f1 = new Circulo(10); 
		Circulo cc1 = new Circulo(10);
		Rectangulo rr1 = new Rectangulo(10,10);
		
		//f1  = cc1;
		//f1 = rr1;
		
		//NO FUNCIONA
		//rr1 = f1;
		//cc1 = f1;
		imprimir(cc1);
		imprimir(rr1);
		
		imprimir(new FiguraAreaFija("fija",1000));
	
	     MedioCirculo md = new MedioCirculo(10);
	     
	     imprimir(md);
	     
	     MedioCirculoPunteado mdp = new MedioCirculoPunteado(10);
	     imprimir(mdp);
	
	     
	     System.out.println(f1.getDatosCompletos());
	     System.out.println(cc1.getDatosCompletos());
	     System.out.println(rr1.getDatosCompletos());
	     System.out.println(md.getDatosCompletos());
	     System.out.println(mdp.getDatosCompletos());
	}

}
