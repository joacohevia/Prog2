package series;

public class Persona_2 {
	private String nombre;
	private boolean asistente;
	private int telefono;
	private String email;
	
	
	public Persona_2(String nombr,boolean esAsistente,int telefon,String email) {
		this.setNombre(nombr);
		this.setAsistente(esAsistente);
		this.setTelefono(telefon);
		this.setEmail(email);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean getAsistente() {
		return asistente;
	}

	public void setAsistente(boolean asistente) {
		this.asistente = asistente;
	}//si es true es asistente

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
