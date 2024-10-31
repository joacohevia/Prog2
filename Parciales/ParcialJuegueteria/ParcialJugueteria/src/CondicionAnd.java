
public class CondicionAnd extends Condicion {

	Condicion c1;
	Condicion c2;
	public boolean cumple(ElemLad ele) {
		// TODO Auto-generated method stub
		return c1.cumple(ele) && c2.cumple(ele);
	}

}
