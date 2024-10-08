package PapaNoel;

import java.util.ArrayList;

public class BuzonProv extends ElementoBuzon{
	private ArrayList<Buzon> buzones;

    public BuzonProv(){
		this.buzones = new ArrayList<>();
	}
	
    @Override
    public int cantidadRecibidas() {
       int totalRecibidas = 0;
		
		for(Buzon buzon : buzones){
			totalRecibidas += buzon.cantidadRecibidas();
		}
		
		return totalRecibidas;
    }

    @Override
    public int cantidadCartaNiniosMalos() {
        int totalCantidadNinosMalos = 0;
		for(Buzon buzon : buzones){
			totalCantidadNinosMalos += buzon.cantidadCartaNiniosMalos();
		}
		
		return totalCantidadNinosMalos;
    }

    @Override
    public int cantidadRegalosCartas(String rr) {
       int totalDeterminadoRegalo = 0;
		
		for(Buzon buzon : buzones){
			totalDeterminadoRegalo += buzon.cantidadRegalosCartas(rr);
		}
		
		return totalDeterminadoRegalo;
    }

    @Override
    public double porcentajeRegaloCartas(String rr) {
        double porcentajeTotal=0;
		
		for(Buzon buzon : buzones){
			porcentajeTotal += buzon.porcentajeRegaloCartas(rr);
		}
		
		return porcentajeTotal;
    }
    
}
