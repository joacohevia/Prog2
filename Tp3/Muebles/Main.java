package Tp3.Muebles;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica1 = new Fabrica("Pepito");

        Producto p1 = new Producto("Silla", "15kg", 3000, "Algarrobo", "Marron");
        Producto p2 = new Producto("Mesa", "15kg", 8000, "Algarrobo", "Marron");
        Producto p3 = new Producto("Mesa", "15kg", 8000, "Algarrobo", "Marron");

        fabrica1.agregarProduc(p1);
        fabrica1.agregarProduc(p2);
        fabrica1.agregarProduc(p3);

        System.out.println(p2);
        System.out.println("Ventas total: "+fabrica1.ventaTotal()+" Costo total: "+fabrica1.costoTotal()+"  Prom del costo: "+fabrica1.promCostoTotal());
    }
}
