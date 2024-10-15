package TP7.ejercicio1;

public class FiltroOr extends Filtro {
    
    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    public boolean cumple(ProductoQuimico pq){
        return f1.cumple(pq) || f2.cumple(pq);
    }
}
