import java.util.Arrays;

enum Jours{
    LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
}

public class App{
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println(Jours.LUNDI);

        int[] tab;
        tab = new int[10];
        tab[0] = 1;

        int[][] tab2;
        tab2 = new int[10][10];
        System.out.println(tab2[0][0]);

        int[][] grille = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(grille[1][2]);
        System.out.println(grille[2][1]);
        System.out.println(grille[0].length);
        System.out.println(Arrays.binarySearch(grille[0], 3));

        int[] tab3 = {1,7,9,4,11,6,14,8,3};
        Arrays.sort(tab3);
        for (int i = 0; i < tab3.length; i++) {
            System.out.println(tab3[i]);
        }
        System.out.println(Arrays.toString(tab3));

        // les chaînes de caractères
        String s = "Bonjour";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s + " " + "tout le monde");
        System.out.println("Partie de la chaine " + s.substring(0,4));
        // comparer la chaîne
        if(s.equals("Bonjour")){
            System.out.println("Les mots sont égaux");
        }else{
            System.out.println("Les mots ne sont pas égaux");
        }
        // comparer sans tenir compte de la casse
        if(s.equalsIgnoreCase("bonjour")){
            System.out.println("Les mots sont égaux");
        }else{
            System.out.println("Les mots ne sont pas égaux");
        }
        // réaliser un classement entre 2 chaînes
        String s2 = "Bonjour";
        if(s.compareTo(s2) > 0){
            System.out.println("s est plus grand que s2");
        }else if(s.compareTo(s2) < 0){
            System.out.println("s est plus petit que s2");
        }else{
            System.out.println("s est égal à s2");
        }
        // tester si la chaîne débute par une chaîne de caractère
        if(s.startsWith("Bon")){
            System.out.println("La chaîne débute par Bon");
        }
        // tester si la chaîne finit par une chaîne de caractère
        if(s.endsWith("jour")){
            System.out.println("La chaîne finit par jour");
        }
        // changer la casse
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // suprimer les espaces en début et fin de chaîne
        String s3 = "   Bonjour   ";
        System.out.println(s3.trim());

        // indexOf et lastIndexOf chercher une chaîne de caractère et donner l'index
        String s4 = "Bonjour tout le monde";
        System.out.println(s4.indexOf("tout"));
        System.out.println(s4.lastIndexOf("tout"));

        // remplacer une chaîne de caractère
        String s5 = s4.replace("tout", "tous");
        System.out.println(s5);

        // opération ternaire
        String s6 = s4.startsWith("Bon") ? "Bonjour" : "Bonsoir";

        // structure switch
        int n = 3;
        switch (n){
            case 1:
                System.out.println("n est égal à 1");
                break;
            case 2:
                System.out.println("n est égal à 2");
                break;
            case 3:
                System.out.println("n est égal à 3");
                break;
            default:
                System.out.println("n n'est pas égal à 1, 2 ou 3");
                break;
        }
        // structures de boucle while
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        // structures de boucle do while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }while (j < 10);
    }
    
}