package org.example.base;
public class ApplicationBase {
    public static void main(String[] args){

        //Instanciation d'un objet voiture
        Voiture voiture1 = new Voiture();

        //Pour executer une méthode d'instance, il suffit de faire oblet.methode(<parametre>)
        voiture1.demarrer();

        //Pour accéder à un attribut public, il suffit de faire objet.attibuts
        System.out.println(voiture1.carburant);

        voiture1.remplirReservoir(15);

        //Sinon pas besoin du .remplirReservoir car l'attrivut est public on peut juste faire ce qu'il y a en dessous
        voiture1.carburant += 1;

        System.out.println(voiture1.carburant);

        System.out.println();

        System.out.println(voiture1.couleur);

        System.out.println();

        System.out.println("### voiture2###");

        Voiture voiture2 = new Voiture("Rouge", 50,120);

        System.out.println();

        System.out.println("### voiture3###");

        Voiture voiture3 = new Voiture("Bleu");
                double chevauxFiscaux = voiture2.puissanceChevauxFiscaux();

        System.out.println();

        System.out.println(chevauxFiscaux);
        System.out.println(voiture2.puissanceChevauxFiscaux());

        System.out.println(voiture2.toString());
        System.out.println();
    }
}
