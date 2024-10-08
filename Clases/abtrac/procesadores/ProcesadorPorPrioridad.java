package procesadores;

public class ProcesadorPorPrioridad extends Procesador {
	

	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getPrioridad() >= t2.getPrioridad();
	}

	
}
