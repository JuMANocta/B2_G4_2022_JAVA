package classJava;

public class Poisson extends EtreVivant{
    private String couleur;
    private String espece;

    // constructeur
    public Poisson(double taille, double poids, String couleur, String espece) {
        super(taille, poids);
        this.couleur = couleur;
        this.espece = espece;
    }

    // getter setter
    public String getCouleur() {
        return this.couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public String getEspece() {
        return this.espece;
    }
    public void setEspece(String espece) {
        this.espece = espece;
    }

    @Override
    public void respirer() {
        System.out.println("Je respire dans l'eau");
    }
}
