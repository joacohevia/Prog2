package Tp5.SistSelecionador;
import java.util.ArrayList;

public class Sist {
    private ArrayList <Casa> casas;
    

    public void asignarAlumCasa(Alumno alum, Casa cas) {
        if (cas.isFamiliar()) {
            // La casa requiere familiares
            boolean tieneFamiliar = false;
            for (Alumno a : cas.getAlumnos()) {
                if (alum.getFamiliares().contains(a.getNombre())) {
                    tieneFamiliar = true;
                    break;
                }
            }
    
            // Verifica si el alumno cumple con las habilidades requeridas y si hay lugar en la casa
            if (tieneFamiliar && cas.getHabilidadesAceptar().containsAll(alum.getHabilidades()) && cas.capacidadVal()) {
                cas.agregarAlumno(alum);
                alum.setCasaAsig(true);
                System.out.println(alum.getNombre() + " ha sido asignado a la casa " + cas.getNombre());
            } else {
                System.out.println(alum.getNombre() + "no no cumple con los requisitos para la casa " + cas.getNombre());
            }
        } else {
            // La casa no requiere familiares
            // Verifica si el alumno cumple con las habilidades requeridas y si hay lugar en la casa
            if (cas.getHabilidadesAceptar().containsAll(alum.getHabilidades()) && cas.capacidadVal()) {
                cas.agregarAlumno(alum);
                alum.setCasaAsig(true);
                System.out.println(alum.getNombre() + " ha sido asignado a la casa " + cas.getNombre());
            } else {
                System.out.println(alum.getNombre() + " no cumple con los requisitos para la casa " + cas.getNombre());
            }
        }
    }
   
     /*Aquí verificamos si el nombre de un alumno que ya está en la casa (a.getNombre())
                              está en la lista de familiares del alumno que queremos asignar.La función
                            alumno.getFamiliares() devuelve un ArrayList<String> que contiene los nombres de los 
                            familiares del alumno actual.El método contains() verifica si la lista de familiares
                             del alumno actual contiene el nombre del alumno que estamos revisando en la casa. */
    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }
    
    
}
