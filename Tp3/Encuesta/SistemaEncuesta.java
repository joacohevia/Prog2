package Tp3.Encuesta;


import java.util.ArrayList;

public class SistemaEncuesta{
    //el sistema va a tener todas las Encuestas, va a tener a todos sus encuestadores
    private String empresa;
    private ArrayList<Encuesta>encuestas;
    private ArrayList<Persona>encuestadores;
    //cuando se instancie, se crean los lugares para agregar las encuestas realizadas, y los lugares para los encuestadores que hayan.
    public SistemaEncuesta(String empresa){
        this.empresa=empresa;
        encuestas=new ArrayList<>();//no vale la pena que este aca??
        encuestadores=new ArrayList<>();
    }

    public int cantidadEncuestasRealizadas(Encuestador e1){
        return e1.cantidadEncuestasRealizadas();
    }
    
    public void agregarEncuesta(Encuesta e){
        encuestas.add(e);
    }

    public void agregarEncuestador(Encuestador e){
        encuestadores.add(e);
    }
    
    public String getEmpresa() {//no voy a necesitar el set por ahora.
        return empresa;
    }

    public static void main(String[] args) {
        //se instancia el sistema de encuestas
        SistemaEncuesta encuestadora=new SistemaEncuesta("instax");
        //se instancian los encuestadores
        Encuestador encuestador1= new Encuestador("Patricio");
        Encuestador encuestador2= new Encuestador("Susana");
        //se instancian los encuestados
        Encuestado encuestado1= new Encuestado(11223344, "Claudio");
        Encuestado encuestado2= new Encuestado(55667788, "Veronica");
        //agregar los encuestadores al sistema
        encuestadora.agregarEncuestador(encuestador1);
        encuestadora.agregarEncuestador(encuestador2);
        //se hacen las encuestas. pero el estado es "incompleto", ya que el encuestado debe responderlas
        Encuesta encuesta1=encuestador1.encuestar(encuestado1,5);
        Encuesta encuesta2=encuestador1.encuestar(encuestado2,5);
        Encuesta encuesta3=encuestador2.encuestar(encuestado1,5);//por defecto y a modo de prueba se instanciaron 5 preguntas.
        Encuesta encuesta4=encuestador2.encuestar(encuestado2,5);
        //imprime el numero de encuestas realizadas, como no fueron respondidas se imprime "0".
        System.out.println("encuestador 1 hizo Encuestas="+encuestador1.cantidadEncuestasRealizadas());
        System.out.println("encuestador 2 hizo Encuestas="+encuestador2.cantidadEncuestasRealizadas());
        System.out.println("-----------------------------------------------------------------------");
        //tomo como referencia la encuesta 1 e imprimo su estado.
         System.out.println("encuesta1 fue respondida:"+encuesta1.encuestaRespondida()
                            +" /estado: "+encuesta1.getEstado()+
                            " /encuestado: "+encuesta1.getEncuestado().getNombre());
        System.out.println("-----------------------------------------------------------------------");
        //se pasa a responder las encuestas
        encuestado1.responderEncuesta(encuesta1);
        encuestado2.responderEncuesta(encuesta2);
        encuestado1.responderEncuesta(encuesta3);
        encuestado2.responderEncuesta(encuesta4);
        //se aregan las encuestas al sistema
        encuestadora.agregarEncuesta(encuesta1);
        encuestadora.agregarEncuesta(encuesta2);
        encuestadora.agregarEncuesta(encuesta3);
        encuestadora.agregarEncuesta(encuesta4);

        System.out.println("encuestador 1 hizo "+encuestador1.cantidadEncuestasRealizadas()+" encuestas");
        System.out.println("encuestador 2 hizo "+encuestador2.cantidadEncuestasRealizadas()+" encuestas");

        //vuelvo a imprir el estado de encuesta 1 luego de ser respondida
        System.out.println("encuesta1 fue respondida:"+encuesta1.encuestaRespondida()
                            +" /estado: "+encuesta1.getEstado()+
                            " /encuestado: "+encuesta1.getEncuestado().getNombre());
    
        //intento agregar a la encuesta a una persona ya encuestada para ver si se detecta que la persona fue encuestada
        System.out.println("-----------------------------------------------------------------------");
        encuestador1.encuestar(encuestado1, 5);//se imprime por pantalla que ya fue encuestado
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(encuesta1);
        System.out.println(encuesta2);
        System.out.println(encuesta3);
        System.out.println(encuesta4);

        
    }


    

}