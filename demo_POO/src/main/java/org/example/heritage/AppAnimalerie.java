package org.example.heritage;

import org.example.heritage.Animal;
import org.example.heritage.Chat;
import org.example.heritage.Chien;

public class AppAnimalerie {
    public static void main(String[] args) {

        Animal animal = new Animal("toto", 10, "bleue");
        animal.crier();

        //System.out.println(animal.annenaissance)); pas possible car anneNaissance protected

        Chat chat  = new Chat("tata", 10, "Roux");
        chat.crier();

        Chien chien = new Chien("Rex", 10, "Roux et bleu", 1.20);
        chien.crier();

        chat.manger();

        chien.manger();

        System.out.println(animal);
        System.out.println(chien);
        System.out.println(chat);

        //objet est l'objet racine dont toutes les classes héritent

    }
}
