package procesadores;

import java.util.ArrayList;

public class ProcesadorPorMemoria extends Procesador {
	

	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getUsoMem() >= t2.getUsoMem();
	}

}
