package BusqDoc;

public class CondAnd extends Condicion{
    Condicion c1;
    Condicion c2;

    public CondAnd (Condicion cc1,Condicion cc2){
        this.c1 = cc1;
        this.c2 = cc2;
    }
    public boolean cumple(Documento doc){
        return c1.cumple(doc) && c2.cumple(doc);
    }
}
