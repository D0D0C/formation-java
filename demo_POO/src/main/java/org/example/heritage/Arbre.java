package org.example.heritage;

public class Arbre extends Plante{

    private double circonference;
    public Arbre(String nom, double hauteur, String couleurdesfeuilles, double circonference) {
        super(nom, hauteur, couleurdesfeuilles);
        this.circonference = circonference;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println(" et ma circonférence est de " + circonference);
    }
}
