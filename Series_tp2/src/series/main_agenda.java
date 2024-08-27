package series;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class main_agenda {
	
	public static void main (String[] args) {
		LocalDateTime fechaHora = LocalDateTime.of(2010, 8, 18, 10, 15, 30);
		LocalDateTime fechaHora2 = LocalDateTime.of(2015, 9, 20, 12, 12, 20);

		Agenda_2 agenda1 = new Agenda_2("Joaco_usuario");
		
		Reunion_2 reunion1 = new Reunion_2("Havanna","Consorsio","1:30h",fechaHora);
		reunion1.agregarPersona(new Persona_2("Alfred",true,24942323,"alfred.gmail.com"));
		reunion1.agregarPersona(new Persona_2("Alfredooo",false,24923,"aed.gmail.com"));
		
		Reunion_2 reunion2 = new Reunion_2("Requeterico","Junta Directiva","1:00h",fechaHora);
		reunion2.agregarPersona(new Persona_2("Ferm",true,232323,".gmail.com"));
		reunion2.agregarPersona(new Persona_2("Alfred",true,24942323,"alfred.gmail.com"));

		agenda1.agregarReunion(reunion1);
		agenda1.agregarReunion(reunion2);
		
		String agend = agenda1.getNombre_usuario();
		Persona_2 person = reunion1.obtenerPersona(0);
		Persona_2 person2 = reunion2.obtenerPersona(0);
		
		System.out.println("Nombre de usuario: "+agend+" Reuniones: "+reunion1.getLugar()+"/"+reunion1.getTema()
		+"/"+reunion1.getDuracion()+"/"+reunion1.getFecha_hora());
		 System.out.println("Participantes:");
		 String aux;
	        for (Persona_2 persona : reunion1.getPersona())
	     //tipo de elemento, nombre donde se asigna cada valor : nombre del arr, en este caso la fn 
	        	//retorna el arr list
	        {
	        	if(persona.getAsistente()) {
	        		aux = "Es asistente";
	        	} else {
	        	    aux = "No es asistente";
	        	}
	            System.out.println("- " + persona.getNombre() + ", Contacto: " + persona.getTelefono()+", Correo: "+persona.getEmail()
	            +","+aux);
	        }
	        
	        System.out.println("Nombre de usuario: "+agend+" Reuniones: "+reunion2.getLugar()+"/"+reunion2.getTema()
			+"/"+reunion2.getDuracion()+"/"+reunion2.getFecha_hora());
	        	
		
	}
}
