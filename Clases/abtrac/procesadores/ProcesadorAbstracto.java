package procesadores;

import java.util.ArrayList;

public abstract class ProcesadorAbstracto {
	protected ArrayList<Tarea> tareas;
	
	public ProcesadorAbstracto() {
		this.tareas = new ArrayList<>();
	}
	
	// No puedo garantizar que las tareas vengan en el orden correcto, mejor inicializar el arreglo y proveer un metodo para agregar
	//public ProcesadorAbstracto(ArrayList<Tarea> tareas) {
	//	this.tareas = new ArrayList<>(tareas);
	//}
	
	// Solo si no hay otro remedio, en general, hay otras alternativas
	//public ArrayList<Tarea> getTareas() {
	//	return new ArrayList<>(tareas); // Retorna una copia
	//}
	
	public void ejecutarTarea() {
		// Ejecuta la primera tarea de la lista de tareas
		if (!tareas.isEmpty()) {
			// No está vacio, puedo ejecutar la primera
			Tarea tareaAEjecutar = tareas.remove(0);
			if (tareaAEjecutar != null)
				// La ejecuto
				tareaAEjecutar.ejecutar();
		}
	}
	
	public void ejecutarTodas() {
		int n = this.tareas.size();
		for(int i = 0; i < n; i++)
			this.ejecutarTarea();
	}
	
	public abstract void agregarTarea(Tarea tarea);
}
