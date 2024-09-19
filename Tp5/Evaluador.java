import java.util.ArrayList;

public class Evaluador {
    private Comite comite;
    private ArrayList<String> temasDeConocimiento;
    private ArrayList<Trabajo> trabajos;
    private String nombre;

    public Evaluador(String nombre) {
        setNombre(nombre);
        this.temasDeConocimiento = new ArrayList<String>();
        this.trabajos = new ArrayList<Trabajo>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // equals nombre y temas

    public boolean esExperto() {

        ArrayList<String> temasEspecificos = comite.getTemasEspecificos();
        // si conozco al menos un tema especifico soy experto

        for (int i = 0; i < temasEspecificos.size(); i++) {
            if (this.temasDeConocimiento.contains(temasEspecificos.get(i))) {
                return true;
            }
        }
        return false;

    }

    public int cantTrabajosTomados() {
        return this.trabajos.size();
    }

    public ArrayList<Trabajo> trabajosEvaluados() {
        return new ArrayList<Trabajo>(trabajos);
    }

    public void addTrabajo(Trabajo trabajo) {
        if (!this.trabajos.contains(trabajo)) {
            this.trabajos.add(trabajo);
        }
    }

    // puedoEvaluar
    /*
     * Para determinar si un evaluador es apto para evaluar un trabajo, éste
     * debe haber declarado conocimiento en todos los temas del trabajo,
     * especificados en sus
     * palabras claves.
    */

    public boolean puedeEvaluar(Trabajo trabajo){
        ArrayList<String> temasDelTrabajo = trabajo.getTemas();
        if(trabajo.esPoster()){
            for(int i=0; i<temasDelTrabajo.size();i++){
                if(this.temasDeConocimiento.contains(temasDelTrabajo.get(i))){
                    return true;
                }
            }return false;

        }else{
            int i=0;
            while(this.temasDeConocimiento.contains(temasDelTrabajo.get(i))){
                i++;
            }
            return i>= temasDelTrabajo.size();
        }
    }

}
