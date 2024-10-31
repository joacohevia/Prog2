package ParSitioweb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ParSitioweb.CondicionesWeb.Condicion;

public  abstract class ElementoVideo {
    private String titulo;

    public ElementoVideo(String titulo) {
        this.titulo = titulo;
    }

    public abstract ArrayList<String> getPalClaves();
    public abstract int getCantidad();
    public abstract int getDuracion();

    public abstract ArrayList <Video> buscar(Condicion cc);

    public ArrayList<Video> buscarOrdenado(Condicion cc, Comparator<Video> orden){
        ArrayList <Video> resp = this.buscar(cc);
        Collections.sort(resp,orden);
        return resp;
    }

    @Override
    //equals por el atributo que comparo
    public boolean equals(Object o) {
        try {
            ElementoVideo that = (ElementoVideo) o;
            return titulo.equals(that.getTitulo());
        } catch (Exception e){
            return false;
        }
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
