package Tp3.Muebles;

public class Producto {
    private String peso;
    private double costo;
    private double venta;
    private String tipoMadera;
    private String tipoMueble;
    private String color;

    private double costoFabricacion=1.35;

    public Producto(String tipoMueble,String peso, double costo, String tipoMadera, String color) {
        this.peso = peso;
        this.costo = costo;
        this.setVenta(costo);
        this.tipoMadera = tipoMadera;
        this.tipoMueble = tipoMueble;
        this.color = color;
    }
    public void setVenta(double costo) {
        this.venta = costo * this.costoFabricacion;
    }

    @Override
    public String toString() {
        return "Producto [peso=" + peso + ", costo=" + costo + ", venta=" + venta + ", tipoMadera=" + tipoMadera
                + ", tipoMueble=" + tipoMueble + ", color=" + color + ", costoFabricacion=" + costoFabricacion + "]";
    }
    public String getPeso() {
        return peso;
    }
    public double getCosto() {
        return costo;
    }
    public double getVenta() {
        return venta;
    }
    public String getTipoMadera() {
        return tipoMadera;
    }
    public String getTipoMueble() {
        return tipoMueble;
    }
    public String getColor() {
        return color;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
  
    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }
    public void setTipoMueble(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
