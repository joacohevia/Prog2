package sitioWeb1.CondicionesWeb;


import sitioWeb1.Noticia;

public class CondMinimo extends Condicion {
    private int longitudMinima;

    // Constructor
    public CondMinimo() {
        this.longitudMinima = 5;
    }

    // Implementación del método cumple
    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTexto().length() > longitudMinima;
    }
}