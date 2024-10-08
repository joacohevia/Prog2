package BusqDoc;

public class CondNombre extends Condicion{
    private String nombre;
    
    public CondNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.getTitulo().equalsIgnoreCase(nombre);
    }
   
}
