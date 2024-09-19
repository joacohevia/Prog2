package procesadores;

public class ProcesadorPorPrioridad extends Procesador {
	

	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getPrioridad() >= t2.getPrioridad();
	}

	@Override
	public boolean compare(Tarea t1, Tarea t2) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'compare'");
	}

}
