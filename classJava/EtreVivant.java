package classJava;

public abstract class EtreVivant {
    private double taille;
    private double poids;

    public EtreVivant(double taille, double poids) {
        this.taille = taille;
        this.poids = poids;
    }

    public void seDeplacer(){
        System.out.println("Je me deplace");
    }
    public abstract void respirer();

    public void manger(){
        System.out.println("Je mange");
    }
    public void dormir(){
        System.out.println("Je dors");
    }
    public void seReproduire(){
        System.out.println("Je se reproduit");
    }
    final public void mourrir(){
        System.out.println("Je meurs");
    }


    //setter
    public void setTaille(double taille) {
        this.taille = taille;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }
    //getter
    public double getTaille() {
        return this.taille;
    }
    public double getPoids() {
        return this.poids;
    }
}