package Correo;

import java.util.ArrayList;

public class Compania{
    private ArrayList <ElementoEnvio> envios;

    public Compania(){
        this.envios = new ArrayList<>();
    }
    public void addEnviosComp(ElementoEnvio env){
        if (!envios.contains(env)) {
            envios.add(env);
        }
    }
}