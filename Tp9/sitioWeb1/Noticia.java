package sitioWeb1;
import java.util.ArrayList;

import sitioWeb1.CondicionesWeb.Condicion;
public class Noticia extends ElementoCat{
    private String titulo;
    private ArrayList <String> palabrasClave;
    private String introduccion;
    private String texto;
    private String autor;
    private String link;
    
    public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.palabrasClave = new ArrayList<>();
    }
    @Override//clase noticia
    public ArrayList<Noticia> buscar(Condicion cc) {
       ArrayList <Noticia> ret = new ArrayList<>();
       if (cc.cumple(this)) {
            ret.add(this);
       }
       return ret;
    }
    @Override
    public int cantidadNoticias() {
        return 1;
    }
    public void addPalabra(String pp){
        this.palabrasClave.add(pp.toLowerCase());
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIntroduccion() {
        return introduccion;
    }
    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getLink() {
        return link;
    }
    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }
    public void setLink(String link) {
        this.link = link;
    }
    @Override
    public String toString() {
        return "Noticia [titulo=" + titulo + ", palabrasClave=" + palabrasClave + ", introduccion=" + introduccion
                + ", texto=" + texto + ", autor=" + autor + ", link=" + link + "]";
    }    
    
}
