package BusqDoc;

public class CondNoClave extends Condicion{

    @Override
    public boolean cumple(Documento doc) {
       return doc.tieneClave();
    }
    
}
