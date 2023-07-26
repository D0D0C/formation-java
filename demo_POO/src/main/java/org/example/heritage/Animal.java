package org.example.heritage;

import java.time.Year;

public class Animal {

    private String nom;
    private int age;
    private String couleur;

    public Animal(String nom, int age, String couleur) {
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void crier() {
        System.out.println("un animal n'a pas de cri");
    }

    public void manger() {
        System.out.println("l'animal mange");
    }

    protected int anneNaissance() {
        return Year.now().getValue() - age;
    }

    private int tailleNom(){
        return this.nom.length();
    }
    @Override
    public String toString() {
        return "Demo_Heritage{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}


