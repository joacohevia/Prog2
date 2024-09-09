package dadosCargados;

public class Principal {
	
	public static void main(String[] args) {
		int cantDados = 3;
		int cantCaras = 6;
		
		Jugador pepe = new Jugador("Pepe");
		JugadorTramposo tito = new JugadorTramposo("Tito", cantDados);
		
		if (pepe.equals(tito))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintos");
		
		tito.agregarDado(new DadoCargado(cantCaras, 6, 0.5));
		tito.agregarDado(new DadoCargado(cantCaras, 6, 0.5));
		tito.agregarDado(new DadoCargado(cantCaras, 6, 0.7));
		
		
		Juego juego1 = new Juego(cantCaras, pepe, tito, cantDados);
		Jugador ganador = juego1.jugar();
		if (ganador != null)
			System.out.println("Ganó " + ganador.getNombre());
		else
			System.out.println("Empate");
		
		Juego juego2 = new Juego(200,3, cantCaras, pepe, tito, cantDados);
		ganador = juego2.jugar();
		if (ganador != null)
			System.out.println("Ganó " + ganador.getNombre());
		else
			System.out.println("Empate");
		
		System.out.println(pepe.imprimirEstadistica());
		System.out.println(tito.imprimirEstadistica());
	}

}
