package sitioWeb1.CondicionesWeb;

import sitioWeb1.Noticia;

public class CondTitulo extends Condicion{
    private String titulo = "ultimo momento";
    @Override
    public boolean cumple(Noticia nn) {
       return nn.getTitulo().equals(titulo);
    }
    
}
