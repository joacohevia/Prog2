package SistElectoral;

import java.time.LocalTime;

import SistElectoral.condiciones.condCandidato;
import SistElectoral.condiciones.condHora;
import SistElectoral.condiciones.condVotoBlanco;

public class Main {
    public static void main(String[] args) {
        Candidato milei = new Candidato("javier", "lib", "A");
        Candidato cris = new Candidato("cristina", "peron", "B");

        Votante v1 = new Votante("43247");
        Votante v2 = new Votante("43567");
        Votante v3 = new Votante("222222");

        LocalTime hora = LocalTime.of(10, 5, 0);
        LocalTime horafin = LocalTime.of(11, 0, 0);

        Voto voto1 = new Voto(v1, milei, hora);
        Voto voto2 = new Voto(v2, cris, hora);
        Voto voto3 = new Voto(v3,hora);

        Mesa mesa1 = new Mesa();
        mesa1.agregarVotante(v1);
        mesa1.agregarVotante(v2);
        mesa1.agregarVotante(v3);
        mesa1.votar(v1, voto1);
        mesa1.votar(v2, voto2);
        mesa1.votar(v3, voto3);
        
        System.out.println(mesa1);

        condCandidato candidato = new condCandidato(milei);
        condCandidato candidato1 = new condCandidato(cris);
        condHora Condhora = new condHora();
        condVotoBlanco condBlanco = new condVotoBlanco();

        System.out.println(mesa1.porcentajeVoto(candidato));
        System.out.println(mesa1.porcentajeVoto(Condhora));
        System.out.println(mesa1.porcentajeVoto(condBlanco));


    }
}
