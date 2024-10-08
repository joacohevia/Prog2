package sitioWeb1;
import java.util.ArrayList;

import sitioWeb1.CondicionesWeb.Condicion;

public abstract class ElementoCat {
        private String descripcion;
        private String imagen;
    
        public ElementoCat(String descripcion, String imagen) {
            this.descripcion = descripcion;
            this.imagen = imagen;
            
        }
        public abstract ArrayList<Noticia> buscar(Condicion cc);
        public abstract int cantidadNoticias();
    
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
