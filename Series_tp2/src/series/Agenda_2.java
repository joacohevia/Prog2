package series;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Agenda_2 {
	private String nombre_usuario;
	private ArrayList <Reunion_2> reunion;

	
	public Agenda_2(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
		this.reunion = new ArrayList<>();
	}
	
	
	   public void agregarReunion(Reunion_2 nuevaReunion) {
		   LocalDateTime inicioNueva = nuevaReunion.getFecha_hora();
		   boolean conflicto=false;
	        for (Reunion_2 reunio : reunion) {
	        	if(!conflicto) {
	        		LocalDateTime inicioExistente = reunio.getFecha_hora();
	        		if(inicioNueva.equals(inicioExistente)) {
	        			System.out.println("Ya existe una reunion con ese dia y horario");
	        			conflicto=true;
	        		}
	        	}
	        }
	        if (!conflicto) {
	            this.reunion.add(nuevaReunion);
	        }
	        
	    }	
	/*public void agregarReunion(Reunion_2 reun) {
		for (Reunion_2 reunio : reunion) {
            LocalDateTime finReunion = reunio.getFecha_hora();
            LocalDateTime nuevaReunion = reun.getFecha_hora();
            if(finReunion.equals(nuevaReunion)) {
        		System.out.println("no se puede");
            }else {
            	 this.reunion.add(reun);
            	 System.out.println("agregada");
            }
		}
	}*/
	public Reunion_2 obtenerReunion(int numReunion) {
		return reunion.get(numReunion);
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	
	
}
