import java.util.Scanner;

/**
 * La classe Main contient le point d'entrée de l'application et gère l'interaction utilisateur
 * pour le calcul des termes de la suite de Fibonacci en utilisant des méthodes itératives et récursives.
 */
public class Main {

    /**
     * Le point d'entrée de l'application.
     *
     * @param args les arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int termes = -1; // Initialisation à une valeur invalide

        // Demande à l'utilisateur d'entrer un nombre tant qu'il est négatif
        while (termes < 0) {
            System.out.println("Entrer le nombre de termes à calculer (entier positif) : ");
            try {
                termes = sc.nextInt();

                // Vérification de l'entrée
                if (termes < 0) {
                    System.out.println("Erreur : Il faut entrer un entier positif.");
                }
            } catch (Exception e) {
                System.out.println("Erreur : Il faut entrer un entier valide.");
                sc.next(); // Consomme l'entrée invalide
            }
        }

        // Calcul itératif
        System.out.println("\n------------------ Série de Fibonacci - Itérative ---------------------");
        FibonacciIterative.calculerSuiteFibonacci(termes);
        System.out.println("\nDuré de traitement de la methode itérative");
        long dureeIterative = FibonacciIterative.calculerDureeExecution();
        System.out.println(dureeIterative + " microsecondes");

        // Calcul récursif
        System.out.println("\n------------------ Série de Fibonacci - Recursive ---------------------");
        FibonacciRecursive.calculerSuiteFibonacci(termes);
        System.out.println("\nDurée de traitement de la methode récursive");
        long dureeRecursive = FibonacciRecursive.calculerDureeExecution();
        System.out.println(dureeRecursive + " microsecondes");

        System.out.println("\n------------------ Comparaison des durées de traitement ---------------------");
        if (dureeRecursive < dureeIterative) {
            System.out.println("La méthode récursive a été plus rapide");
        } else if (dureeRecursive > dureeIterative) {
            System.out.println("La méthode itérative a été plus rapide");
        } else {
            System.out.println("La durée de traitement est la même pour les deux méthodes");
        }

        sc.close(); // Ferme le scanner
    }
}