package modificadores;

import java.util.ArrayList;

import figuras.redondeadas.Circulo;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdministradorFiguras adf1 = new AdministradorFiguras();
		
		Circulo c1 = new Circulo (10);
	
		adf1.addFigura(c1);
		adf1.addFigura(c1);
		
		
		System.out.println(adf1.areaTotal());
	    
		ArrayList aux = adf1.getElementos();
		aux.add("Hola Como estas?");
		System.out.println(adf1.areaTotal());
	    
		
	}

}
