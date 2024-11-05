import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
	ArrayList<ElementoVentas> vendedores;
	Comparator<ElementoVentas> ordenador;//atributo get y set
	
	public ArrayList<ElementoVentas> getRaking(){
		ArrayList<ElementoVentas> salida = new ArrayList<ElementoVentas>(vendedores);//creo copia
	    Collections.sort(salida,ordenador);
	    return salida;
	}

	public ArrayList<Vendedor> buscar(Condicion c){
		ArrayList<Vendedor> salida = new ArrayList<Vendedor>();
		for(int i =0; i< vendedores.size(); i++) {
			ElementoVentas aux = vendedores.get(i);
			salida.addAll(aux.buscar(c));
		}
		return salida;
	}

	public Comparator<ElementoVentas> getOrdenador() {
		return ordenador;
	}

	public void setOrdenador(Comparator<ElementoVentas> ordenador) {
		this.ordenador = ordenador;
	}
}
