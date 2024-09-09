package series;

public class Principal {
	public static void main(String[] args) {
		Serie serie = new Serie("Una gran serie", 2);
		
		Temporada t1 = new Temporada(2);
		
		Episodio e1_1 = new Episodio("Piloto","Primer episodio");
		Episodio e2_1 = new Episodio("Final","Fin de temporada");
		e2_1.setVisto(true);
		
		t1.agregarEpisodio(e1_1);
		t1.agregarEpisodio(e2_1);
		
		serie.agregarTemporada(t1);
		
		Temporada t2 = new Temporada(2);
		
		Episodio e1_2 = new Episodio("Comienzo2","Vuelve a empezar");
		e1_2.setVisto(true);
		
		Episodio e2_2 = new Episodio("Final2","Vuelve a terminar");
		
		t2.agregarEpisodio(e1_2);
		t2.agregarEpisodio(e2_2);
		
		serie.agregarTemporada(t2);
		
		System.out.println("Episodios vistos de " + serie.getNombre() + ": " + 
										serie.getTotalEpisodiosVistos());
	}
}
