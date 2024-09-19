package procesadores;

import java.util.ArrayList;

public abstract class ColaTareas {

	private ArrayList<Tarea> tareas;
	
	public ColaTareas() {
		tareas = new ArrayList<Tarea>();
	}
	
	public void addTarea(Tarea tt) {
		int lugar = 0;
		while(lugar<tareas.size() &&
				this.compare(tareas.get(lugar),tt)) {
			lugar++;
		}
		if (lugar<tareas.size()) {
			tareas.add(lugar, tt);
		} else {
			tareas.add(tt);
		}
	}
	public boolean tieneTareas() {
		return tareas.size()>0;
	}
	
    public Tarea getPrimera() {
    	if(tareas.size()>0) {
			Tarea t0 = tareas.get(0);
			tareas.remove(0);
			return t0;
		} else {
			return null;
		}
    }
	public abstract boolean compare(Tarea t1, Tarea t2);
	
	public void copiarA(ColaTareas cc) {
		while(this.tieneTareas()) {
			cc.addTarea(this.getPrimera());
		}
	}
}
