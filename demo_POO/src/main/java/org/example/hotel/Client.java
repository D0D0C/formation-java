package org.example.hotel;

public class Client {

    private int identifiantClient;

    private String nom;

    private String prenom;

    private int numTel;

    public Client(int identifiantClient, String nom, String prenom, int numTel) {
        this.identifiantClient = identifiantClient;
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
    }

    public int getIdentifiantClient() {
        return identifiantClient;
    }

    public void setIdentifiantClient(int identifiantClient) {
        this.identifiantClient = identifiantClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }
}
