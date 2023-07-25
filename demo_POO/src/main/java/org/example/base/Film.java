package org.example.base;

public class Film {
    private String titre;
    private String realisateur;
    private String annee;
    private String genre;

    public Film(String titre, String realisateur, String annee, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.annee = annee;
        this.genre = genre;
    }
    public String getTitre() {
        return titre;
    }
    public String getRealisateur() {
        return realisateur;
    }
    public String getAnnee() {
        return annee;
    }
    public String getGenre() {
        return genre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }
    public void setAnnee(String annee) {
        this.annee = annee;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "titre= " + titre+"," + " realisateur= " + realisateur+"," + " date de sortie= " + annee+"," + " genre= " + genre;
    }
}

