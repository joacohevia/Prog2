package BusqDoc;

public class CondContenido extends Condicion{
    private int cantidad;

    public CondContenido(int cantidad){
        this.cantidad = cantidad;
    }
    public boolean cumple(Documento doc){
        return doc.CantidadPalContenido(cantidad);
    }
}
