package series;
import java.util.ArrayList;

public class Temporada {
	private int numTemporada;
	private ArrayList <Episodio> episodios;
	
	public Temporada(int num) {
		this.setNumTemporada(num);
		this.episodios = new ArrayList<>();
	}
 	//● Obtener el total episodios vistos de una temporada particular.
	public int totalVistos() {
		int totalVist=0;
						//me da el total de episodios en esta temporada
		for(int i=0; i < episodios.size(); i++) {
			//crea var episodio y le asigna el episodio segun el indice i
			Episodio episodio = episodios.get(i);
			//con la misma var y el episodio guardado llama a visto para saber si se vio o no
			if(episodio.getVisto()) {
				totalVist ++;
			}
		}
		return totalVist;
	}
	public double promTemporada() {
		int totalEpi = totalVistos();
		int totalCalif = 0;
		for(int i=0; i< episodios.size(); i++) {
			Episodio epi = episodios.get(i);
			totalCalif += epi.getCalificacion();
		}
		double prom = totalCalif / totalEpi;
		return prom;
	}
	
	public void agregarEpiso(Episodio episo) {
		this.episodios.add(episo);
	}
	public Episodio obtenerEpi(int numEpi) {
		return episodios.get(numEpi);
	}
	
	public int getNumTemporada() {
		return numTemporada;
	}

	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}


}
