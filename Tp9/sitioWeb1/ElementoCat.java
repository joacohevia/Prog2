package sitioWeb1;
import java.util.ArrayList;

import sitioWeb1.CondicionesWeb.Condicion;

public abstract class ElementoCat {
        
    public abstract ArrayList<Noticia> buscar(Condicion cc);
    public abstract int cantidadNoticias();
}
