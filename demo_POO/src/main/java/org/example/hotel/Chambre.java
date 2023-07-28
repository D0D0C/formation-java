package org.example.hotel;

public class Chambre {

    private int numeroChambre;

    private boolean statusChambre;

    private int nombreLits;

    public double tarif;

    public Chambre(int numeroChambre, boolean statusChambre, int nombreLits, double tarif) {
        this.numeroChambre = numeroChambre;
        this.statusChambre = statusChambre;
        this.nombreLits = nombreLits;
        this.tarif = tarif;
    }

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public boolean isStatusChambre() {
        return statusChambre;
    }

    public void setStatusChambre(boolean statusChambre) {
        this.statusChambre = statusChambre;
    }

    public int getNombreLits() {
        return nombreLits;
    }

    public void setNombreLits(int nombreLits) {
        this.nombreLits = nombreLits;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
}
