package SistElectoral;

import java.time.LocalTime;

public class Voto {
    @Override
    public String toString() {
        return "Voto [vot=" + vot + ", cand=" + cand + ", hora=" + hora + "]";
    }

    private Votante vot;
    private Candidato cand;
    private LocalTime hora;

    public Voto(Votante vot, Candidato cand, LocalTime hora) {
        this.vot = vot;
        this.cand = cand;
        this.hora = hora;
        //this.hora = LocalDate.now();
    }
    public Voto(Votante vot, LocalTime hora) {
        this.vot = vot;
        this.hora = hora;
        this.cand = null;
        //this.hora = LocalDate.now();
    }

    public Votante getVotante() {
        return vot;
    }

    public Candidato getCandidato() {
        return cand;
    }

    public LocalTime getHora() {
        return hora;
    }
    

    
}
