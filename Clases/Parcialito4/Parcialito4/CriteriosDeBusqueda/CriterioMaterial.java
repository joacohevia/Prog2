package Parcialito4.CriteriosDeBusqueda;

import Parcialito4.Material;
import Parcialito4.Producto;

public class CriterioMaterial extends Criterio {
    Material material;

    public CriterioMaterial(Material material) {
        this.material = material;
    }


    @Override
    public boolean cumple(Producto pp) {
        return pp.tieneMaterial(material);
    }
}
