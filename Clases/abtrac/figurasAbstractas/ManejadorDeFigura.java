package figurasAbstractas;

public class ManejadorDeFigura {
	public void mostrarInformacion(Figura f) {
		//System.out.println(f.getDatosCompletos());
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		// Instanciamos el manejador
		ManejadorDeFigura manejador = new ManejadorDeFigura();
		
		// Crear un rectangulo
		/*Rectangulo r1 = new Rectangulo(10, 5, "R1");
		
		manejador.mostrarInformacion(r1);
		
		Figura2D c1 = new Circulo(20, "C1");
		
		System.out.println(((Circulo)c1).getDiametro());
		
		manejador.mostrarInformacion(c1);
		
		c1 = new Rectangulo(15,20, "r2");
		
		manejador.mostrarInformacion(c1);
		
		//Circulo cf = new Figura("F");
		
		Figura2D sm = new MedioCirculo(3, "mc1");
		manejador.mostrarInformacion(sm);
		
		Circulo mc1 = (MedioCirculo)sm; // Si sm no referencia a un MedioCirculo o una subclase de esta hay un error en tiempo de ejecucion
		
		Figura3D cilindro1 = new Figura3D("cili1", c1, 15);
		manejador.mostrarInformacion(cilindro1);*/
		
		Figura2DFija ffija = new Figura2DFija("Fija1", 10, 25);
		manejador.mostrarInformacion(ffija);

		Figura2D sm = new MedioCirculo(3, "mc1");
		manejador.mostrarInformacion(sm);
	}
}
