package org.example.base;

public class Voiture {

    // Attributs d'instance
    // <visibilité> <type> <nom>

    // public = accessible en dehors de la classe
    public String couleur;
    public int carburant;
    public int puissance;


    //private : accessible unqiuement dans la classe
    private String marque;

    //protected : accessible dans la classe et dans les enfants qui héritent de cette classe
    protected int nombrePortes;

    //Premiere methode a créer est le constructeur
    //Constructeur, il définit comment est construit la classe
    public Voiture() {
        System.out.println("Je suis dans le constructeur sans paramètre");
            };

    //Polymorphisme : possibilitéé de définir plusieurs méthode avec le meme nom mais des signature différentes
    public Voiture(String couleur){
        //this(<parametres>) appelle le constructeur avec la signature similaire
        this();
        System.out.println("Je suis dans le constructeur avec couleur");
        this.couleur = couleur;
    }

    public Voiture(String couleur, int carburant, int puissance){
        //this.couleur = couleur;
        this(couleur);
        this.carburant = carburant;
        this.puissance = puissance;
        System.out.println("Je suis dans le constructeur avec tous les attributs");
    }

    //Méthodes d'instance
    //<visibilité><type de retour> <nom> <paramètres>

    public void demarrer(){
        System.out.println("la voiture démarre");
    }
    public void freiner(){
        System.out.println("la voiture freine");
    }
    public void remplirReservoir(int volume){
        carburant += volume;
    }
    public double puissanceChevauxFiscaux(){
        return puissance / 7.0;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "couleur='" + couleur + '\'' +
                ", carburant=" + carburant +
                ", puissance=" + puissance +
                ", marque='" + marque + '\'' +
                ", nombrePortes=" + nombrePortes +
                '}';
    }
}


