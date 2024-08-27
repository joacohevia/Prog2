package series;

public class main_serie {
	/*lo que hace este programa es crear un array list de TEMPORADAS en la class SERIE
	 * en este array se guardan las temporadas, esta en la clase SERIE por que cada SERIE 
	 * tiene muchas o una temporada, luego crea un objeto SERIE otro OBJ TEMPORADA y en
	 * el mismo OBJ TEMPORADA crea los EPISODIOS ya que TEMPORADA tiene otro array lits de
	 * EPISODIOS por ultimo agrega al array de SERIE la temporada con los episodios creados */
	public static void main(String[] args) {
		Serie serie1 = new Serie("Lucifer","nnn","Mario Luis","Drama");
		Temporada temporadaLucifer1 = new Temporada(1);
		temporadaLucifer1.agregarEpiso(new Episodio("Episodio 1","Temporada 1",true,1));
		temporadaLucifer1.agregarEpiso(new Episodio("Episodio 2","Temporada 1",true,1));//creo los espisodios en la temporada
		Temporada temporadaLucifer2 = new Temporada(2);
		temporadaLucifer2.agregarEpiso(new Episodio("Epi 1","Tempo 2",true,5));
		temporadaLucifer2.agregarEpiso(new Episodio("Epi 2","Tempo 2",true,5));;
		serie1.agregarTempo(temporadaLucifer1);
		serie1.agregarTempo(temporadaLucifer2);
		
		//Temporada seleccionTempo = serie1.obtenerTempo(0);
		System.out.println(serie1.getTitulo());
		int totalEpiso = temporadaLucifer1.totalVistos();//total epi vistos
		int totalEpiTemp = serie1.totalEpisoSerie();//total vistos en la serie
		double promTotal = serie1.promedioCalif();// total de calificacion
		double promTemporada = temporadaLucifer1.promTemporada(); //promedio temporada
		Episodio seleccionEpi = temporadaLucifer1.obtenerEpi(0);//temporadaLucifer1 o 2
		if(seleccionEpi.getVisto()) {
			System.out.println("Episodio visto: "+seleccionEpi.getTitulo()+","+seleccionEpi.getDescripcion());
			System.out.println("| Calificacion: "+seleccionEpi.getCalificacion()+"| Total episodios vistos en la temporada : "+totalEpiso+". "
					+ "| Total episodios vistos en la serie "+totalEpiTemp+"| Promedio temporada: "+promTemporada+"| Promedio de Serie: "+promTotal);
		} else {
			System.out.println("Episodio NO VISTO: "+seleccionEpi.getTitulo()+","+seleccionEpi.getDescripcion()
			+", Calificacion: "+seleccionEpi.getCalificacion());
		}
		 
				
		/*Episodio seleccionEpi2 = temporadaLucifer2.obtenerEpi(0);
		System.out.println(seleccionEpi2.getTitulo()+","+seleccionEpi2.getDescripcion());*/
		
		/*
		Serie serie2 = new Serie("the breaking bad","nnn","lusi","comedia");
		Temporada temporadaBreaking1 = new Temporada(1);
		temporadaBreaking1.agregarEpiso(new Episodio("Episodio 1","Temporada 1"));
		serie2.agregarTempo(temporadaBreaking1);
		Temporada temporadaBreaking2 = new Temporada(2);
		temporadaBreaking2.agregarEpiso(new Episodio("Episodio 1","Temporada 2"));
		temporadaBreaking2.agregarEpiso(new Episodio("Episodio 2","Temporada 2"));
		serie2.agregarTempo(temporadaBreaking2);
		
		

		System.out.println(serie2.getTitulo());
		Episodio seleccionEpi3 = temporadaBreaking1.obtenerEpi(0);
		System.out.println(seleccionEpi3.getTitulo()+","+seleccionEpi3.getDescripcion());
		
		int cantidadTemporadas = serie1.getTemporadas().size();
		System.out.println("Cantidad de temporadas: "+cantidadTemporadas);
		*/
	}

}
