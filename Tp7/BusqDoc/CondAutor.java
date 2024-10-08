package BusqDoc;

public class CondAutor extends Condicion{
    private String nombre;

    public CondAutor(String nom){
        this.nombre = nom;
    }
    @Override
    public boolean cumple(Documento doc) {
        return doc.tieneAutor(nombre);
    }
    
}
