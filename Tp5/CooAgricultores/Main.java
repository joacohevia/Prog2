package Tp5.CooAgricultores;

public class Main {
    public static void main(String[] args) {
        Cooperativa cooperativa = new Cooperativa();
        
        cooperativa.addMinerallPrimario("fosforo");

        Lote lote1 = new Lote("Lote1", 60);  
        Lote lote2 = new Lote("Lote2", 45);  

        lote1.addMineral("nitrogeno");
        lote2.addMineral("fosforo");

        cooperativa.agregarLot(lote1);
        cooperativa.agregarLot(lote2);

        Cereal maiz = new Cereal("Maíz");
        maiz.addMineralRequerido("nitrogeno");
        //maiz.addMineralRequerido("fosforo");

        Cereal pastura = new Cereal("Pastura");
        pastura.addMineralRequerido("nitrogeno");

        System.out.println(lote1);
        cooperativa.asignar(lote1, pastura);
        cooperativa.addLotesEspecial(lote2);
    
    }
}
