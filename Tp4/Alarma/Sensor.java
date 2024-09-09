package Tp4.Alarma;

public class Sensor {
    private String zona;
    private boolean sies;
    
    public Sensor(String zona) {
        this.zona = zona;
        this.sies = false;
    }
    
    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }
    public boolean getSies() {
        return sies;
    }
    public void setSies(boolean sies) {
        this.sies = sies;
    }

    
}
