import java.util.ArrayList;

public class Comite {
    private ArrayList<Trabajo> trabajos;
    private ArrayList<String> temasEspecificos;
    private ArrayList<Evaluador> evaluadores;

    public Comite() {
        this.trabajos = new ArrayList<Trabajo>();
        this.temasEspecificos = new ArrayList<String>();
        this.evaluadores = new ArrayList<Evaluador>();
    }

    public ArrayList<String> getTemasEspecificos() {
        return new ArrayList<String>(temasEspecificos);
    }
    
    // buscarTrabajos(Evaluador);

    public ArrayList<Evaluador> buscarCandidatos(Trabajo trabajo) {

        ArrayList<Evaluador> candidatos = new ArrayList<Evaluador>();
        for (int i = 0; i < this.evaluadores.size(); i++) {
            if (this.evaluadores.get(i).puedeEvaluar(trabajo)) {
                candidatos.add(this.evaluadores.get(i));
            }

        }
        return candidatos;
    }

    // no queda claro como se selecciona el evaluador. puesto que muchos candidatos
    // pueden evaluar un mismo trabajo
    
    public void asignarTrabajo(Evaluador candidato, Trabajo trabajo) {
        if (trabajo.getEvaludorAsignado() == null) {
            candidato.addTrabajo(trabajo);
            trabajo.setEvaludorAsignado(candidato);
        }
    }

    public ArrayList<Trabajo> getTrabajos(Evaluador evaluador){
        return evaluador.trabajosEvaluados();
    }

}