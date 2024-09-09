package Tp4.EquipoFutbol;

import java.time.LocalDate;

public class CuerpoTec extends Persona {
    private String estado;
    protected static final String VIAJANDO = "Viajando";
    protected static final String CONCENTRACION = "En concentracion";
    protected static final String ORIGEN = "En pais de origen";

    public CuerpoTec(String nombre,String apellido, String numPasa,LocalDate fechaNac){
        super(nombre, apellido, numPasa, fechaNac);
        
    }
    public CuerpoTec(String nombre,String apellido, String numPasa,LocalDate fechaNac,String estadoo){
        super(nombre, apellido, numPasa, fechaNac);
        this.setEstado(estadoo);
        
    }
    public void disponible(){
        if (this.estado.equals(VIAJANDO)) {
            System.out.println("No disponible esta: "+VIAJANDO);
        }else if (this.estado.equals(CONCENTRACION)) {
            System.out.println("No disponible esta: "+CONCENTRACION);
        }else{
            System.out.println("Disponible esta: "+ORIGEN);
        }
    }
    public void setEstado(String estadoo) {
        if (estadoo.equals(VIAJANDO)||estadoo.equals(ORIGEN)||estadoo.equals(CONCENTRACION)) {
            this.estado = estadoo;
        }else{
            System.out.println("CAMPO INCORRECTO INTENTE CON : "+ORIGEN+", "+VIAJANDO+", "+CONCENTRACION);
        }
    }
    public String getEstado() {
        return estado;
    }
}
