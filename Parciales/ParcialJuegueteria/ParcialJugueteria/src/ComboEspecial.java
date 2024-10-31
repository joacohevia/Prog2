
public class ComboEspecial extends Combo {

	Condicion aceptacion;
	
	
	
	public void addElemento(ElemLad el) {
      
		if (aceptacion.cumple(el)) {
			super.addElemento(el);
		}
	}


	public Condicion getAceptacion() {
		return aceptacion;
	}


	public void setAceptacion(Condicion aceptacion) {
		this.aceptacion = aceptacion;
	}


	public ComboEspecial(int descuento, Condicion aceptacion,String marca) {
		super(descuento, marca);
		this.aceptacion = aceptacion;
	}
	
	//ESTO ESTA MAL
	/*
	public void addElemento(ElemLad el, Condicion cc) {
	      
		if (cc.cumple(el)) {
			super.addElemento(el);
		}
	}*/
	
	
	
}
