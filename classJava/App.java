package classJava;

public class App {
    public static void main(String[] args) {
        System.out.println("App.java ==> Classe JAVA");

        Personne p = new Personne("Dupont", "Jean");
        System.out.println(p.getNom() + " " + p.getPrenom());
    }
}
