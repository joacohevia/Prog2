import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        ProducQuimico pq1 = new ProducQuimico("randac");
        Cultivo cul1 = new Cultivo("girasol");
        pq1.addCultivosNoaptos(cul1);
        pq1.addSintomasAtratar("hojas amarillas");

        ProducQuimico pq2 = new ProducQuimico("insec");
        Cultivo cul2 = new Cultivo("soja");
        pq2.addCultivosNoaptos(cul2);
        pq2.addSintomasAtratar("hojas resecas");

        Enfermedad enfermedad1 = new Enfermedad("cochinilla");
        enfermedad1.addSintomas("hojas amarillas");

        Enfermedad enfermedad2 = new Enfermedad("hormigas");
        enfermedad2.addSintomas("hojas resecas");

        Cultivo cult = new Cultivo("alvaca");
        Enfermedad e1 =  new Enfermedad("conchilla");
        Enfermedad e2 = new Enfermedad("hormigas");
        cult.addEnfermedad(e1);
        cult.addEnfermedad(e2);

        empresa.addProducto(pq1);
        empresa.addProducto(pq2);

        CondEnfermedad cond = new CondEnfermedad(enfermedad2);
        ArrayList<ProducQuimico> productosQueCumplen = empresa.getProductosQuimicos(cond);
        for (ProducQuimico producto : productosQueCumplen) {
        System.out.println("El producto: " + producto.getNombre() + " es apto para tratar la enfermedad: "
         + enfermedad1.getNombre() + " en el cultivo: " + cult.getNombre());
        }
    }
}
