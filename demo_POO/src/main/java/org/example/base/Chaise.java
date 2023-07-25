package org.example.base;
public class Chaise {

    public int nombrePieds;
    public String materiaux;
    public String couleur;
    public double prix;

    public Chaise(int nombrePieds, String materiaux, String couleur, double prix) {
        this.nombrePieds = nombrePieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    }

    ;

    @Override
    public String toString() {
        return "Je suis une Chaise avec " + nombrePieds + " pieds " + " en " + materiaux + " de couleur " + couleur + " à un prix " + prix;
    }
}