package sistEncuesta;
import java.util.ArrayList;

import elementos.Persona;
public class Empleado extends Persona {
	private int id;
	private boolean encuesta;
    private ArrayList<Encuesta>encuestas;

	
	public Empleado(String nombre, String apellido,int id) {
		super(nombre, apellido);
		this.setId(id);
        encuestas=new ArrayList<>();     

	}
	//el sistema solicita al encuestador cuantas encuestas realizo, si el encuestador tiene todas las encuestas respondidas,
    //el debe saber entregar ese resultado..pero que una encuesta este realizada es responsabilidad de la encuesta. 
	 public int cantidadEncuestasRealizadas(){
	        int cantidad=0;
	        for (int i=0; i<encuestas.size();i++){//recorro las encuestas y en cada una corroboro que haya sido respondida
	            if(encuestas.get(i).encuestaRespondida()){
	                cantidad++;
	            }

	        }return cantidad;
	    }

	
	public Encuesta encuestar(Usuario e1, int cantPreg){//devuelvo una encuesta, a la que el encuestado debera responder
        boolean encuesta=false;
        for (int i=0;i<this.encuestas.size();i++){
            if(this.encuestas.get(i).yaFueEncuestado(e1)){
                encuesta=true;
            }            
        }
		return null;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isPlus() {
		return encuesta;
	}


	public void setPlus(boolean plus) {
		this.encuesta = plus;
	}
	
	
}
