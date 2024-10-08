package SistElectoral;

import java.util.ArrayList;

import SistElectoral.condiciones.Condicion;

public class Mesa extends ElementoElec{
    private ArrayList <Voto> votos;
    private ArrayList <Votante> votantes;

    public Mesa(){
        this.votos = new ArrayList<>();
        this.votantes = new ArrayList<>();
    }
    public ArrayList<Voto> getVotos() {
        return votos;
    }
    public ArrayList<Votante> getVotantes() {
        return votantes;
    }
    public void agregarVotante(Votante vv){
        if (!votantes.contains(vv)) {
            votantes.add(vv);
        }
    }
    public void votar(Votante vv,Voto vt){
        if (votantes.contains(vv)) {
            votos.add(vt);
        }
    }
 
    @Override
    public String toString() {
        return "Mesa [votos=" + votos + ", votantes=" + votantes + "]";
    }
    @Override
    public double porcentajeVoto(Condicion cc) {
        double total=0;
        for (Voto vv : votos) {
            if (cc.cumple(vv)) {
                total++;
            }
        }
        return (total * 100) / votosTotal();
    }
    
    @Override
    public int votosTotal() {
       return votos.size();
    }
   
  

    
    
}
