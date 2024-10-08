
import java.util.ArrayList;

public class Cultivo extends Condicion{
    private String nombre;
    private ArrayList <String> enfermedad;

    public Cultivo(String nombre){
        this.nombre = nombre;
        this.enfermedad = new ArrayList<>();
    }
    public void addEnfermedad(String enfer){
        if (!enfermedad.contains(enfer.toLowerCase())) {
            enfermedad.add(enfer);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public ArrayList<ProducQuimico> cumple(Empresa empre,Enfermedad enfer) {
        ArrayList <ProducQuimico> productosQueCumplen = new ArrayList<>();
        for (ProducQuimico pq : empre.getProductos()) {
            if (pq.esApto(this, enfer)) {
                productosQueCumplen.add(pq);
            }
        }
        if (productosQueCumplen.isEmpty()) {
            System.out.println("No hay productos que cumplan");
        }
        return productosQueCumplen;
    }
    public ArrayList<String> getEnfermedad() {
        return enfermedad;
    }
}
