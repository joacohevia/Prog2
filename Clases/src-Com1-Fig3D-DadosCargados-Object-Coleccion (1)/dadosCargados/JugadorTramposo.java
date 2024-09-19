package dadosCargados;

public class JugadorTramposo extends Jugador {
	
	Dado[] dadosCargados;
	int nDados; // Cantidad de dados que tengo agregados hasta el momento
	
	public JugadorTramposo(String nombre, int max_dados) {
		super(nombre);
		this.dadosCargados = new Dado[max_dados];
		nDados = 0;
	}
	
	public boolean agregarDado(Dado dado) {
		// Tengo lugar para agregar dados??
		if (nDados < dadosCargados.length) {
			// Hay lugar
			dadosCargados[nDados] = dado;
			nDados++;
			return true;
		}
		else
			return false;
			
	}

	public int tirarDado(Cubilete cub) {
		// Sacar los dados del cubilete
		Dado[] originales = cub.getDados();
		// Poner los cargados
		cub.setDados(dadosCargados);
		// Tirar
		int resultado = super.tirarDado(cub);
		// Volver a cambiar los dados
		cub.setDados(originales);
		
		return resultado;
	}

}
