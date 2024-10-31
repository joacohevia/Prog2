import java.util.ArrayList;

public class Combo extends ElemLad{

	ArrayList<ElemLad> elems; //ADD Elemento
    int descuento;//GET Y SET
    
    public void addElemento(ElemLad lad) {
      if (!elems.contains(lad))	//Tiene que implementar el equals ElemLad
    	elems.add(lad);
    }
    
	public Combo(int descuento,String marca) {
		super(marca);
		this.descuento = descuento;
		elems = new ArrayList<ElemLad>();
	}
	
	
	public double getCosto() {
	
		double suma =0;
		
		for (int i=0;i<elems.size();i++) {
			suma = suma + elems.get(i).getCosto();
		}
		
		return suma - (suma*descuento)/100;
		
	}
	
	public int getEncastres() {
        int suma =0;
        
		for (int i=0;i<elems.size();i++) {
			suma = suma + elems.get(i).getEncastres();
		}
		if (elems.size()>0)
		   return  (int)  suma/elems.size();
		else 
			return 0;
		
	}
	
	public  String getColor() {
		if (elems.size()>0)
		  return elems.get(elems.size()-1).getColor();
		else 
		  return null;
	}
	
	public double getPeso() {
          double suma =0;
		
		for (int i=0;i<elems.size();i++) {
			suma = suma + elems.get(i).getPeso();
		}
		
		return suma; 
		
	}
	
	public ArrayList<ElemLad> buscar(Condicion cc){
		ArrayList<ElemLad> salida = new ArrayList<ElemLad>();
		
		if (cc.cumple(this)) {
			salida.add(this);
		}
		
		for(int i =0; i<elems.size();i++) {
			salida.addAll(elems.get(i).buscar(cc));//DELEGO EN LOS ELEMENTOS
		}
		return salida;
	}
	
	
}
