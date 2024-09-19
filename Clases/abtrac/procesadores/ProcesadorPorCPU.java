package procesadores;

import java.util.ArrayList;

public class ProcesadorPorCPU extends Procesador {
	
	// No es obligatorio definir el constructor pq en Procesador hay defindo uno sin parametros


	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getUsoCPU() >= t2.getUsoCPU();
	}

}
