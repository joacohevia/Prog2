package dadosCargados;

public class Juego {
	
	final static int DEF_RONDAS = 10;
	final static int DEF_PUNTAJE_MAX = 7;
	//int puntos1;
	//int puntos2;
	
	Jugador j1;
	Jugador j2;
	int cantRondas;
	int puntajeMax;
	//Dado dado1;
	//Dado dado2;
	Cubilete cub;
	
	public Juego(int cantCaras, Jugador j1, Jugador j2, int cantDados) {
		this(DEF_RONDAS, DEF_PUNTAJE_MAX, cantCaras, j1, j2, cantDados);
		//puntos1 = 0;
		//puntos2 = 0;
		//cantRondas = DEF_RONDAS;
	}
	
	public Juego(int cantRondas, int puntajeMax, int cantCaras, Jugador j1, Jugador j2, int cantDados) {
		this.cantRondas = cantRondas;
		this.puntajeMax = puntajeMax;
		//puntos1 = 0;
		//puntos2 = 0;
		//this.dado1 = new Dado(cantCaras);
		//this.dado2 = new Dado(cantCaras);
		
		this.cub = new Cubilete(cantDados, cantCaras);
		this.j1 = j1;
		this.j2 = j2;
	}
	
	public Jugador jugar() {
		int ronda1, ronda2;
		j1.vaAJugar();
		j2.vaAJugar();
		// Desarrollamos 10 rondas
		for (int i = 0; i < cantRondas; i++) {
			// Tirar los dados
			ronda1 = j1.tirarDado(cub);//dado1.tirar() + dado2.tirar();
			ronda2 = j2.tirarDado(cub);//dado1.tirar() + dado2.tirar();
			
			// Determinar los puntos
			if (ronda1 >= this.puntajeMax && ronda1 > ronda2)
				j1.aumentarPuntaje();
			else
				if (ronda2 >= this.puntajeMax && ronda2 > ronda1)
					j2.aumentarPuntaje();
		}
		
		// Determinar el ganador
		Jugador ganador = null;
		if (j1.getPuntos() > j2.getPuntos()) {
			ganador = j1;
			j1.gano();
		}
		else
			if (j2.getPuntos() > j1.getPuntos()) { 
				ganador = j2;
				j2.gano();
			}
			//else
			//	System.out.println("Empate");
		
		// Retornamos el jugador ganador y que decida quien lo usa cómo muestra la información
		// En caso de empate se retorna null
		return ganador; 
	}
	


}
