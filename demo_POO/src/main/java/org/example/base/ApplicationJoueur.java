package org.example.base;

public class ApplicationJoueur {
    public static void main(String[] args) {

        Joueur Dodo = new Joueur("DoDoleBgdu59");


        for (int compteur = 1; compteur < 100; compteur++){
            System.out.println("Le joueur"+ Dodo.getNom()+ "effectue la quete n° "+compteur);
            Dodo.effectuerUneQuete();
        }
        Dodo.setNom("Le Bg tout court");
        System.out.println(Dodo.getNom());
        }
}
