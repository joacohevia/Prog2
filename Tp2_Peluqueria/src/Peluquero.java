import java.time.LocalDateTime;
import java.util.ArrayList;

public class Peluquero extends Persona {
	
	private int idPeluquero;
	private ArrayList<Turno>turnos;
	
	public Peluquero(String nombre, String apellido, int idPeluquero) {
		super(nombre, apellido);
		this.idPeluquero=idPeluquero;
        turnos=new ArrayList<>();

	}
	  //el peluquero va a estar disponible, si en los horarios que le consultan el no esta involucrado..
    public boolean estaDisponible(LocalDateTime horaini, LocalDateTime horafin){//horarios que le consultan
        for(int i=0; i<turnos.size();i++){//recorrer todos sus turnos
            if(turnos.get(i).getHoraIni().isAfter(horafin)&&turnos.get(i).getHoraFin().isBefore(horaini)){
                return true;
            }
        }return false;
    }

	public int getIdPeluquero() {
		return idPeluquero;
	}

	public void setIdPeluquero(int idPeluquero) {
		this.idPeluquero = idPeluquero;
	}
	  public void agregarTruno(Turno t1){
	        turnos.add(t1);
	    }
	  
    @Override
    public String toString() {
        return "Peluquero: " + getNombre() + " " + getApellido() + " (ID: "+ idPeluquero + ")";
    }

	
}
