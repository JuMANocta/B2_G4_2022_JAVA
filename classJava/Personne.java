package classJava;

import java.time.LocalDate;

public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private static int nbInstance;


    // constructeur
    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        Personne.nbInstance++;
    }

    public long calculerAge(LocalDate dateNaissance) {
        LocalDate toDay = LocalDate.now();
        return dateNaissance.until(toDay).getYears();
    }

    public void afficher(){
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Age : " + calculerAge(this.dateNaissance) + " ans");
        System.out.println("Nombre d'instance : " + Personne.getNbInstance());
    }

    public void afficher(boolean fr){
        if(fr){
            afficher();
        } else {
            System.out.println("Lastname : " + this.nom);
            System.out.println("Firstname : " + this.prenom);
            System.out.println("Age : " + calculerAge(this.dateNaissance) + " years");
        }
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
    public LocalDate getDateNaissance() {
        return this.dateNaissance;
    }
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public static int getNbInstance() {
        return Personne.nbInstance;
    }

    // exemple d'override
    @Override
    protected void finalize() {
        System.out.println("Personne.finalize()");
    }
}
