package classJava;

public class Fournisseur implements Comparable{
    private String raisonSocial;

    //constructeur
    public Fournisseur(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    @Override
    public int compareTo(Object o) {
        Fournisseur f = (Fournisseur) o;
        return this.raisonSocial.compareTo(f.raisonSocial);
    }
}
