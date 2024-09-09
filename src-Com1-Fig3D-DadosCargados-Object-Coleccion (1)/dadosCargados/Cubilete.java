package dadosCargados;

public class Cubilete {
	Dado[] dados;
	
	public Cubilete(int cantDados, int cantCaras) {
		this.dados = new Dado[cantDados];
		for (int i = 0; i < cantDados; i++)
			this.dados[i] = new Dado(cantCaras);
	}
	
	
	// Mucho ojo en otros ejercicio pq conduce a romper el encapsulamiento
	public Dado[] getDados() {
		return dados;
	}

	public void setDados(Dado[] dados) {
		this.dados = dados;
	}

	public int tirar() {
		int suma = 0;
		for (int i = 0; i < this.dados.length; i++) {
			suma += this.dados[i].tirar();
		}
		
		return suma;
	}
}
