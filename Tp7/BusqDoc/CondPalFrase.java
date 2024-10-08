package BusqDoc;

public class CondPalFrase extends Condicion{
    private String buscado;

    public CondPalFrase(String buscado){
        this.buscado = buscado;
    }
    @Override
    public boolean cumple(Documento doc) {
       return doc.getTitulo().toLowerCase().contains(buscado);
    }
    
}
