package Tp5.Jardin;

public class Cliente {
	
	private String nombre;
	private String ciudad;
	private int idCliente;
	private static int contadorCliente = 0;
	
	public Cliente(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		Cliente.incrementarContador();
		this.idCliente = Cliente.contadorCliente;
	}
	@Override
	public String toString() {
		return this.getNombre() + " id: " + this.getIdCliente() + " de " + Cliente.getContadorCliente();
	}
	
	public static int getContadorCliente() {
		return contadorCliente;
	}
	
	public static void incrementarContador() {
		//this.getNombre(); No puedo invocar desde un metodo static uno no static
		//this.nombre; No puedo acceder a un atributo no static desde un metodo static
		contadorCliente++;
	}
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	

	
	

}
