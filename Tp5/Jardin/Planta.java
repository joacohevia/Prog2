package Tp5.Jardin;

import java.time.LocalDate;

public class Planta extends Jardin{
    private String nombreCient;
    private String nombreComun;
    private String paisOrigen;
    private LocalDate compra;
    private int idPlanta;
    private static int idCont = 0;

    
    public Planta(String jardin,String nombreCient, String nombreComun, String paisOrigen, LocalDate compra) {
        super(jardin);
        this.nombreCient = nombreCient;
        this.nombreComun = nombreComun;
        this.paisOrigen = paisOrigen;
        this.compra = compra;
        Planta.incrementarId();
        this.idPlanta = Planta.idCont;
    }
    public String toString() {
        return "nombre cien: "+this.nombreCient+" id: "+this.getIdPlanta()+" de "+Planta.getContador();
    }
    public static int getContador(){
        return idCont;
    }
    public static void incrementarId(){
        idCont++;
    }
    
    public int getIdPlanta() {
        return idPlanta;
    }
    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }
    public static int getIdCont() {
        return idCont;
    }

    public static void setIdCont(int idCont) {
        Planta.idCont = idCont;
    }

    
    public String getNombreCient() {
        return nombreCient;
    }
    public void setNombreCient(String nombreCient) {
        this.nombreCient = nombreCient;
    }
    public String getNombreComun() {
        return nombreComun;
    }
    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public LocalDate getCompra() {
        return compra;
    }
    public void setCompra(LocalDate compra) {
        this.compra = compra;
    }

    
}
