package Tp4.EquipoFutbol;

import java.time.LocalDate;

public class Entrenador extends CuerpoTec {
    private String idFederacion;

    public Entrenador(String nombre, String apellido, String numPasa, LocalDate fechaNac, String idFederacion, String estado) {
        super(nombre, apellido, numPasa, fechaNac, estado);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    @Override
    public String toString() {
        return "Entrenador idFed: " + getIdFederacion() + ", nombre: " + getNombre()
                + ", Apellido: " + getApellido() + ", numPasaporte: " + getNumPasarporte() + ", FechaNac: "
                + getFechaNac() + ", Estado: " + getEstado();
    }
    
    
}
