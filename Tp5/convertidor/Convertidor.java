package Tp5.convertidor;

public class Convertidor {
    private static final double PULGADA_A_CM = 2.54;//1 pul es 
    private static final double LIBRA_A_KG = 0.453592;//una libra es
    private static final double galonAlitro = 3.78541;//un galon son

    public static double convertir(double valor, String tipo) {
        if (tipo.equals("cm")) {
            // Si es cm, convertir a pulgadas
            return valor / PULGADA_A_CM;
        } else if (tipo.equals("pulgada")) {
            // Si es pulgada, convertir a cm
            return valor * PULGADA_A_CM;
        } else {
            System.out.println("Error");
            return valor*-1;
        }
    }
    public static double conveLibra(double libra, String tipo) {
        if (tipo.equals("libra")) {
            return libra * LIBRA_A_KG;
        } else if (tipo.equals("kg")) {
            // Si es pulgada, convertir a cm
            return libra / LIBRA_A_KG;
        } else {
            System.out.println("Error");
            return libra*-1;
        }
    }
    public static double conveGalon(double galon, String tipo) {
        if (tipo.equals("galon")) {
            return galon * galonAlitro;
        } else if (tipo.equals("litros")) {
            // Si es pulgada, convertir a cm
            return galon / galonAlitro;
        } else {
            System.out.println("Error");
            return galon*-1;
        }
    }

    public static void main(String[] args) {
        double Cm_a_Pul = Convertidor.convertir(100, "cm");
        System.out.println(Cm_a_Pul);

        double pul_A_cm = Convertidor.convertir(50, "pulgada");
        System.out.println(pul_A_cm);

        double gaAli = Convertidor.conveGalon(1, "galon");
        System.out.println(gaAli);

        double liAga = Convertidor.conveGalon(1, "litros");
        System.out.println(liAga);
    }

}
