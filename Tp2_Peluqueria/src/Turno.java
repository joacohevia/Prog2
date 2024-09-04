import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Turno {
	private LocalDateTime horaIni;
	private LocalDateTime horaFin;
	private double precio;
	private Cliente cliente;
	private Peluquero peluquero;
	
	public Turno(LocalDateTime horaIni, LocalDateTime horaFin, double precio, Cliente cliente, Peluquero peluquero) {
		this.horaIni = horaIni;
		this.horaFin = horaFin;
		this.precio = precio;
		this.cliente = cliente;
		this.peluquero = peluquero;
	}

	public boolean turnoDisponible(LocalDateTime fechaIni, LocalDateTime fechaFin) {
		if (fechaIni.isAfter(this.horaFin) || fechaFin.isBefore(this.horaIni)) {
		    // El nuevo turno comienza después de que el turno existente ha terminado.
			// El nuevo turno termina antes de que el turno existente haya comenzado.
		    return true;
		} else {
		    // Hay solapamiento, el turno no está disponible
		    return false;
		}
	}

	
	
	//es socio-->Metodo, Calcular precio->Metodo
	public LocalDateTime getHoraIni() {
		return horaIni;
	}
	public void setHoraIni(LocalDateTime horaIni) {
		this.horaIni = horaIni;
	}
	public LocalDateTime getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(LocalDateTime horaFin) {
		this.horaFin = horaFin;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Peluquero getPeluquero() {
		return peluquero;
	}
	public void setPeluquero(Peluquero peluquero) {
		this.peluquero = peluquero;
	}
	public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Turno para " + cliente + " con " + peluquero + " el " + horaIni.format(formatter) + " por $" + precio;
    }
	
	
}
