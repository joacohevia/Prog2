package sistEncuesta;
import java.util.ArrayList;

public class Compania {
	private String entidad;
	private String tema;
	private ArrayList <Encuesta> encuestas;
	private ArrayList <Empleado> empleados;
	
	public Compania (String entidad,String tema) {
		this.setEntidad(entidad);
		this.tema = tema;
		this.encuestas = new ArrayList<>();
		this.empleados = new ArrayList<>();

	}
	
	
	public boolean existeDni(Usuario usuario) {
		for(int i=0; i<encuestas.size(); i++) {
			if(encuestas.get(i).buscarDni(usuario)) {
				return true;
			}
		}
		return false;
	}
	
	public void agregarEncuesta(Encuesta encuesta,Usuario usuario,Empleado emple) {
		if(!existeDni(usuario)) {//no exista dni usuario, y si existe ya respondio es true.El id de empleado
			this.encuestas.add(encuesta);
		}else {
			encuesta.setRespondido(true);
		}
	}
	public void agregarEmpleado(Empleado emple) {
		this.empleados.add(emple);
	}
	
	
	
	
	
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public ArrayList<Encuesta> getEncuestas() {
		return encuestas;
	}
	public void setEncuestas(ArrayList<Encuesta> encuestas) {
		this.encuestas = encuestas;
	}
	
	
}
