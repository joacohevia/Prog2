package EjercicioNavidad;


import java.util.ArrayList;

public class BuzonSimple extends TipoBuzon {
	
	private ArrayList<Carta> cartas;
	public static String INTERCAMBIO = "trozo de carbon";
	
	public BuzonSimple(){
		this.cartas = new ArrayList<>();
		this.ninosBuenos = new ArrayList<>();
	}
	
	
	public int getCantidadRecibidas(){
		return cartas.size();
	}
	
	public double getPorcentajeCartasDeterminadoRegalo(String regalo){
		double porcentaje = 0.0;
		porcentaje = (double) this.getCantidadCartasDeterminadoRegalo(regalo) / this.getCantidadRecibidas() * 100;
		
		return porcentaje;
	}
	
	public int getCantidadCartasDeterminadoRegalo(String regalo){
		int totalDeterminadoRegalo = 0;
		
		for(Carta carta: cartas){
			if(carta.getListaRegalos().contains(regalo)){
				totalDeterminadoRegalo++;
			}
		}
		
		return totalDeterminadoRegalo;	
	}
	
	public int getCantidadNinosMalosEnviaronCarta(){
		int totalNinoMalo = 0;
		
		for(Carta carta: cartas){
			if(carta.getListaRegalos().contains(INTERCAMBIO)){
				totalNinoMalo++;
			}
		}
		return totalNinoMalo;
	}
	
	
	public void addCarta(Carta carta){
		if(!this.cartas.contains(carta)){
			if(this.ninosBuenos.contains(carta.getRemitente())){
				this.cartas.add(carta);
			}
			else{
				this.cartas.add(carta);
				carta.vaciarLista();
				carta.addRegalo(INTERCAMBIO);
			}
		}
	}
	
	public void addNinoBueno(String ninoBueno){
		this.ninosBuenos.add(ninoBueno);
	}
	
}
