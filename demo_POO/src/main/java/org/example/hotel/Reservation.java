package org.example.hotel;

import java.util.ArrayList;

public class Reservation {

    private int identifiantResa;

    private boolean statusResa;

    private int  nombreLit;

    private ArrayList<Chambre>chambres;

    private ArrayList<Client>client;

    public Reservation(int identifiantResa, boolean statusResa, int nombreLit, ArrayList<Chambre> chambres, ArrayList<Client> client) {
        this.identifiantResa = identifiantResa;
        this.statusResa = statusResa;
        this.nombreLit = nombreLit;
        this.chambres = chambres;
        this.client = client;
    }

    public int getIdentifiantResa() {
        return identifiantResa;
    }

    public void setIdentifiantResa(int identifiantResa) {
        this.identifiantResa = identifiantResa;
    }

    public boolean isStatusResa() {
        return statusResa;
    }

    public void setStatusResa(boolean statusResa) {
        this.statusResa = statusResa;
    }

    public int getNombreLit() {
        return nombreLit;
    }

    public void setNombreLit(int nombreLit) {
        this.nombreLit = nombreLit;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }

    public ArrayList<Client> getClient() {
        return client;
    }

    public void setClient(ArrayList<Client> client) {
        this.client = client;
    }

}


