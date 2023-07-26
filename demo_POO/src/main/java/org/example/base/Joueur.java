package org.example.base;

import javax.swing.*;

public class Joueur {
    private String nom;
    private int niveau;
    private int xp;

    public Joueur(String nom) {
        this.nom = nom;
        this.niveau = 1;
        this.xp = 0;
        }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    //le this va chercher l'xp à l'instant T
    public void effectuerUneQuete(){
        this.xp+=10;
        levelUp();
            }
    public void levelUp(){
        if(this.xp >= 100){
            this.niveau++;
            this.xp=0;
            System.out.println("le joueur :" +nom+ "passe au niveau : " +niveau);
        }
    }
}


