package EjercicioNavidad;

import java.util.ArrayList;
public class BuzonPais extends TipoBuzon {

	private ArrayList<BuzonSimple> buzones;
	
	public BuzonPais(){
		this.buzones = new ArrayList<>();
	}
	
	public double getPorcentajeCartasDeterminadoRegalo(String regalo){
		double porcentajeTotal=0;
		
		for(BuzonSimple buzon : buzones){
			porcentajeTotal += buzon.getPorcentajeCartasDeterminadoRegalo(regalo);
		}
		
		return porcentajeTotal;
		
		
	}
	public int getCantidadRecibidas(){
		int totalRecibidas = 0;
		
		for(BuzonSimple buzon : buzones){
			totalRecibidas += buzon.getCantidadRecibidas();
		}
		
		return totalRecibidas;
	}
	
	public int getCantidadNinosMalosEnviaronCarta(){
		int totalCantidadNinosMalos = 0;
		for(BuzonSimple buzon : buzones){
			totalCantidadNinosMalos += buzon.getCantidadNinosMalosEnviaronCarta();
		}
		
		return totalCantidadNinosMalos;
	}
	
	public int getCantidadCartasDeterminadoRegalo(String regalo){
		int totalDeterminadoRegalo = 0;
		
		for(BuzonSimple buzon : buzones){
			totalDeterminadoRegalo += buzon.getCantidadCartasDeterminadoRegalo(regalo);
		}
		
		return totalDeterminadoRegalo;
	}
}
