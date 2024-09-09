package dadosCargados;

public class DadoCargado extends Dado {
	
	int caraCargada;
	double limite;
	
	public DadoCargado(int cantCaras, int caraCargada, double limite) {
		super(cantCaras);
		this.setCaraCargada(caraCargada);
		this.limite = limite;
	}
	
	public void setCaraCargada(int caraCargada) {
		if (caraCargada > this.getCantCaras()) {
			this.caraCargada = this.getCantCaras();
		}
		else
			this.caraCargada = caraCargada;
				
	}
	
	@Override
	public int tirar() {
		if (Math.random() > this.limite)
			// Lado cargado
			return this.caraCargada;
		else
			// Comportamiento normal
			return super.tirar();
	}

}
