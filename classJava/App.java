package classJava;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        System.out.println("App.java ==> Classe JAVA");

        Personne p = new Personne("Dupont", "Jean", LocalDate.of(1980, 3, 29));
        Personne p2 = new Personne("Dupont", "Jean", LocalDate.of(1980, 3, 29));
        System.out.println(p.getNom() + " " + p.getPrenom() + " " + p.calculerAge(p.getDateNaissance()));
        p.afficher();
        p.afficher(false);

        Client c = new Client("Dupont", "Jean", LocalDate.of(1980, 3, 29), 'P');
        Client c2 = new Client("Dupond", "Yves", LocalDate.of(1983, 3, 29), 'P');
        c.afficher();
    }
}
