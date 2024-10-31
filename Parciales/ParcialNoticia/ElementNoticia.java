package ParcialNoticia;
import java.util.ArrayList;

import ParcialNoticia.CondicionesNot.CondicionNot;

public abstract class ElementNoticia {
    public abstract ArrayList <Noticia> buscar(CondicionNot cond);
    public abstract ArrayList <String> getPalClave();
    public abstract String getCategoria();
}
