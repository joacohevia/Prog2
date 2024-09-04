package DadosTramposo;

public class DadoCargado extends Dado{

	private int ladoCargado;
	private double probabilidad;

	public DadoCargado(int c, int ladoCargado) {
		super(c);
		this.ladoCargado = ladoCargado;
		probabilidad = 0.5;
	}
	
	

	public double getProbabilidad() {
		return probabilidad;
	}



	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}



	public int getLadoCargado() {
		return ladoCargado;
	}

	public void setLadoCargado(int ladoCargado) {
		this.ladoCargado = ladoCargado;
	}
	
	public int tirar() {
		
		if (Math.random()<probabilidad) {
			return ladoCargado;
		} else {
			return super.tirar();
		}
		
	}
	
	public static void main(String[] args) {
		Dado d1 = new Dado(6);
		DadoCargado d2 = new DadoCargado(6,6);
		d2.setProbabilidad(0.99);
		for(int i=0; i<100; i++) {
			System.out.println("D1:"+ d1.tirar() + " - D2:"+d2.tirar() );
		}
		
		Dado da1 = new Dado(6);
		Dado da2 = new Dado(6);
		
		if (da1 == da2) {
			System.out.println(" SON IGUALES");
		} else {
			System.out.println("NO SON IGUALES");
		}
		
		if (da1.equals(new Cubilete())) {
			System.out.println("SON IGUALES EQUALS");
		} else {
			System.out.println("NO SON IGUALES EQUALS");
		}
		Cubilete cc = new Cubilete();
	    String mensaje = "Hola " + da1;
		System.out.println(mensaje);
		
	}
	
}
