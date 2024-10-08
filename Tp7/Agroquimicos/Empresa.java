import java.util.ArrayList;

public class Empresa {
    private ArrayList<ProducQuimico> productos;

    public Empresa(){
        this.productos = new ArrayList<>();
    }

    public ArrayList<ProducQuimico> getProductos() {
        return productos;
    }
    public void addProducto(ProducQuimico pq){
        productos.add(pq);
    }
}
