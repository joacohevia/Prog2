package ParcialNoticia;

import java.util.ArrayList;

import ParcialNoticia.CondicionesNot.CondicionNot;

public class NotPatrocinada extends Noticia{

    public NotPatrocinada(String titulo, String contenido, String autor, String categoria) {
        super(titulo, contenido, autor, categoria);
        
    }

    public ArrayList <Noticia> buscar(CondicionNot cc){
        ArrayList <Noticia> resp = new ArrayList<>();
        resp.add(this);
        return resp;
    }
    
}
