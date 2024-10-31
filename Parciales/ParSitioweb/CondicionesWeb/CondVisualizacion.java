package ParSitioweb.CondicionesWeb;

import ParSitioweb.Video;

public class CondVisualizacion extends Condicion{
    private int visualizaciones;

    public CondVisualizacion(){
        visualizaciones = 1000;
    }
    @Override
    public boolean cumple(Video vv) {
        return vv.getCantVisualizacion() > visualizaciones;
    }
    
}
