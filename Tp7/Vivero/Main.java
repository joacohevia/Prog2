package Vivero;

import java.util.ArrayList;

import Vivero.Condiciones.CondNomVulgar;
import Vivero.Condiciones.CondSolMayor;

public class Main {
    public static void main(String[] args) {
        AdminVivero vivi = new AdminVivero();

        Planta ortiga = new Planta("ortig", "lala", "lalo", "lila", false,9,1);
        Planta camisa = new Planta("camisa de pintor", "cam", "camsi", "cal", true, 5, 0);
        Planta bonsai = new Planta("bonsai", "pino", "pi", "pior", false, 2, 8);
        ortiga.addNombres("lengua de suegra");
        vivi.addPlantas(ortiga);
        vivi.addPlantas(bonsai);
        vivi.addPlantas(camisa);

        CondSolMayor consSol = new CondSolMayor(5, 3);
        CondNomVulgar condNomVulgar = new CondNomVulgar();
        ArrayList <Planta> resultado = vivi.buscar(condNomVulgar);
        System.out.println(resultado);
    }
}
