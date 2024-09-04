
import java.util.ArrayList;

public class Encuestador extends Persona {

    private ArrayList<Encuesta>encuestas;
    public static int id;
    
    
    public Encuestador(String nombre) {
        super(nombre);
        encuestas=new ArrayList<>();     
    }

    public void agregarEncuesta(Encuesta e1){
        encuestas.add(e1);
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

    public Encuesta encuestar(Encuestado e1, int cantPreg){//devuelvo una encuesta, a la que el encuestado debera responder
        boolean encuesta=false;
        for (int i=0;i<this.encuestas.size();i++){
            if(this.encuestas.get(i).yaFueEncuestado(e1)){
                encuesta=true;
            }            
        }
            if(!encuesta){
            id++;    //se hizo estatico la variable para que cada vez que se encueste, el id cambie y cada encuesta se 
               Encuesta nuevaencuesta= new Encuesta(this, e1,id );//se diferencie del resto.
               this.agregarEncuesta(nuevaencuesta);
               for(int i=0; i<cantPreg;i++){
                Pregunta p1=new Pregunta();
                p1.setPregunta("pregunta");
                nuevaencuesta.agregarPregunta(p1);
               }return nuevaencuesta;
            }
            else{System.out.println("ya fue encuestado");}
            return null;
    }


}
