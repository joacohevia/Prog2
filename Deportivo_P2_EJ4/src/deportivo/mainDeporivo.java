package deportivo;

import java.time.LocalDateTime;

public class mainDeporivo {

	public static void main(String[] args) {
		LocalDateTime fechaHora = LocalDateTime.of(2010, 8, 18, 10, 15, 30);
		Usuario usuario1 = new Usuario("Joaquin");
        Futbol turn = new Futbol("Futbol", "Cancha1", usuario1, fechaHora);
        System.out.println("Turnos: "+turn.calcularPrecio()+","+turn.getIdCancha()+","+usuario1.getNombre()+
        		","+turn.getTipoCancha()+","+usuario1.verficarSocio());
		
	}

}
