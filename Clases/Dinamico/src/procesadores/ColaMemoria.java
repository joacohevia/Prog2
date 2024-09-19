package procesadores;

public class ColaMemoria extends ColaTareas {

	 public boolean compare(Tarea t1, Tarea t2) {
		  return t1.getMemoria()>t2.getMemoria();
	  }
}
