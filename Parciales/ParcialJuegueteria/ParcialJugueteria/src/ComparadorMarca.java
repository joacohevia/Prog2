import java.util.Comparator;

public class ComparadorMarca implements Comparator<ElemLad>{

	@Override
	public int compare(ElemLad o1, ElemLad o2) {
		
		return o1.getMarca().compareTo(o2.getMarca());
	}
	

}
