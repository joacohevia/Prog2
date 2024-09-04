package Tp3.Muebles;

import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList<Producto> productos;

    public Fabrica(String nombre){
        this.setNombre(nombre);
        this.productos = new ArrayList<>();
    }
    public double promCostoTotal(){
        double prom=0;
        int cant = productos.size();
        for (Producto producto : productos) {
            prom += producto.getCosto();
        }
        if (cant>0) {
            double total = (double) prom/cant;
            return total;
        }
        return 0;
    }
    public double costoTotal(){
        double total=0;
        for (Producto producto : productos) {
            total += producto.getCosto();
        }
        if (total>0) {
            return total;
        }
        return 0;
    }
    public double ventaTotal(){
        double total=0;
        for (Producto producto : productos) {
            total += producto.getVenta();
        }
        if (total>0) {
            return total;
        }
        return 0;
    } 

    public void agregarProduc(Producto produc){
        this.productos.add(produc);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
   
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
