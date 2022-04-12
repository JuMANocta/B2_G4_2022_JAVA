package classJava;

import java.time.LocalDate;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("App.java ==> Classe JAVA");

        Personne p = new Personne(180.0, 90.0, "Dupont", "Jean", LocalDate.of(1980, 3, 29));
        Personne p2 = new Personne(180.0, 90.0, "Dupont", "Jean", LocalDate.of(1980, 3, 29));
        System.out.println(p.getNom() + " " + p.getPrenom() + " " + p.calculerAge(p.getDateNaissance()));
        p.afficher();
        p.afficher(false);

        Client c = new Client(179.0, 90.0, "Dupont", "Jean", LocalDate.of(1980, 3, 29), 'P');
        Client c2 = new Client(180.0, 90.0, "Dupond", "Yves", LocalDate.of(1983, 3, 29), 'P');
        c.afficher();
        c.mourrir();
        Poisson poisson = new Poisson(1.0, 1.0, "bleu", "poisson");
        poisson.respirer();
        System.out.println(c2.comparer(c));
    }

    public void testFournisseur(){
        Fournisseur f1 = new Fournisseur("nextIp");
        Fournisseur f2 = new Fournisseur("IpNext");
        Fournisseur f3 = new Fournisseur("Aco");

        System.out.println(f1.compareTo(f2));

        Fournisseur[] fournisseurs = new Fournisseur[3];
        fournisseurs[0] = f1;
        fournisseurs[1] = f2;
        fournisseurs[2] = f3;
        Arrays.sort(fournisseurs);
    }
}
