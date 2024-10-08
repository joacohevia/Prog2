package BusqDoc;

import java.util.ArrayList;

public class Historiador {
    private String nombre;
    private ArrayList <Documento> documentos;

    public Historiador(String nombre) {
        this.nombre = nombre;
        this.documentos = new ArrayList<>();
    }
    
    public void addDocumentos(Documento doc){
        if (!documentos.contains(doc)) {
            documentos.add(doc);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Documento> buscar(Condicion con){
		ArrayList<Documento> salida= new ArrayList<Documento>();
		for(int i = 0; i<documentos.size();i++) {
			Documento doc = documentos.get(i);
			if (con.cumple(doc))
				salida.add(doc);
		}
		return salida;
	}
    
}
