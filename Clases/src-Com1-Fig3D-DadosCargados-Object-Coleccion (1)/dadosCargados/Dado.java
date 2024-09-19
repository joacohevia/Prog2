package dadosCargados;

public class Dado {
	private static final int DEF_CARAS = 6;
	private int cantCaras;
	
	public Dado() {
		this(DEF_CARAS);
	}
	
	public Dado(int cantCaras) {
		if (!this.setCantCaras(cantCaras))
			this.cantCaras = DEF_CARAS;
	}
	
	public int getCantCaras() {
		return cantCaras;
	}

	public boolean setCantCaras(int cantCaras) {
		if (cantCaras > 0) {
			this.cantCaras = cantCaras;
			return true;
		}
		else
			return false;
	}

	public int tirar() {
		return (int)(Math.random() * this.cantCaras) + 1;
	}
	
	public boolean equals(Object otro) {
		// Realizar el casting
		try {
			Dado otroDado = (Dado)otro;
			return otroDado.getCantCaras() == this.getCantCaras();
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
