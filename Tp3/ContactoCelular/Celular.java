package Tp3.ContactoCelular;

import java.util.ArrayList;

public class Celular {
    private Agenda agenda;
    private String modelCelu;

    public Celular(String modelCelu, Agenda agenda) {
        this.modelCelu = modelCelu;
        this.agenda = agenda;
    }
    public ArrayList<Contacto> listRepetidos(){
        return agenda.listRepetidos();
    }
    public ArrayList<Contacto> listado(){
        return agenda.listado();
    }
    public ArrayList<Contacto> listNumRep(){
        return agenda.getContacNumRep();
    }
    public double promEdad(){
        return agenda.promEdad();
    }

    public String getModelCelu() {
        return modelCelu;
    }
    public void setModelCelu(String modelCelu) {
        this.modelCelu = modelCelu;
    }

    
}
