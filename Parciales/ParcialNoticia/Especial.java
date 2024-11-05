package ParcialNoticia;
import java.util.ArrayList;
import java.util.Collections;

public class Especial extends Categoria{
    private String categ = "ultimo momento";
    private int cantidad;

    public Especial(int cant) {
        super();
        this.cantidad = cant;
    }
    
    public String getCategoria(){
        return categ;
    }
    public ArrayList <String> getPalClave(){
        ArrayList <String> resp = new ArrayList<>();
        ArrayList <String> aux = super.getPalClave();
        Collections.sort(aux);
        for (int i = 0; i < aux.size() && (i<cantidad); i++) {
            resp.add(aux.get(i));
        }
        return resp;
    }
    
}
