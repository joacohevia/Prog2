package series;

public class Temporada {
	
	Episodio[] episodios;
	int nEpisodios;
	
	public Temporada(int cantEpisodios) {
		this.episodios = new Episodio[cantEpisodios];
		nEpisodios = 0;
	}
	
	public boolean agregarEpisodio(Episodio e) {
		if (nEpisodios < this.episodios.length) {
			this.episodios[nEpisodios] = e;
			nEpisodios++;
			return true;
		}
		else
			return false;
	}
	
	public int getTotalEpisodiosVistos() {
		int cant = 0;
		for (int i = 0; i < nEpisodios; i++)
			if (this.episodios[i].isVisto())
				cant++;
		return cant;
	}

}
