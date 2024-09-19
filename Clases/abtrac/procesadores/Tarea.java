package procesadores;

public class Tarea {
	private String nombre;
	private int usoCPU;
	private int usoMem;
	private int prioridad;
	
	public Tarea(String nombre, int usoCPU, int usoMem, int prioridad) {
		this.usoCPU = usoCPU;
		this.usoMem = usoMem;
		this.prioridad = prioridad;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getUsoCPU() {
		return usoCPU;
	}
	public void setUsoCPU(int usoCPU) {
		this.usoCPU = usoCPU;
	}
	public int getUsoMem() {
		return usoMem;
	}
	public void setUsoMem(int usoMem) {
		this.usoMem = usoMem;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public void ejecutar() {
		System.out.println("Se ejecuto " + this);
	}
	
	public String toString() {
		return this.getNombre() + " CPU: " + this.getUsoCPU() + 
				" Mem: " + this.getUsoMem() + 
				" Prioridad: " + this.getPrioridad();
	}

}
