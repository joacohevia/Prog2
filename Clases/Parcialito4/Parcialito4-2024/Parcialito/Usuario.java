package Parcialito;

import java.time.LocalDate;
import java.util.ArrayList;

import Parcialito.Preferencias.Preferencia;

public class Usuario {
    private String nombre;
    private LocalDate nacimiento;
    private ArrayList<Preferencia> preferencias;
    
    public Usuario(String nombre, LocalDate nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public ArrayList<Preferencia> getPreferencias(){
        ArrayList<Preferencia> salida = new ArrayList<>();
        salida.addAll(preferencias);
        return salida;
    }

    public void addPreferencia(Preferencia pf){
        this.preferencias.add(pf);
    }

    // Con que al menos una preferencia cumpla ya alcanza.
    public boolean leGustaLaCancion(Cancion cc){
        boolean encontroUnaPreferencia = false;
        for (Preferencia preferencia : preferencias) {
            if(preferencia.cumple(cc)){
                encontroUnaPreferencia = true;
            }
        }
        return encontroUnaPreferencia;
    }
}