import java.util.ArrayList;

public abstract class ElemLad implements Comparable<ElemLad>{
	String marca;
	public ElemLad(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public abstract double getCosto();
	public abstract int getEncastres();
	public abstract String getColor();
	public abstract double getPeso();

	//BUSQUEDA NO APLANADA
	//APLANADA
	public abstract ArrayList<ElemLad> buscar(Condicion cc);
	
	public ArrayList<ElemLad> buscar(Condicion cc, Comparator<ElemLad> orden){
		ArrayList<ElemLad> salida = this.buscar(cc);
		Collections.sort(salida,orden);
		return salida;
	}
	public int compareTo(ElemLad o) {
       int result = marca.compareTo(o.getMarca());
       if (result ==0) {
    	   double otroCosto =o.getCosto();
    	   double miCosto = this.getCosto();
    	   if (miCosto>otroCosto) {
    		   return 1;
    	   }else if (miCosto<otroCosto) {
    		   return -1;
    	   }else {
    		   
    		   result = this.getEncastres() - o.getEncastres();
    		   if(result == 0) {
    			   return this.getColor().compareTo(o.getColor());
    		   }
    		   else {
    			   return result;
    		   }
    	   }
    		   
       } else {
    	   return result;
       }
	
	}
	
	
}
