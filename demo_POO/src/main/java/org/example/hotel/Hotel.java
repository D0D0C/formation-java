package Hotel;

import java.util.ArrayList;


public class Hotel<ClientHotel> {

    private ArrayList<Client> listeClients;

    private ArrayList<Chambre> listeChambres;

    private ArrayList<Reservation> listeReservations;

    private String nom;

    public Hotel(String nom) {
        this.nom = nom;
        this.listeClients = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }


     public int rechercherClientParID(int clientID) {
        for (Client client : listeClients) {
                if (client.getClientID() == clientID) {
                     return (clientID) ;
                 }
                }
                 return clientID;
         }
     }




