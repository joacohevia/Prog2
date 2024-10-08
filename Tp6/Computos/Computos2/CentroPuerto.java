package Computos2;

import java.time.LocalDate;

public class CentroPuerto {
    private Elementos barco;
    private Elementos camion;
    private Elementos elemento;
    private CPuerto puertos;

    public CentroPuerto(){
        this.puertos = new CPuerto();
    }

    public String cargarBarco(){//no funciona
        Elementos c1 = elemento.obtenerPrimero(CCamion.class);
        Elementos b1 = elemento.obtenerPrimero(CBarco.class);

        if (b1!=null&&c1!=null) {
            return puertos.cargar(b1,c1);
        }
        else{
            return "no se pudo cargar";
        }
    }
   

    public static void main(String[] args) {
        CCentroPuerto cp1 = new CCentroPuerto();

        CBarco b1 = new CBarco(10);
        CBarco b2 = new CBarco(20);
        CBarco b3 = new CBarco(30);
        CBarco b4 = new CBarco(40);

        CCamion c1 = new CCamion(LocalDate.of(2024, 9, 19));
        CCamion c2 = new CCamion(LocalDate.of(2024, 9, 18));
        CCamion c3 = new CCamion(LocalDate.of(2024, 9, 17));

        cp1.addBarcos(b1);cp1.addBarcos(b2);cp1.addBarcos(b3);cp1.addBarcos(b4);
        cp1.addCamion(c1);
        cp1.addCamion(c2);
        cp1.addCamion(c3);

        System.out.println(cp1.cargarBarco());
        System.out.println(cp1.cargarBarco());
        System.out.println(cp1.cargarBarco());


    }
}

