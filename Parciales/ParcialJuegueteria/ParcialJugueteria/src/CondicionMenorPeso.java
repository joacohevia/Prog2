
public class CondicionMenorPeso extends Condicion {

	double peso;
	public boolean cumple(ElemLad ele) {
		
		return ele.getPeso()<peso;
	}

}
