package sitioWeb1;

import java.util.ArrayList;

import sitioWeb1.CondicionesWeb.Condicion;

public class Categoria extends ElementoCat{
    private ArrayList <ElementoCat> elementos;
    private ArrayList <Noticia> noticias;

    public Categoria(String descripcion, String imagen) {
        super(descripcion, imagen);
        this.elementos = new ArrayList<>();
        this.noticias = new ArrayList<>();
        
    }
    public void addElemento(ElementoCat ee){
        this.elementos.add(ee);
    }
    public void addNoticia(Noticia ee){
        this.noticias.add(ee);
    }
    
    @Override
    public ArrayList<Noticia> buscar(Condicion cc) {
         ArrayList<Noticia> retorno = new ArrayList<>();
         for (Noticia noticia : noticias) {
            if (cc.cumple(noticia)) {
                retorno.add(noticia);
            }
        } // Buscar en las sub-secciones
        for (ElementoCat subSeccion : elementos) {
            retorno.addAll(subSeccion.buscar(cc)); // Busca en cada sub-sección
        }
        return retorno;
    }
    @Override
    public int cantidadNoticias() {
        int total=0;
        for (ElementoCat elementoCat : elementos) {
            total =+ elementoCat.cantidadNoticias();
        }
        return total;
    }
  
}
