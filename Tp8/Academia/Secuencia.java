package Academia;

import java.util.ArrayList;

public class Secuencia extends Evaluacion{
    private String especialidad;
    private ArrayList <Evaluacion> subUnidad;

    public Secuencia(String espe){
        this.especialidad = espe;
        this.subUnidad = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "Optativa [especialidad=" + especialidad + ", subUnidadOpt=" + subUnidad + ", puntajeFinal= " + puntaje()
                + ", tiempoFinal= " + tiempo() + "]";
    }
    public void addConceptos(Evaluacion ee){
        subUnidad.add(ee);
    }

    @Override
    public int puntaje() {
        int total = 0;
        for (Evaluacion ev : subUnidad) {
            total += ev.puntaje();
        }
        return total;
    }

    @Override
    public int tiempo() {
        int totalTiempo =0;
        for (Evaluacion ev : subUnidad) {
            totalTiempo += ev.tiempo();
        }
        return totalTiempo;
    }

    @Override
    public ArrayList<String> getConceptos() {
       ArrayList <String> aux = new ArrayList<>();
       for (Evaluacion ss : subUnidad) {
        aux.addAll(ss.getConceptos());
       }
       return aux;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
