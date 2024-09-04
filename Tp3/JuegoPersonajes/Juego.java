package Tp3.JuegoPersonajes;

import java.util.Random;

public class Juego {
    private Mazo mazoJug;
    private Jugador j1;
    private Jugador j2;
    private int cantHabilidades = 2;

    public Juego(Jugador j1,Jugador j2){
        this.j1 = j1;
        this.j2 = j2;
    }

    public void jugar(){
        int habilidad_pj1=0, habilidad_pj2=0;
        boolean empate = true;
        Personaje pj1 = mazoJug.abarajar();
        Personaje pj2 = mazoJug.abarajar();
        while (empate) {
        Random random = new Random();
        int num = random.nextInt(this.cantHabilidades);
        switch (num) {
            case 0:
            habilidad_pj1 = pj1.getFuerza();
            habilidad_pj2 = pj2.getFuerza();
            break;
            case 1:
            habilidad_pj1 = pj1.getVelocidad();
            habilidad_pj2 = pj2.getVelocidad();
            break;
            case 2:
            habilidad_pj1 = pj1.getVisionNocturna();
            habilidad_pj2 = pj2.getVisionNocturna();
            break;
            default:
                break;
        }
        
        if (habilidad_pj1 > habilidad_pj2) {
            System.out.println("Gana " + j1.getNombre()+" Nombre de personaje: "+pj1.getNombreSuper());
            empate = false;
        } else if (habilidad_pj1 < habilidad_pj2) {
            System.out.println("Gana " + j2.getNombre()+" Nombre de personaje: "+pj2.getNombreReal());
            empate = false;
        } else {
            System.out.println("Empate");
        }
    }
    }
    public Mazo getMazoj() {
        return mazoJug;
    }
    public void setMazoj(Mazo mazoj) {
        this.mazoJug = mazoj;
    }

    
}
