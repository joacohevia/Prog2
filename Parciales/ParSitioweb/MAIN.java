package ParSitioweb;

import java.util.ArrayList;

import ParSitioweb.CondicionesWeb.CondAnio;

public class MAIN {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario1 = new Usuario("Juan",2000 ,"juan@example.com");

        // Crear algunos videos
        Video video1 = new Video("Aprendiendo Java", usuario1, 120, 1000, 100, 10, 2020);
        Video video2 = new Video("Introducción a Python", usuario1, 150, 500, 50, 5, 2023);
        Video video3 = new Video("Video de C++", usuario1, 180, 300, 30, 3, 2023);

        // Crear un video patrocinado
        Video videoPatrocinado = new Video("Promoción: Curso de Programación", usuario1, 90, 200, 20, 2, 2024);

        // Crear un grupo patrocinado
        VideoCompSponsor grupoPatrocinado = new VideoCompSponsor("Grupo de Programación", videoPatrocinado);

        // Crear un VideoCompuesto (si necesitas uno para agregar videos)
        VideoCompuesto videoCompuesto = new VideoCompuesto("Compilado de Videos");

        // Agregar videos al grupo patrocinado (desde la clase padre)
        videoCompuesto.addElemento(video1);
        videoCompuesto.addElemento(video2);
        videoCompuesto.addElemento(video3);

        CondAnio anio = new CondAnio();

        // Buscar videos que cumplen con la condición
        ArrayList<Video> resultados = videoCompuesto.buscar(anio);

        // Imprimir los resultados
        System.out.println("Videos que cumplen con la condición:");
        for (Video video : resultados) {
            System.out.println(video.getTitulo());
        }
    }
}

