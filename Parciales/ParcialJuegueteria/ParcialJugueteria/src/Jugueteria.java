import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jugueteria {

	ArrayList<ElemLad> productos;
	
	//APLANADA
	public ArrayList<ElemLad> buscar(Condicion cc){
		ArrayList<ElemLad> salida = new ArrayList<ElemLad>();
		
		for(int i =0; i<productos.size();i++) {
			ElemLad ei = productos.get(i);
			 
			if (cc.cumple(ei)) {
				salida.add(ei);
			}
		}
		Collections.sort(salida);
		return salida;
	}
	
	//Metiendome en el COMBO
	public ArrayList<ElemLad> buscar2(Condicion cc){
		ArrayList<ElemLad> salida = new ArrayList<ElemLad>();
		
		for(int i =0; i<productos.size();i++) {
			ElemLad ei = productos.get(i);

             salida.addAll(ei.buscar(cc));
		}
		Collections.sort(salida);
		return salida;
	}
	
	
	public ArrayList<ElemLad> buscar(Condicion cc, Comparator<ElemLad> orden){
		ArrayList<ElemLad> salida = this.buscar(cc);
		Collections.sort(salida,orden);
		return salida;
	}
	
}
