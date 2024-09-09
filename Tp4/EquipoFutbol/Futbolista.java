package Tp4.EquipoFutbol;

import java.time.LocalDate;

public class Futbolista extends CuerpoTec {
    private String posicion;
    private boolean esZurdo;
    private int cantGol;
    
    
    public Futbolista(String nombre, String apellido, String numPasarporte, LocalDate fechaNac, String posicion,
            boolean esZurdo, int cantGol, String estado) {
        super(nombre, apellido, numPasarporte, fechaNac,estado);
        this.posicion = posicion;
        this.esZurdo = esZurdo;
        this.cantGol = cantGol;
    }
   

    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public boolean isEsZurdo() {
        return esZurdo;
    }
    public void setEsZurdo(boolean esZurdo) {
        this.esZurdo = esZurdo;
    }
    public int getCantGol() {
        return cantGol;
    }
    public void setCantGol(int cantGol) {
        this.cantGol = cantGol;
    }


    @Override
    public String toString() {
        return "Futbolista posicion " + getPosicion() + ", esZurdo " + isEsZurdo() + ", cantGol " + getCantGol() + ", Nombre "
                + getNombre()+ ", Apellido " + getApellido()+ ", NumPasarporte " + getNumPasarporte() + " Estado "+getEstado();
    }


   
    
    

    

}
