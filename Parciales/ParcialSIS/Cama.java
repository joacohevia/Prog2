package ParcialSIS;

import java.util.ArrayList;

import ParcialSIS.Condiciones.Condicion;

public class Cama extends Elemento{
    private ArrayList <String> equipamiento;
    private Paciente paciente;
    private Condicion condicion;
    
    public Cama(Paciente pp, Condicion cc) {
        this.paciente = pp;
        this.condicion = cc;
        this.equipamiento = new ArrayList<>();
    }
    public Cama(Condicion cc) {
        this(null, cc);
        
    }

    public void addEquipamiento(String equipo) {
        if (!equipamiento.contains(equipo.toLowerCase())) {
            equipamiento.add(equipo.toLowerCase());
        }
    }
 
    public void setPaciente(Paciente pp) {
        if (this.paciente == null && puedeOcupar(pp)) {
            this.paciente = pp;  // Asignamos al paciente si cumple la condición
        }
    }
// Método para verificar si la cama puede aceptar al paciente
    public boolean puedeOcupar(Paciente pp) {
    return condicion.cumple(pp); // La condición decide si el paciente puede ocupar la cama
    }

    @Override
    public int getCantidadCamas() {
        return 1;
    }
    @Override
    public ArrayList<Elemento> getCamDisponibles(Paciente pp) {
       ArrayList <Elemento> camasDisp = new ArrayList<>();
       if (!estaOcupada() && puedeOcupar(pp)) {
            camasDisp.add(this);
       }
       return camasDisp;
    }
    @Override
    public Elemento getCopia(Condicion cc) {
       if (estaOcupada() && condicion.cumple(paciente)) {
            return new Cama(this.getPaciente(), this.getCondicion());
       }
       return null;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    public boolean estaOcupada(){
        return this.getPaciente() != null;
    }
  
    public ArrayList<String> getEquipamiento() {
        return equipamiento;
    }
    public Condicion getCondicion() {
        return condicion;
    }
    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }
}
