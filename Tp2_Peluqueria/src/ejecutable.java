import java.time.LocalDateTime;
import java.util.List;

public class ejecutable {

	public static void main(String[] args) {
		Peluqueria centroPelu = new Peluqueria("SusanUnicex",LocalDateTime.of(2000,1,1,9,00),LocalDateTime.of(2030,1,1,20,00));

		Cliente cliente1 = new Cliente("Joaquin","Hevia");
		Cliente cliente2 = new Cliente("Rama", "Heredia");
		
		Peluquero peluquero1 = new Peluquero("Dani","Barber",1);
		Peluquero peluquero2 = new Peluquero("Lucas","Barber2",2);
		
		centroPelu.agregarCLiente(cliente1);
		centroPelu.agregarPeluquero(peluquero1);
		
		LocalDateTime fechaIni = LocalDateTime.of(2024, 7, 25, 12, 00);
		LocalDateTime fechaFin = LocalDateTime.of(2024, 7, 25, 13, 00);
		/*esta es una manera
		Turno turno1 = new Turno(fechaIni,fechaFin,6000,cliente1,peluquero1);
		centroPelu.agregarTurno(turno1);*/
		//esta es otra que es mejor
		boolean aux = centroPelu.agregarTurno(LocalDateTime.of(2024, 7, 25, 12, 00),LocalDateTime.of(2024, 7, 25, 13, 00),7000,cliente1,peluquero1);
		
		boolean aux1 = centroPelu.agregarTurno(LocalDateTime.of(2024, 7, 25, 12, 00),LocalDateTime.of(2024, 7, 25, 13, 00),7000,cliente2,peluquero1);

		System.out.println(centroPelu.getNombre());
		if(aux) {
			System.out.println("Turno reservado");
			 List<Persona> copiaPeluqueros = centroPelu.getPeluqueros();
		        for (Persona p : copiaPeluqueros) {
		            System.out.println(p); 
		        }

		        List<Persona> copiaClientes = centroPelu.getClientes();
		        for (Persona c : copiaClientes) {
		            System.out.println(c);
		        }

		        List<Turno> copiaTurnos = centroPelu.getTurnos();
		        for (Turno t : copiaTurnos) {
		            System.out.println(t);
		        }
		}else {
			System.out.println("Turno no disponible");
		}
		
		
	}

}
