package Correo;

public class Carta extends ElementoEnvio{
    protected String direccion;
    protected String ciudad;
    protected boolean retiraDomicilio;
    protected int id;
    protected double peso;
    protected String remitente;

    public Carta(String direccion, String ciudad, boolean retiraDomicilio, int id, double peso, String remitente) {
        this.direccion = direccion;
        setCiudad(ciudad);
        this.retiraDomicilio = retiraDomicilio;
        this.id = id;
        this.peso = peso;
        this.remitente = remitente;
    }

    @Override
    public String toString() {
        return "Carta [direccion=" + direccion + ", ciudad=" + ciudad + ", retiraDomicilio=" + retiraDomicilio + ", id="
                + id + ", peso=" + peso + ", remitente=" + remitente + "]";
    }

    @Override
    public double obtenerPeso() {
       return getPeso();
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toUpperCase();
    }

    public boolean isRetiraDomicilio() {
        return retiraDomicilio;
    }

    public void setRetiraDomicilio(boolean retiraDomicilio) {
        this.retiraDomicilio = retiraDomicilio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    
}
