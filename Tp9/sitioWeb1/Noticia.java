package sitioWeb1;
import java.util.ArrayList;
public class Noticia {
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
    public void setLink(String link) {
        this.link = link;
    }
   
    
}
