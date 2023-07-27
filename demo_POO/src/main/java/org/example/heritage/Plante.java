package org.example.heritage;

public class Plante {

    private String nom;
    private double hauteur;
    private String couleurdesfeuilles;

    public Plante(String nom, double hauteur, String couleurdesfeuilles) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurdesfeuilles = couleurdesfeuilles;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurdesfeuilles() {
        return couleurdesfeuilles;
    }
    public void setCouleurdesfeuilles(String couleurdesfeuilles) {
        this.couleurdesfeuilles = couleurdesfeuilles;
    }
    public void afficher (){
        System.out.print("Je suis une plante de type " + this.nom + " avec une hauteur de  " + this.hauteur + " . La couleur de mes feuilles est " + this.couleurdesfeuilles);
    }
}
