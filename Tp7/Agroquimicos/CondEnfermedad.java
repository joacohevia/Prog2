public class CondEnfermedad extends Condicion{
    private Enfermedad enfermedad;
    public CondEnfermedad(Enfermedad e){
        this.enfermedad = e;
    }

    public boolean cumple(ProducQuimico pq){
        return pq.trataEnfermedad(this.enfermedad);
    }
}
