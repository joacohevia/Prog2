package Tp4.Avicola;
import java.time.LocalDate;
import java.time.LocalTime;

import Tp4.Avicola.congelados.CongeAgua;
import Tp4.Avicola.congelados.CongeAire;
import Tp4.Avicola.congelados.CongeNitro;

public class Empresa {
    private String nombre;

    public Empresa(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }

    public static void main(String[]args){
        Empresa avicola = new Empresa("Los pinos");
        LocalDate fecha = LocalDate.of(2024, 12, 12);

        Producto p1 = new Producto(fecha, 01);

        ProducFreco pf1 = new ProducFreco(fecha, 23, fecha, "la ioli");

        ProducRefri pr1 = new ProducRefri(fecha, 022, 1, fecha, "Entre 30 a 40°", "La no ioli");

        ProducConge pc1 = new ProducConge(fecha, 2, 02, fecha, "lal", "LA ioli 2");

        CongeAire PCA1 = new CongeAire(fecha, 02, 023, fecha, "acd", "lala", 023, 2, 5, 6);
        
        CongeAgua PCAgua1 = new CongeAgua(fecha, 055, 66, fecha, "eee", "nna", 70);

        CongeNitro PCN1 = new CongeNitro(fecha, 12, 13, fecha, "qwedqw", "oida", "metodo", LocalTime.of(14, 30));

        String aux = p1.getEtiqueta();  
        System.out.println(aux);
        
        String pf1I = pf1.getEtiqueta();
        System.out.println(pf1I);

        String producNitro = PCN1.getEtiqueta();
        System.out.println(producNitro);
   }
}
