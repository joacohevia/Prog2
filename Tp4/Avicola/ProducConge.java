package Tp4.Avicola;

import java.time.LocalDate;

public class ProducConge extends ProducRefri{
    
     public ProducConge(LocalDate fechaVenc, int numLote,int idOrganism,LocalDate fechaEnva,
    String tempRecomendad,String granj){
        
        super(fechaVenc, numLote,idOrganism,fechaEnva,tempRecomendad,granj);
      
    }
    @Override
    public String getEtiqueta(){
        return super.getEtiqueta() + (" Cod org: "+idOrganismo+" Fecha envace: "+fechaEnvac+
        " Temperatura recon: "+tempRecomendada+" Granja "+granja);
    }

    
}
