package Tp4.EquipoFutbol;

import java.util.ArrayList;

public class Seleccion {
    private String nombreSelec;
    private ArrayList<Futbolista> futbolistas;
    private ArrayList<CuerpoTec> cuerpoTecnico;

    public Seleccion(String nombreSelec) {
        this.nombreSelec = nombreSelec;
        this.futbolistas = new ArrayList<>();
        this.cuerpoTecnico = new ArrayList<>();
    }

    public void agregarCuerpoTec(CuerpoTec... c) {
        for (CuerpoTec nuevo : c) {
            boolean aux = false;
            for(int j=0; j<cuerpoTecnico.size(); j++){
                CuerpoTec ct = cuerpoTecnico.get(j);
                if (ct.getNombre().equals(nuevo.getNombre())||
                        ct.getNumPasarporte().equals(nuevo.getNumPasarporte())) {
                    aux=true;
                }
            }
            if (!aux) {
                cuerpoTecnico.add(nuevo);
            }else{
                System.out.println("ENTRENADOR REPETIDO");
            }
        }
        

        
    }
  

    public void agregarFutbolist(Futbolista... f) {
        for (Futbolista futbol : f) {
            futbolistas.add(futbol);
        }
    }

    public String getNombreSelec() {
        return nombreSelec;
    }
    public void setNombreSelec(String nombreSelec) {
        this.nombreSelec = nombreSelec;
    }
    public ArrayList<Futbolista> getFutbolistas() {
        return futbolistas;
    }
    public void setFutbolistas(ArrayList<Futbolista> futbolistas) {
        this.futbolistas = futbolistas;
    }
    public ArrayList<CuerpoTec> getCuerpoTecnico() {
        return cuerpoTecnico;
    }
    public void setCuerpoTecnico(ArrayList<CuerpoTec> cuerpoTecnico) {
        this.cuerpoTecnico = cuerpoTecnico;
    }

    

}
