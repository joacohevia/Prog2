package Tp3.JuegoPersonajes;

public class Personaje {
    private String nombreReal;
    private String nombreSuper;
    private int visionNocturna;
    private int velocidad;
    private int fuerza;
    private int edad;
    private double altura;
    private double peso;
    
    public Personaje(String nombreReal, String nombreSuper, int visionNocturna, int velocidad, int fuerza, int edad,
            double altura, double peso) {
        this.nombreReal = nombreReal;
        this.nombreSuper = nombreSuper;
        this.visionNocturna = visionNocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    
    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }
    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }
    public void setVisionNocturna(int visionNocturna) {
        this.visionNocturna = visionNocturna;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNombreReal() {
        return nombreReal;
    }
    public String getNombreSuper() {
        return nombreSuper;
    }
    public int getVisionNocturna() {
        return visionNocturna;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public int getFuerza() {
        return fuerza;
    }
    public int getEdad() {
        return edad;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
}
