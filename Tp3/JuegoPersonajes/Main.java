package Tp3.JuegoPersonajes;

public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Joaco","hevia");
        Jugador j2 = new Jugador("pancho","vazquez");
        j1.agregarJug(j2); j2.agregarJug(j2);

        Juego juego1 = new Juego(j1,j2);

        Personaje heroe1 = new Personaje("Nico", "NicoMan", 50, 500, 500, 25, 150, 90);
        Personaje heroe2 = new Personaje("Nico2", "NicoMan", 50, 500, 500, 25, 150, 90);
        Personaje heroe3 = new Personaje("Nico3", "NicoMan", 50, 500, 500, 25, 150, 90);

        Personaje villano1 = new Personaje("Mar", "MarMan", 500, 520, 2500, 21, 159, 900);
        Personaje villano2 = new Personaje("Mar", "MarMan", 500, 520, 2500, 21, 159, 900);
        Personaje villano3 = new Personaje("Mar", "MarMan", 500, 520, 2500, 21, 159, 900);
    
        Mazo mazoJug = new Mazo();
        mazoJug.agregarPersonaje(villano3); mazoJug.agregarPersonaje(heroe3); mazoJug.agregarPersonaje(villano2);
        mazoJug.agregarPersonaje(heroe2);mazoJug.agregarPersonaje(villano1);mazoJug.agregarPersonaje(heroe1);

        juego1.setMazoj(mazoJug);
        juego1.jugar();
    }
}
