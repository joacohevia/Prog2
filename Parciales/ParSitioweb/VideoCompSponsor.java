package ParSitioweb;

import java.util.ArrayList;

import ParSitioweb.CondicionesWeb.Condicion;

public class VideoCompSponsor extends VideoCompuesto{
    private Video video;

    public VideoCompSponsor(String titulo, Video vv) {
        super(titulo);
        this.video = vv;
        //TODO Auto-generated constructor stub
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
   
    public ArrayList<Video> buscar(Condicion cc) {
        ArrayList<Video> resultados = super.buscar(cc); 
        resultados.add(0, video); // Inserta el video patrocinado en la posición 0
        return resultados; 
    }

}
