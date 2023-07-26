package org.example.heritage;
//Utilisation du mot clé extends pour hériter d'une classe

public class Chat extends Animal {

    private int vies;

    //Appel du constructeur parent

    public Chat(String nom, int age, String couleur) {
        // Utilisation du mot clé super pour appeler le constructeur du parent avec ses paraméétres
        super(nom, age, couleur);
        this.vies = 7;
    }
    //Surcharge de la methode du parent
    //Utilisation de l'annotation @Override

    @Override
    public void crier() {
        System.out.println("miaou miaou");
    }
    //Surcharge de la methode du parent
    //Utilisation de l'ancien comportement avec super.<nom méthode>(<paramètres>)


    @Override
    public void manger() {
        super.manger();
        System.out.println("Je mange de délicieuses croquettes");
    }
    @Override
    public String toString() {
        return "Nom du chat :" + getNom() + "age :" + getAge()+" ans "+ "anneé de naissance :" + anneNaissance();
    }
}


