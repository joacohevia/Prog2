package ParSitioweb.ComparadorWeb;
import java.util.Comparator;

import ParSitioweb.Video;

//por el nombre del usuario que subió el video, y si en el
//resultado hay más de un video del mismo usuario, se ordenan por la dirección de email del usuario
public class comparador implements Comparator<Video>{

    @Override
    public int compare(Video v1, Video v2) {
        int comp = v1.getUsuario().getNombre().compareTo(v2.getUsuario().getNombre());
        if (comp != 0) {
            return comp;
        }
        return v1.getUsuario().getEmail().compareTo(v2.getUsuario().getEmail());
    }
}
