package Congreso8;
import java.util.ArrayList;

public class Congreso {
    private String nombre;
    private ArrayList <Evaluador> evaluadores;
    private ArrayList <Trabajo> trabajos;

    public Congreso (String nombre){
        this.nombre = nombre;
        this.evaluadores = new ArrayList<>();
        this.trabajos = new ArrayList<>();
    }
    public void asignarEvaluador() {
        for (Trabajo trabajo : trabajos) {
            boolean asignado = false;
            for (Evaluador evaluador : evaluadores) {
                if (evaluador.puedeEvaluar(trabajo)) {
                    System.out.println(evaluador.getNombre() + " puede evaluar " + trabajo.getTipo()
                     + " con temas " + evaluador.getConocimientos());
                    asignado = true;
                }
            }
            if (!asignado) {
                System.out.println("No hay evaluadores disponibles para " + trabajo.getTipo()
                 + " con temas " + trabajo.getTemasArticulo());
            }
        }
    }

    /*public boolean buscarEvaluador(Trabajo trabajo, Evaluador ee){
        if (!trabajo.esPoster()) {
            for(int i=0; i<trabajo.getTemasTp().size(); i++){
                String tema = trabajo.getTemasTp().get(i);
                if (!ee.puedeEvaluar(tema)) {
                    return false;
                }
            }
        }
        else {
            for(int i=0; i<trabajo.getTemasTp().size(); i++){
                String tema = trabajo.getTemasTp().get(i);
                if (ee.puedeEvaluar(tema)) {
                    return true;
                }
            }
        }
        return false;
    }*/

    public void addTrabajos(Trabajo trab){
        this.trabajos.add(trab);
    }
    public void addEvaluadores(Evaluador eva){
        this.evaluadores.add(eva);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Evaluador> getEvaluadores() {
        return evaluadores;
    }


    public ArrayList<Trabajo> getTrabajos() {
        return trabajos;
    }


    
}
