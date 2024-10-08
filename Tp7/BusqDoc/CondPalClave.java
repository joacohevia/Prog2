package BusqDoc;

public class CondPalClave extends Condicion{
    private String buscado;

    public CondPalClave(String bus){
        this.buscado=bus;
    }
    public boolean cumple(Documento doc){
        return doc.tienePalClave(buscado);
    }
}
