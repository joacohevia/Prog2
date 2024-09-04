import java.util.ArrayList;

public class Cliente extends Persona {
	private boolean esSocio;
    private ArrayList<Turno> turnos;

	
	public Cliente(String nombre,String apellido) {
		super(nombre,apellido);
		this.esSocio=false;
        turnos= new ArrayList<>();
	}

	public boolean isEsSocio() {
		return esSocio;
	}

	public void setEsSocio(boolean esSocio) {
		this.esSocio = esSocio;
	}
	public void agregarTurno(Turno t1){
        turnos.add(t1);
    }
	 @Override
	    public String toString() {
	        return  getNombre() + " " + getApellido();
	    }
	
}
