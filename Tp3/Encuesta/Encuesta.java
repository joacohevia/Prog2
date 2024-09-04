

import java.util.ArrayList;

public class Encuesta {
    
    private ArrayList<Pregunta>preguntas;
    private ArrayList<Respuesta>respuestas;
    private Encuestador encuestador;
    private Encuestado encuestado;
    private int id;//id deberia ser una variable de clase. para que por cada instancia de encuesta, sea de distinto valor
    private String estado;
    private int dni;

    //cuando se instancie una encuesta es porque a una encuesta se le asigno una persona, luego se debera responder la encuesta
    public Encuesta(Encuestador encuestador, Encuestado encuestado, int id){
        preguntas=new ArrayList<>();
        respuestas=new ArrayList<>();
        this.encuestador=encuestador;
        this.encuestado=encuestado;
        this.estado="sin responder";
        this.dni=encuestado.getDni();
        this.id=id;

        
    }
    //como una encuesta se compone de preguntas. la encuesta es la que las agrega
    public void agregarPregunta(Pregunta p1){
        preguntas.add(p1);
    }//lo mismo con las respuestas
    public void agregarRespuesta(Respuesta r1){
        respuestas.add(r1);
    }
  //saber si la encuesta fue realizada en este caso es responsabilidad de la encuesta, comparo las 2 distancias de los "formularios"
  public boolean encuestaRespondida(){
    return preguntas.size()==respuestas.size()&&preguntas.size()>0&&estado=="completada";
}

    public void responderEncuesta(){
        for(int i=0;i<preguntas.size();i++){
            Respuesta r1= new Respuesta();
            r1.setRespuesta("respuesta");
            this.agregarRespuesta(r1);
        }
        this.setEstado("completada");
    }
    public boolean yaFueEncuestado(Encuestado e1){
        if(e1.getDni()==this.getDni()){
            return true;
        }else{return false;}
    }
    
  

    public String toString(){
        return "ENCUESTA N°:"+this.getId()+" Nombre encuestado: "+this.encuestado.getNombre()+" DNI: "+this.getDni()+" Estado: "+this.getEstado()+"ID:"+this.getId();
    }

   
    public int getId(){
        return id;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDni() {
        return dni;
    }
    
    public Encuestador getEncuestador() {
        return encuestador;
    }
    public Encuestado getEncuestado() {
        return encuestado;
    }
    
   

}
