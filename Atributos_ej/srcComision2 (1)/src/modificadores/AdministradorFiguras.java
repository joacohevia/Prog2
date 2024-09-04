package modificadores;

import java.util.ArrayList;

import figuras.Figura;

public class AdministradorFiguras {

	ArrayList<Figura> elementos;
	
	public AdministradorFiguras() {
		elementos = new ArrayList<Figura>();
	}
	
	public void addFigura(Figura ff) {
		//Figura deberia implementar el equals
		if (!elementos.contains(ff)) {
			elementos.add(ff);
		}
	}
	
	public ArrayList<Figura> mayoresQue(int minimo){
		ArrayList<Figura> salida = new ArrayList<Figura>();
		for(int i =0; i< elementos.size();i++) {
			Figura f1 = elementos.get(i);
			if (f1.getArea()>minimo) {
				salida.add(f1);
			}
		}
		return salida;
	}
	
	public double areaTotal() {
		double suma = 0;
		for(int i = 0; i<elementos.size();i++) {
			Figura f1 = elementos.get(i);
			suma = suma + f1.getArea();
		}
		return suma;
	}
	
	public ArrayList<Figura> getElementos(){
		ArrayList<Figura> aux = new ArrayList();
		aux.addAll(elementos);
		return aux;
		
		//return  new ArrayList<Figura>(elementos);
	    //  return (ArrayList<Figura>)elementos.clone();
	}
	
	public int cantidadFiguras() {
		return elementos.size();
	}
}
