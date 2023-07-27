package org.example.livre;

public class Livre {

    private String titre;
    private String auteur;
    private int nombreDePages;
    private boolean estEmprunte;

    public Livre(String titre, String auteur, int nombreDePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.estEmprunte = false;
    }


    public void setEmprunte(boolean estEmprunte) {
        this.estEmprunte = estEmprunte;
    }


    public void afficherInformations() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Nombre de pages: " + nombreDePages);
        System.out.println("Emprunté: " + estEmprunte);
    }
}