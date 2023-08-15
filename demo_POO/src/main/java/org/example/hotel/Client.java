package Hotel;

public class Client {

    private int clientID;

    private String nom;

    private String prenom;

    private String numTel;

    private static int nbrClient = 0;

    public Client(int clientID, String nom, String prenom, String numTel) {
        this.clientID = clientID;
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public static int getNbrClient() {
        return nbrClient;
    }

    public static void setNbrClient(int nbrClient) {
        Client.nbrClient = nbrClient;
    }

    @Override
    public String toString() {
        return clientID + " : "+
                "nom = " + nom +
                ", prenom = " + prenom +
                ", phone = " + numTel +
                '.';
    }
}






