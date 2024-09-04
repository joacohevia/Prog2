import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Peluqueria {
	private ArrayList <Persona> peluqueros;
	private ArrayList <Persona> clientes;
	private ArrayList <Turno> turnos;
	private LocalDateTime turnoInicio;
	private LocalDateTime turnoFin;
	private String nombre;
	
	public Peluqueria(String nombre, LocalDateTime apertura, LocalDateTime cierre) {
		this.nombre=nombre;
		this.turnoInicio=apertura;
		this.turnoFin=cierre;
	    this.peluqueros = new ArrayList<>();
	    this.clientes = new ArrayList<>();
	    this.turnos = new ArrayList<>();
	}
	public ArrayList<Persona> getPeluqueros() {
		return new ArrayList<>(peluqueros);
	}//siempre devuelvo copias del array asi el usuario no los puede modificar
	public ArrayList<Persona> getClientes(){
		return new ArrayList<>(clientes);
	}
	public ArrayList<Turno> getTurnos(){
		return new ArrayList<>(turnos);
	}
	
	 public void primerTurnoDisponible(){
	        for(int i=0; i<turnos.size();i++){
	                LocalDateTime ultimaHora=turnos.get(i).getHoraFin();
	        }
	    }
	public boolean agregarTurno(LocalDateTime fechaIni, LocalDateTime fechaFin, int precio, Cliente cliente1,
			Peluquero peluquero1) {
		if(turnoDispo(peluquero1,fechaIni,fechaFin)) {
			Turno t1 = new Turno(fechaIni, fechaFin, precio, cliente1, peluquero1);
			turnos.add(t1);//agrego turno con peluquero ect
			cliente1.agregarTurno(t1);//a la clase cliente le agrego turno
			peluquero1.agregarTruno(t1);//le agrego turno al peluquero
			return true;
		}else {
			return false;
		}
	}
	public boolean turnoDispo(Peluquero peluquero1, LocalDateTime fechaIni, LocalDateTime fechaFin) {
		for(int i=0; i<turnos.size(); i++) {
			if(!turnos.get(i).turnoDisponible(fechaIni, fechaFin)|| !peluquero1.estaDisponible(fechaIni, fechaFin)) {
				return false;
			}
		}
		return true;
	}
	

	public int obtenerNumClientes() {
		int num = clientes.size();
		return num;
	}
	public int obtenerNumPelu() {
		int num = peluqueros.size();
		return num;
	}
	public int obtenerNumTurn() {
		int num = turnos.size();
		return num;
	}
	
	public void agregarCLiente(Persona client) {
		this.clientes.add(client);
	}
	
	/*
	 * Si prefieres un enfoque más estructurado y modular, donde la creación y la verificación del Turno estén
	 *  separadas, el segundo método (agregarTurno(Turno turn)) es más conveniente. Esto te permite tener una
	 *   lógica de creación de turnos en un lugar separado y usar este método solo para las verificaciones y la adición.

		Si quieres mantener todo el proceso en un solo lugar, el primer método 
 (agregarTurno(LocalDateTime fechaIni, LocalDateTime fechaFin, int i, Cliente cliente1, Peluquero peluquero1))
  puede ser mejor, ya que encapsula todo el proceso en una única llamada, lo que puede ser más fácil de manejar
   si todas las verificaciones y la creación deben ocurrir al mismo tiempo.
	 
	public void agregarTurno(Turno turn) {
		//comparar turnos para esa fecha en turnos
		//comparar si el peluquero esta disponible en peluquerp
		//si ambas dan true agrego el turno y retorno true
		
		this.turnos.add(turn);
	}*/
	public void agregarPeluquero(Persona pelu) {
		this.peluqueros.add(pelu);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDateTime getTurnoInicio() {
		return turnoInicio;
	}
	public void setTurnoInicio(LocalDateTime turnoInicio) {
		this.turnoInicio = turnoInicio;
	}
	public LocalDateTime getTurnoFin() {
		return turnoFin;
	}
	public void setTurnoFin(LocalDateTime turnoFin) {
		this.turnoFin = turnoFin;
	}
	
	public void setPeluqueros(ArrayList<Persona> peluqueros) {
		this.peluqueros = peluqueros;
	}

	public void setClientes(ArrayList<Persona> clientes) {
		this.clientes = clientes;
	}
	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}

	

	
	
}
