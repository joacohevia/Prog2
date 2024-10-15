package Parcialito4;

import Parcialito4.CriteriosDeBusqueda.CriterioAnd;
import Parcialito4.CriteriosDeBusqueda.CriterioAnio;
import Parcialito4.CriteriosDeBusqueda.CriterioFabricante;
import Parcialito4.CriteriosDeBusqueda.CriterioMaterial;
import Parcialito4.CriteriosDeBusqueda.CriterioNombre;
import Parcialito4.CriteriosDeBusqueda.CriterioNot;
import Parcialito4.CriteriosDeBusqueda.CriterioOr;
import Parcialito4.CriteriosDeBusqueda.CriterioPeso;

public class Main {
    public static void main(String[] args) {
        Empresa articulosDePrimera = new Empresa();
        Producto televisor = new Producto("Televisor", "Acme S.A", 2021, 15);
        Producto billetera = new Producto("Billetera", "Royal Express", 2019, 7);
        Producto mesa = new Producto("Mesa", "De Primera", 2020, 40);
        Producto portaVaso = new Producto("Porta Vaso", "De Primera", 2023, 2);
        Producto apoyaCelular = new Producto("Apoya Celular", "Coop.Muebles", 2024, 4);

        Material ecocuero = new Material("Ecocuero");
        Material filtroDeColorRGB = new Material("Filtro de color RGB");
        Material roble = new Material("Roble");
        Material pino = new Material("Pino");
        Material aluminio = new Material("Aluminio");

        televisor.addMaterial(filtroDeColorRGB);
        billetera.addMaterial(ecocuero);
        mesa.addMaterial(roble);
        portaVaso.addMaterial(pino);
        apoyaCelular.addMaterial(aluminio);

        articulosDePrimera.addProducto(televisor);
        articulosDePrimera.addProducto(billetera);
        articulosDePrimera.addProducto(mesa);
        articulosDePrimera.addProducto(portaVaso);
        articulosDePrimera.addProducto(apoyaCelular);

        CriterioMaterial cMaterial = new CriterioMaterial(ecocuero);
        CriterioMaterial cMaterial2 = new CriterioMaterial(aluminio);
        CriterioAnio cAnio = new CriterioAnio(2022);
        CriterioAnio cAnio2 = new CriterioAnio(2015);
        CriterioNombre cNombre = new CriterioNombre("Televisor");
        CriterioFabricante cFabr = new CriterioFabricante("Acme S.A");
        CriterioFabricante cFabr2 = new CriterioFabricante("Royal Express");
        CriterioPeso cPeso = new CriterioPeso(20);
        CriterioPeso cPeso2 = new CriterioPeso(5);
        CriterioNot cNot = new CriterioNot(cMaterial2);
        CriterioAnd cAnd1 = new CriterioAnd(cNombre,cAnio);
        CriterioAnd cAnd2 = new CriterioAnd(cMaterial,cFabr2);
        CriterioNot c1Not = new CriterioNot(cFabr);
        //CriterioAnd cAnd3 = new CriterioAnd(cPeso,new CriterioNot(cFabr)); una manera
        CriterioAnd cAnd3 = new CriterioAnd(cPeso,c1Not);
        CriterioAnd cAnd4 = new CriterioAnd(cAnio2,cPeso2);
        CriterioOr cOr = new CriterioOr(cAnd4,cNot);
        System.out.println(articulosDePrimera.busqueda(cAnd1)); //Contenga televisor y año < 2022
        System.out.println("-------------------------------------------------");
        System.out.println(articulosDePrimera.busqueda(cAnd2));//Contenga ecocuero y fab = Royal
        System.out.println("-------------------------------------------------");
        System.out.println(articulosDePrimera.busqueda(cAnd3));//Peso < 20 y fabricante != Acme S.A
        
        System.out.println(articulosDePrimera.busqueda(cOr));//Año < 2015 y peso < 5, o material != Aluminio
    }
}
