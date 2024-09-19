package procesadores;

public class ProcesadorFIFO extends ProcesadorAbstracto {
	
	@Override
	public void agregarTarea(Tarea tarea) {
		this.tareas.add(tarea);
	}

}
