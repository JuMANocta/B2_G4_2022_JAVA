package classJava;

import java.util.GregorianCalendar;

public class Personne {
    private String nom;
    private String prenom;
    private GregorianCalendar dateNaissance;

    // constructeur
    public Personne(String nom, String prenom, GregorianCalendar dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public long calculerAge(GregorianCalendar dateNaissance) {
        long age;
        age = (new GregorianCalendar().getTimeInMillis() - dateNaissance.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        return age;
    }

    //getteur setteur
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public GregorianCalendar getDateNaissance() {
        return this.dateNaissance;
    }
    public void setDateNaissance(GregorianCalendar dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

}
