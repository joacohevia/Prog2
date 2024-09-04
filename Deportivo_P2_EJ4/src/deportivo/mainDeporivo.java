package deportivo;

import java.time.LocalDateTime;

public class mainDeporivo {

	public static void main(String[] args) {
		
		LocalDateTime fechaHora = LocalDateTime.of(2024, 7, 30, 10, 15, 30);
		Usuario usuario1 = new Usuario("Joaquin");
        Futbol turn = new Futbol("Futbol", "Cancha1", usuario1, fechaHora);
        usuario1.agregarTurno(turn);
       
        Futbol turn2 = new Futbol("Futbol","Cancha2", usuario1, fechaHora);
        usuario1.agregarTurno(turn);
        
        Futbol turn3 = new Futbol("Futbol","Cancha2", usuario1, fechaHora);
        usuario1.agregarTurno(turn3);
        
        Futbol turn4 = new Futbol("Futbol","Cancha2", usuario1, fechaHora);
        usuario1.agregarTurno(turn4);
        
        Futbol turn5 = new Futbol("Futbol","Cancha2", usuario1, fechaHora);
        usuario1.agregarTurno(turn5);
        //llama primero a verificar socio porq ahi asigna el valor
        int num = usuario1.obtenerTurnos();
        boolean esSocio = usuario1.verficarSocio();
        double precio = turn.calcularPrecio();
        //----------------------------------------------------------------
        
        Usuario usuario2 = new Usuario("Alfred");
        Paddle turnP = new Paddle("Paddle","Cancha1",usuario2,fechaHora);
        usuario2.agregarTurno(turnP);
        usuario2.agregarTurno(turnP);
        
        int num2 = usuario2.obtenerTurnos();
        double precio2 = turnP.calcularPrecio();
        boolean esSocio2 = usuario1.verficarSocio();

        System.out.println("Cantidad turnos: "+num+" Precio: "+precio);
        System.out.println("Turnos: "+usuario1.getNombre()+" Es Socio: "+usuario1.EsSocio()+
        		" | Turno: "+usuario1.getNombre()+","+turn.getFechaHora()+","+turn.getTipoCancha()+","+turn.getIdCancha());
     
        
        System.out.println("Cantidad turnos: "+num2+" Precio: "+precio2);
        System.out.println("Turnos: "+usuario2.getNombre()+" Es Socio: "+usuario2.EsSocio()+
        		" | Turno: "+usuario2.getNombre()+","+turnP.getFechaHora()+","+turnP.getTipoCancha()+","+turnP.getIdCancha());
        
	}

}
