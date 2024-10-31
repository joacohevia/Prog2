package ParSitioweb;

import java.util.ArrayList;

import ParSitioweb.CondicionesWeb.Condicion;

public class VideoCompuesto extends ElementoVideo{
    private ArrayList <ElementoVideo> grupo;
    private int duracionExtra;
    
    public VideoCompuesto(String titulo) {
        this(titulo, 5);
    }
    public VideoCompuesto(String titu,int dur){
        super(titu);
        this.duracionExtra = dur;
        this.grupo = new ArrayList<>();
    }
    public void addElemento(ElementoVideo nuevo){
        grupo.add(nuevo);
    }
   
    @Override
    public ArrayList<String> getPalClaves() {
        ArrayList <String> respuesta = new ArrayList<>();
        for (ElementoVideo elem : grupo) {
            ArrayList <String> videosPal = elem.getPalClaves();
            for (String video : videosPal) {
                if (!respuesta.contains(video)) {
                    respuesta.add(video);
                }
            }           
        }
        return respuesta;
    }
    /*ArrayList<String> respuesta = new ArrayList<>(); 
    for (ElementoVideo elem : grupo) {
        for (String palabraClave : elem.getPalClaves()) {
            if (!respuesta.contains(palabraClave)) { 
                respuesta.add(palabraClave); 
            }
        }
    }
    return respuesta; */
    @Override
    public int getCantidad() {
        int total = 0;
        for (ElementoVideo elementoVideo : grupo) {
            total+= elementoVideo.getCantidad();
        }
        return total;
    }

    @Override
    public int getDuracion() {
        int demora = 0;
        for (ElementoVideo elementoVideo : grupo) {
            demora += elementoVideo.getDuracion();
        }
        return demora + duracionExtra;
    }

    @Override
    public ArrayList<Video> buscar(Condicion cc) {
        ArrayList <Video> respuesta = new ArrayList<>();
        for (ElementoVideo videos : grupo) {
            respuesta.addAll(videos.buscar(cc));
        }
        return respuesta;
    }

    public int getDuracionExtra() {
        return duracionExtra;
    }
    public void setDuracionExtra(int duracionExtr) {
        this.duracionExtra = duracionExtr;
    }

}
