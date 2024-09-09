package series;

public class Serie {
	String nombre;
	Temporada[] temporadas;
	int nTemporadas;
	
	public Serie(String nombre, int cantTemporadas) {
		this.nombre = nombre;
		this.temporadas = new Temporada[cantTemporadas];
		nTemporadas = 0;
	}
	
	public boolean agregarTemporada(Temporada t) {
		if (nTemporadas < this.temporadas.length) {
			this.temporadas[nTemporadas] = t;
			nTemporadas++;
			return true;
		}
		else
			return false;
	}
	
	public int getTotalEpisodiosVistos() {
		int cant = 0;
		for (int i = 0; i < nTemporadas; i++)
			cant += this.temporadas[i].getTotalEpisodiosVistos();
		return cant;
	}

	public String getNombre() {
		return this.nombre;
	}
}
