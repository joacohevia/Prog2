package procesadores;

public class CentroDeComputos {

	public static void main(String[] args) {
		Tarea t1 = new Tarea("t1", 10, 6, 1);
		Tarea t2 = new Tarea("t2", 5, 10, 3);
		Tarea t3 = new Tarea("t3", 8, 5, 2);
		
		ProcesadorPorCPU cpu1 = new ProcesadorPorCPU();
		cpu1.agregarTarea(t1);
		cpu1.agregarTarea(t2);
		cpu1.agregarTarea(t3);
		
		cpu1.ejecutarTodas();
		
		System.out.println();
		
		ProcesadorPorMemoria mem1 = new ProcesadorPorMemoria();
		mem1.agregarTarea(t1);
		mem1.agregarTarea(t2);
		mem1.agregarTarea(t3);
		
		mem1.ejecutarTodas();
		
		System.out.println();
		
		ProcesadorFIFO fifo = new ProcesadorFIFO();
		fifo.agregarTarea(t1);
		fifo.agregarTarea(t2);
		fifo.agregarTarea(t3);
		
		fifo.ejecutarTodas();
		
		// Version para mostrar los problemas que trae pasar la estructura (ArrayList) en el constructor (o set)
		//ArrayList<Tarea> otrasTareas = new ArrayList<>();
		//ProcesadorPorPrioridad prior = new ProcesadorPorPrioridad(otrasTareas);
		//prior.agregarTarea(t1);
		//prior.agregarTarea(t2);
		//otrasTareas.add(t3);
		
		//prior.ejecutarTodas();
	}
}
