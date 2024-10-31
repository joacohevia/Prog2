package ParSitioweb;

public class VideoClave extends Video{


    public VideoClave(String titulo, Usuario uu, int duracion, int cantVisualizacion, int cantMg, int cantNoMg,
            int anio) {
        super(titulo, uu, duracion, cantVisualizacion, cantMg, cantNoMg, anio);
    }

    public boolean tienePal(String pp){
        return true;
    }
    
}
