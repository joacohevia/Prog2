package sitioWeb1.CondicionesWeb;

import sitioWeb1.Noticia;

public class CondAutor extends Condicion{
    private String buscado = "Juan Perez";
    @Override
    public boolean cumple(Noticia nn) {
        return nn.getAutor().equals(buscado);
    }
    
}
