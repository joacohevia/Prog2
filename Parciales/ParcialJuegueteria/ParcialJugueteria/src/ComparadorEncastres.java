import java.util.Comparator;

public class ComparadorEncastres implements Comparator<ElemLad>{

	@Override
	public int compare(ElemLad o1, ElemLad o2) {
		
		return o1.getEncastres() - o2.getEncastres();
	}
	

}
