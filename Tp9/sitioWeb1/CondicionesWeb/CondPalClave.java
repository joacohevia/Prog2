package sitioWeb1.CondicionesWeb;

import sitioWeb1.Noticia;

public class CondPalClave extends Condicion{
    private String pb = "partido";
    private String pb1 = "goleada";
    @Override
    public boolean cumple(Noticia nn) {
       return nn.getPalabrasClave().contains(pb) && nn.getPalabrasClave().contains(pb1);
    }
    
}
