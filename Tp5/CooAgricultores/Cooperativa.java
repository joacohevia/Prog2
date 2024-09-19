package Tp5.CooAgricultores;

import java.util.ArrayList;

public class Cooperativa {
    private ArrayList <Lote> lotes;
    private ArrayList <Lote> lotesEspecial;
    private ArrayList <String>  mineralPrimario;
    private Cereal cc;

    public Cooperativa() {
        this.lotes = new ArrayList<>();
        this.lotesEspecial = new ArrayList<>();
        this.mineralPrimario = new ArrayList<>();
    }
    public void asignar(Lote lot, Cereal cer){
        //yo necesito recorrer los minerales del lote que entro y ver si contiene
        //los mismos minerales que el cereal que entro
        // verif si el lote contiene todos los minerales requeridos por el cereal
        boolean cumple = true;
        for (int i=0; i<lot.getMineralesLote().size(); i++) {
            String requerido = cer.getMineralesRequeridos().get(i).toUpperCase();
            if (!lot.getMineralesLote().contains(requerido)&& cumple) {
                cumple = false;
            }
        }
        if (cumple && !cer.esPastura()) {
            // Agregar el cereal al lote o realizar la acción correspondiente
            System.out.println("El lote " + lot.getUbicacion() + " es apto para el cereal " + cer.getNombre());
        } else if (lot.esApto()) {
            System.out.println("El lote " + lot.getUbicacion() + " es apto para el cereal " + cer.getNombre());
        }
        else {
            System.out.println("El lote " + lot.getUbicacion() + " NO es apto para el cereal " + cer.getNombre());
        }    
    }

    public void addMinerallPrimario(String mm){
        if (!mineralPrimario.contains(mm.toUpperCase())) {
            mineralPrimario.add(mm.toUpperCase());
        }
    }
    public void inicializarMine(ArrayList <String> mineralPrimario) {
        for(int i=0; i<mineralPrimario.size(); i++){
            this.addMinerallPrimario(mineralPrimario.get(i));
        }
    }
    public void agregarLot(Lote lotNue){
        this.lotes.add(lotNue);
    }
    public ArrayList<Lote> getLotes() {
        return lotes;
    }
    public void setLotes(ArrayList<Lote> lotes) {
        this.lotes = lotes;
    }
    public ArrayList<Lote> getLotesEspecial() {
        return lotesEspecial;
    }
    public boolean tienePrim(String mineralLote){
        for (String mineral : mineralPrimario) {
            if (!mineral.contains(mineralLote)) {
                return false;
            }
        }
        return true;
    }

    public void addLotesEspecial(Lote especial) {
        boolean aux = true;
        for (int i = 0; i < especial.getMineralesLote().size(); i++) {
            String mineralLote = especial.getMineralesLote().get(i).toUpperCase();
            //System.out.println("Mineral del Lote: " + mineralLote);
            if (!tienePrim(mineralLote)) {
                aux = false;
            }
        }
        // Si cumple todos los requisitos, agregamos el lote como especial
        if (aux) {
            this.lotesEspecial.add(especial);
            System.out.println("El lote es especial.");
        } else {
            System.out.println("El lote NO cumple los requisitos.");
        }
    }
    public Cereal getCc() {
        return cc;
    }
    public void setCc(Cereal cc) {
        this.cc = cc;
    }
    @Override
    public String toString() {
        return "Cooperativa:" + lotes + ", lotesEspecial=" + lotesEspecial + ", mineralPrimario" + mineralPrimario + "]";
    }

    

}
