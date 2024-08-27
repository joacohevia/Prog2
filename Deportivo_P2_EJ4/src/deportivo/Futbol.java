package deportivo;

import java.time.LocalDateTime;

public class Futbol extends Turno{

	public Futbol(String tipoCancha, String idCancha, Usuario usuario,LocalDateTime fechaHor) {
		super("Futbol", idCancha, usuario,fechaHor);
		
	}

}
