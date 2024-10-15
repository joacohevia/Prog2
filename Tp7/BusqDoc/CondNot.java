package BusqDoc;

public class CondNot extends Condicion{
    Condicion c1;
    public CondNot(Condicion cc){
        c1 = cc;
    }
    @Override
    public boolean cumple(Documento doc) {
        return !c1.cumple(doc);
    }
    
}
