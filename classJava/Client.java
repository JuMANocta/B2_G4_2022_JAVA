package classJava;

import java.time.LocalDate;

public class Client extends Personne{
    // déterminer le type de client
    // P -> particulier | E-> entreprise | A -> administration
    private char type;

    public Client(String nom, String prenom, LocalDate dateNaissance, char type) {
        super(nom, prenom, dateNaissance);
        this.type = type;
    }

    public void afficher(){
        System.out.println("Type : " + this.getType());
    }

    //getter setter
    public char getType() {
        return this.type;
    }
    public void setType(char type) {
        this.type = type;
    }
}
