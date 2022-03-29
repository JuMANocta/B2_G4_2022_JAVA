package classJava;

import java.time.LocalDate;

public class Personne extends EtreVivant implements Classable {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private static int nbInstance;

    // constructeur
    public Personne(double taille, double poids, String nom, String prenom, LocalDate dateNaissance){
        super(taille, poids);
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

    @Override
    public void respirer() {
        System.out.println("Respirer de l'air");
    }

    @Override
    public int comparer(Object o) {
        if(o instanceof Personne){
            Personne p = (Personne) o;
            if(this.getTaille() > p.getTaille()){
                return SUPERIEUR;
            } else if(this.getTaille() < p.getTaille()){
                return INFERIEUR;
            } else {
                return EGAL;
            }
        } else {
            return ERREUR;
        }
    }
}
