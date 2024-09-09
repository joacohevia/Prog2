package Tp4.EquipoFutbol;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String numPasarporte;
    private LocalDate fechaNac;

    
    public Persona(String nombre, String apellido, String numPasarporte, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numPasarporte = numPasarporte;
        this.fechaNac = fechaNac;
    }
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNumPasarporte() {
        return numPasarporte;
    }
    public void setNumPasarporte(String numPasarporte) {
        this.numPasarporte = numPasarporte;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

  

    
}
