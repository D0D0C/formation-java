package org.example.livre;

public class Bibliotheque {
    private Livre[] collection;

    public Bibliotheque(int tailleMax) {
        collection = new Livre[tailleMax];
    }
    public void ajouterLivre(Livre livre) {
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == null) {
                collection[i] = livre;
                break;
            }
        }
    }
    public void supprimerLivre(Livre livre) {
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == livre) {
                collection[i] = null;
                break;
            }
        }
    }
    public void afficherListeLivres() {
        System.out.println("Liste des livres dans la bibliothèque:");
        for (Livre livre : collection) {
            if (livre != null) {
                livre.afficherInformations();
                System.out.println();

            }
        }
    }

    public void emprunterLivre(Livre livre) {
        livre.setEmprunte(true);
    }
    public void retournerLivre(Livre livre) {
        livre.setEmprunte(false);
    }
}