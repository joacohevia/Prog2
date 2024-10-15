package sitioWeb1;

import java.util.ArrayList;

import sitioWeb1.CondicionesWeb.Condicion;

public class Categoria extends ElementoCat{
    private ArrayList <ElementoCat> elementos;
    private String descripcion;
    private String imagen;

    public Categoria(String descripcion, String imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.elementos = new ArrayList<>();
    }
    public void addElemento(ElementoCat ee){
        this.elementos.add(ee);
    }
    @Override //clase categoria
    public ArrayList<Noticia> buscar(Condicion cc) {
        ArrayList<Noticia> retorno = new ArrayList<>();
         for (ElementoCat elem : elementos) {
            ArrayList <Noticia> parcial = elem.buscar(cc);
            for (Noticia notiCumple : parcial) {
                retorno.add(notiCumple);
            }
        }
        return retorno;
    }
    @Override
    public int cantidadNoticias() {
        int total=0;
        for (ElementoCat elementoCat : elementos) {
            total += elementoCat.cantidadNoticias();
        }
        return total+1;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
