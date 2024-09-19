package procesadores;

import java.util.ArrayList;

public  class Procesador {

	
	protected ColaTareas tareas;
	
	public Procesador() {
		tareas = new ColaCpu();
	}
	public void ejecutarTarea() {
      Tarea t1 = tareas.getPrimera();
      if (t1!=null)
    	  t1.ejecutar();
       
	}
	
	public  void addTarea(Tarea taux) {
		tareas.addTarea(taux);
	};
	
	public boolean tieneTareas() {
		return tareas.tieneTareas();
	}
	
	public void cambiar(ColaTareas tt) {
		//tareas = tt;
		tareas.copiarA(tt);
		tareas = tt;
	}
}
