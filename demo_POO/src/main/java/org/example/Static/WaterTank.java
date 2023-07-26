package org.example.Static;

public class WaterTank {

    private double poids;
    private double volumeMax;
    private double volume;
    public static double volumeTotal = 0;

    public WaterTank(double poids, double volumeMax, double volume) {
        this.poids = poids;
        this.volumeMax = volumeMax;
        this.volume = volume;
        WaterTank.volumeTotal += volume;
    }
        public void remplir(double volume){
            this.volume += volume;
            WaterTank.volumeTotal += volume;// Ambiguité entre les deux volumes
        }
        public void vider(double volume){ //Attention le volume de la variable s'appelle thisv
            this.volume -= volume;
            WaterTank.volumeTotal -= volume;
        }
        public double poidsTotal(){
            return poids + volume;
        }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(double volumeMax) {
        this.volumeMax = volumeMax;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public static double getVolumeTotal() {
        return volumeTotal;
    }

    public static void setVolumeTotal(double volumeTotal) {
        WaterTank.volumeTotal = volumeTotal;
    }
}



