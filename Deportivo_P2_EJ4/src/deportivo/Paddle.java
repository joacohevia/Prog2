package deportivo;

import java.time.LocalDateTime;

public class Paddle extends Turno{

	public Paddle(String tipoCancha, String idCancha, Usuario usuario,LocalDateTime fechaHor) {
		super("Paddle", idCancha, usuario,fechaHor);
	}

}
