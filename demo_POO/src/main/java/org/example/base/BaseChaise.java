package org.example.base;
public class BaseChaise {
    public static void main(String[] args) {

        Chaise chaise1 = new Chaise(4,"chêne", "bleu", 14.4);
        Chaise chaise2 = new Chaise(3,"bambou", "gris", 130.99);
        Chaise chaise3 = new Chaise(1,"métal", "orange", 76.25);
        System.out.println("Chaise1");
        System.out.println(chaise1.toString());
        System.out.println("Chaise2");
        System.out.println(chaise2.toString());
        System.out.println("Chaise3");
        System.out.println(chaise3.toString());
    }
           }
