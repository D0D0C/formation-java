package org.example.base;

public class ApplicationFilm {
    public static void main(String[] args) {

        Film film1 = new Film("La haine", "Mathieu Kasovitz","1995-05-31", "Drame");
        Film film2 = new Film("Avatar2", "James cameron","2022-12-14", "action");

        System.out.println("Film1");
        System.out.println(film1.toString());
        System.out.println();

        System.out.println("Film2");
        System.out.println(film2.toString());

    }
}
