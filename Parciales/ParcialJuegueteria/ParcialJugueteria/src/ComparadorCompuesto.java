import java.util.Comparator;

public class ComparadorCompuesto  implements Comparator<ElemLad>{

	Comparator<ElemLad> c1;
	Comparator<ElemLad> c2;
	
	public int compare(ElemLad o1, ElemLad o2) {
		
		int result  = c1.compare(o1, o2);
		
		if(result != 0) {
			return result;
		} else {
			return c2.compare(o1, o2);
		}
	}
	

}
