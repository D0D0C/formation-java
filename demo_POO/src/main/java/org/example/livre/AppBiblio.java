package org.example.livre;

public class AppBiblio {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque(5);

        Livre livre1 = new Livre("Livre 1", "Auteur 1", 200);
        Livre livre2 = new Livre("Livre 2", "Auteur 2", 150);
        Livre livre3 = new Livre("Livre 3", "Auteur 3", 300);

        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);
        bibliotheque.ajouterLivre(livre3);

        System.out.println("Liste des livres avant emprunt/retour:");
        bibliotheque.afficherListeLivres();

        bibliotheque.emprunterLivre(livre2);
        bibliotheque.retournerLivre(livre1);

        System.out.println("\nListe des livres après emprunt/retour:");
        bibliotheque.afficherListeLivres();
    }
}