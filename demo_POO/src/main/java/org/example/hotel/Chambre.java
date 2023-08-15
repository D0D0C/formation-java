package Hotel;

public class Chambre {

    private int numChambre;

    private boolean statChambre;

    private int nbrLits;

    public double tarif;

    public Chambre(int numChambre, boolean statChambre, int nbrLits, double tarif) {
        this.numChambre = numChambre;
        this.statChambre = statChambre;
        this.nbrLits = nbrLits;
        this.tarif = tarif;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    public boolean isStatChambre() {
        return statChambre;
    }

    public void setStatChambre(boolean statChambre) {
        this.statChambre = statChambre;
    }

    public int getNbrLits() {
        return nbrLits;
    }

    public void setNbrLits(int nbrLits) {
        this.nbrLits = nbrLits;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }


    @Override
    public String toString() {
        return "Chambre n°" + numChambre + " : statut : " +
                  " nombre de lits : "
                + nbrLits + ", tarifs : " + tarif;
    }
}




