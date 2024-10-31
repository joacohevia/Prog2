package ParcialNoticia;
import java.util.ArrayList;

import ParcialNoticia.CondicionesNot.CondicionNot;
public class Categoria extends ElementNoticia{

    private ArrayList <ElementNoticia> noticias;
    private int posicion;
    private static final String defecto="sin def";
    
    public Categoria(int pos){
        this.posicion = pos;
    }
    public Categoria(){
        this(0);
    }
    @Override
    public ArrayList<Noticia> buscar(CondicionNot cond) {
        ArrayList <Noticia> resp = new ArrayList<>();
        for (ElementNoticia not : noticias) {
            resp.addAll(not.buscar(cond));
        }
        return resp;
    }
    @Override
    public ArrayList<String> getPalClave() {
        ArrayList <String> resp = new ArrayList<>();
        for (ElementNoticia elem : noticias) {
            ArrayList <String> aux = elem.getPalClave();
            for (String pal : aux) {
                if (!resp.contains(pal)) {
                    resp.add(pal);
                }
            }
        }
        return resp;
    }
    @Override
    public String getCategoria() {
       if (posicion < noticias.size()) {
            return noticias.get(posicion).getCategoria();
       }else{
        return defecto;
       }
    }

    

}
