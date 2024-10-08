package Academia;

import java.util.ArrayList;

public class Optativa extends Evaluacion{
    private String especialidad;
    private ArrayList <Evaluacion> subUnidadOpt;

    public Optativa(String espe){
        this.especialidad = espe;
        this.subUnidadOpt = new ArrayList<>();
    }
    public void addConceptos(Evaluacion ee){
        subUnidadOpt.add(ee);
    }

    @Override
    public int puntaje() {
        int totalMax = 0;
        for (Evaluacion ev : subUnidadOpt) {
            if (ev.puntaje()>totalMax) {
                totalMax = ev.puntaje();
            }
        }
        return totalMax;
    }

    @Override
    public int tiempo() {
        int totalMax = 0;
        for (Evaluacion ev : subUnidadOpt) {
            if (ev.tiempo()>totalMax) {
                totalMax = ev.tiempo();
            }
        }
        return totalMax;
    }

    @Override
    public ArrayList<String> getConceptos() {
       ArrayList <String> aux = new ArrayList<>();
       for (Evaluacion ss : subUnidadOpt) {
            for (String concepto : ss.getConceptos()) {
                if (!aux.contains(concepto)){
                    aux.add(concepto);
                }
            }
       }
       return aux;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public String toString() {
        return "Optativa [especialidad=" + especialidad + ", subUnidadOpt=" + subUnidadOpt + ", puntajeFinal= " + puntaje()
                + ", tiempoFinal= " + tiempo() + "]";
    }
    
    
}
