package series;
import java.util.ArrayList;

public class Serie {
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private ArrayList <Temporada> temporadas;//de la clase temporada
	
	public Serie(String titu, String descrip,String crea,String gene) {
		this.setTitulo(titu);
		this.setDescripcion(descrip);
		this.setCreador(crea);
		this.setGenero(gene);
		this.temporadas = new ArrayList<>();
	}
	//● Obtener el total de episodios vistos de una serie
	public int totalEpisoSerie() {
		int total=0;
		//aca llamo siempre a temporadas q es el nombre de la var
		for(int i =0; i<temporadas.size(); i++) {
			//Para acceder a un elemento específico dentro de esta lista llamo a temporadas.get(i);
			//devuelve el objeto de tipo Temporada que se encuentra en la posición i de la lista.
			Temporada tempo = temporadas.get(i);
			//emtonces tempo tiene el num de temporada y en esa temporada llamamos a total vistos();
			total += tempo.totalVistos();
		}
		return total;
	}
	//Obtener el promedio de las calificaciones dadas para una serie.
	 	/*tengo q tener la cantidad de episodios total
	 	 * luego la cantidad de los q fueron vistos
	 	 * a cada uno de esos le saco la puntuacion
	 	 * hago el calculo prom = cant/calif
	 	 * */
	 		public double promedioCalif() {
	 			int calificaciones=0;
	 			int total = totalEpisoSerie();
	 			for(int i=0; i<temporadas.size(); i++) {
	 				Temporada tempo = temporadas.get(i);
	 				for(int j=0; j<tempo.getEpisodios().size(); j++) {
	 					Episodio episo = tempo.getEpisodios().get(j);
	 					calificaciones += episo.getCalificacion();
	 					//las calificaciones siempre van a ser 1 a 5 porq no setea negativos
	 				}
	 			}
	 			double prom = calificaciones / total;
				return prom;
	 		}

	 		
	
	public void agregarTempo(Temporada tempo) {
		this.temporadas.add(tempo);
	}
	public Temporada obtenerTempo(int numTempo) {
		return temporadas.get(numTempo);
	}
   
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}


}
