import java.util.ArrayList;

public class Empresa {
    private ArrayList<ProducQuimico> productos;

    public Empresa(){
        this.productos = new ArrayList<>();
    }
    public ArrayList<ProducQuimico> getProductosQuimicos(Condicion c){
        ArrayList<ProducQuimico> retorno = new ArrayList<>();
        for(ProducQuimico pq: productos){
            if(c.cumple(pq)){
                retorno.add(pq);
            }
        }
        return retorno;
    }
    @Override
    public String toString() {
        return "Empresa [productos=" + productos + "]";
    }
    public ArrayList<ProducQuimico> getProductos() {
        return productos;
    }
    public void addProducto(ProducQuimico pq){
        productos.add(pq);
    }
}
