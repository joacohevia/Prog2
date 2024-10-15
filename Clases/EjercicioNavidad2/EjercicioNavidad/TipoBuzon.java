package EjercicioNavidad;

import java.util.ArrayList;

public abstract class TipoBuzon {
	
	protected ArrayList<String> ninosBuenos;
	
	public abstract int getCantidadRecibidas();
	
	public abstract int getCantidadNinosMalosEnviaronCarta();
	
	public abstract int getCantidadCartasDeterminadoRegalo(String regalo);
	
	public abstract double getPorcentajeCartasDeterminadoRegalo(String regalo);

}
