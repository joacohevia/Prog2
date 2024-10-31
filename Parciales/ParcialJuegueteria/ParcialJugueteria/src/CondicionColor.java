
public class CondicionColor extends Condicion {

	String aColor;

	public boolean cumple(ElemLad ele) {
		// TODO Auto-generated method stub
		return ele.getColor().equals(aColor);
	}

}
