package procesadores;

public class ColaCpu extends ColaTareas {

	 public boolean compare(Tarea t1, Tarea t2) {
		  return t1.getCpu()>t2.getCpu();
	  }

}
