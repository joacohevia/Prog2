
public class CondicioMenorEncastres extends Condicion {

	int peso;
	public boolean cumple(ElemLad ele) {
		
		return ele.getEncastres()<peso;
	}


}
