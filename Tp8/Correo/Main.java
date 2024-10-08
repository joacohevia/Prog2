package Correo;

public class Main {
    public static void main(String[] args) {
        Compania MercadoLibre = new Compania();

        Carta c1 = new Carta("figueroa 299", "Tandil", false, 1, 2, "rodriguez 2099");

        Paquete p1 = new Paquete("laprida 200", "tandil", true, 2, 7, "rodriguez 2099");

        Paquete p2 = new Paquete("iraola 2300", "tandil", false, 5, 10, "maipu 200");

        Paquete p3 = new Paquete("DEL VALLE 2300", "tandil", false, 8, 10, "maipu 200");

        ComboEnvio comboTandil = new ComboEnvio();
        comboTandil.addCartasPaq(c1);
        comboTandil.addCartasPaq(p1);//este tiene id 2 pero como lo agrego al combo cambia a 1
        System.out.println(comboTandil);//IMPRIME DOS COMBOS CON SU PESO
        comboTandil.addCartasPaq(p2);
        System.out.println(comboTandil);//TRES COMBOS CON SU PESO

        ComboEnvio comboTandil2 = new ComboEnvio();
        comboTandil2.addCartasPaq(p3);
        
        comboTandil.addCombo(comboTandil2);

        System.out.println(comboTandil);//al primer combo le agrega el segundo y suma peso
    }
}
