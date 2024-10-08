import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        ProducQuimico pq1 = new ProducQuimico("randac");
        pq1.addCultivosNoaptos("girasol");
        pq1.addSintomasAtratar("hojas amarillas");

        ProducQuimico pq2 = new ProducQuimico("insec");
        pq2.addCultivosNoaptos("soja");
        pq2.addSintomasAtratar("hojas resecas");

        Enfermedad enfermedad1 = new Enfermedad("cochinilla");
        enfermedad1.addSintomas("hojas amarillas");

        Enfermedad enfermedad2 = new Enfermedad("hormigas");
        enfermedad2.addSintomas("hojas resecas");

        Cultivo cult = new Cultivo("alvaca");
        cult.addEnfermedad("cochinilla");
        cult.addEnfermedad("hormigas");

        empresa.addProducto(pq1);
        empresa.addProducto(pq2);

        ArrayList<ProducQuimico> productosQueCumplen = cult.cumple(empresa, enfermedad1);
        for (ProducQuimico producto : productosQueCumplen) {
        System.out.println("El producto " + producto.getNombre() + " es apto para tratar la enfermedad "
         + enfermedad1.getNombre() + " en el cultivo " + cult.getNombre());
        }
    }
}
