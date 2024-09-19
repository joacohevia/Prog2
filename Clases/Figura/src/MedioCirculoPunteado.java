
public class MedioCirculoPunteado extends MedioCirculo {

	public MedioCirculoPunteado(double r) {
		super(r);
	}
	
	public double getDiametro() {
		return super.getDiametro()/3;
	}
}
