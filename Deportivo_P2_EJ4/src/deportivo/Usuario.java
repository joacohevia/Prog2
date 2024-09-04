package deportivo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Usuario {
	private String nombre;
	private boolean esSocio;
	private List<Turno> turnos;
	
	public Usuario(String nombr) {
		this.nombre = nombr;
		this.esSocio = false;
		this.turnos = new ArrayList<>();
	}
	public void agregarTurno(Turno turn) {
        this.turnos.add(turn);
		//para agregar como es de la clase turno tengo q pasar tipo de cancha,
		//idcancha , y Usuario q seria nombre.
	}
	
	public boolean verficarSocio() {
		if(this.contadorReservas()) {
			this.setEsSocio(true);
			return true;
		}
		return false;
	}
	
	public boolean contadorReservas() {
		int contador=0;
		 // Inicializar 'hasta' como la fecha y hora actuales
        LocalDateTime hasta = LocalDateTime.now();
        // Inicializar 'desde' como dos meses antes de 'hasta'
        LocalDateTime desde = hasta.minusMonths(2);
		for(Turno turn : turnos) {
			if(turn.getUsuario() != null && turn.getUsuario().getNombre().equals(this.nombre)
			//el usuario asociado a este turno dame su nombre y comparalo con el nombre actual
			//que seria el usuario q lo esta ejecutando
				&& turn.getFechaHora().isAfter(desde)
				&& turn.getFechaHora().isBefore(hasta)) {
		
				contador++;
			}	
		}
		//recorrer turnos y buscar por nombre
		return contador >=4;
	}
	public int obtenerTurnos() {
	    int numeroDeTurnos = turnos.size();
	    return numeroDeTurnos;  // Retorna la cantidad de turnos
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean EsSocio() {
		return esSocio;
	}

	public void setEsSocio(boolean esSocio) {
		this.esSocio = esSocio;
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}
	
	
}
