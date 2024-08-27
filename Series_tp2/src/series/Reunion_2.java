package series;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion_2 {
	private String lugar;
	private String tema;
	private String duracion;
	private LocalDateTime fecha_hora;
	private ArrayList <Persona_2> personas;
	
	public Reunion_2(String lugar, String tema, String duracion, LocalDateTime fecha_hora) {
		this.lugar = lugar;
		this.tema = tema;
		this.duracion = duracion;
		this.setFecha_hora(fecha_hora);
		this.personas = new ArrayList<>();
	}
	public void agregarPersona(Persona_2 person) {
		this.personas.add(person);
	}
	public Persona_2 obtenerPersona(int numPerson) {
		return personas.get(numPerson);
	}
	public ArrayList<Persona_2> getPersona() {
		return personas;
	}

	public void setPersona(ArrayList<Persona_2> personas) {
		this.personas = personas;
	}

	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public LocalDateTime getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(LocalDateTime fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	
	
}
