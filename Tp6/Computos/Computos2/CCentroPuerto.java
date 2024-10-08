import java.time.LocalDate;

public class CCentroPuerto {
    private CColaBarco barcos;
    private CColaCamion camiones;
    private CPuerto puertos;

    public CCentroPuerto(){
        this.barcos = new CColaBarco();
        this.camiones = new CColaCamion();
        this.puertos = new CPuerto();
    }

    public String cargarBarco(){
        CBarco b1 = barcos.obtenerPrimero();
        CCamion c1 = camiones.obtenerPrimero();

        if (b1!=null&&c1!=null) {
            return puertos.cargar(b1,c1);
        }
        else{
            return "no se pudo cargar";
        }
    }
    public void addCamion(CCamion c1){
        camiones.addCamiones(c1);
    }
    public void addBarcos(CBarco b1){
        barcos.addBarcos(b1);
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

