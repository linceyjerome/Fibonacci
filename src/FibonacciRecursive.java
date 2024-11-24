/**
 * La classe FibonacciRecursive fournit des méthodes pour calculer et afficher des termes de la suite de
 * Fibonacci de manière récursive et pour mesurer le temps d'exécution de ces calculs.
 */

public class FibonacciRecursive {

    private static long debutCalcul;
    private static long finCalcul;

    /**
     * Calcule le n-ième terme de la suite de Fibonacci de manière récursive.
     *
     * @param n l'indice du terme à calculer (doit être un entier non négatif)
     * @return le n-ième terme de la suite de Fibonacci
     */
    public static long calculerTermeFibonacciRec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculerTermeFibonacciRec(n - 1) + calculerTermeFibonacciRec(n - 2);
        }
    }

    /**
     * Calcule et affiche un nombre de termes de la suite de Fibonacci donné en paramètre.
     * Elle fait appel à la méthode calculerTermeFibonacciRecursive pour calculer chaque terme.
     * Elle enregistre les moments du début et de la fin de son exécution.
     *
     * @param terms le nombre de termes de la suite de Fibonacci à calculer et à afficher
     */
    public static void calculerSuiteFibonacci(int terms) {
        debutCalcul = System.nanoTime(); //Enregistre le moment de début du calcul
        for (int i = 0; i < terms; i++)
            System.out.print(calculerTermeFibonacciRec(i) + (i < terms - 1 ? ", " : " "));
        finCalcul = System.nanoTime(); //Enregistre le moment de la fin du calcul
    }

    /**
     * Calcule la durée d'exécution du calcul de la suite de Fibonacci en microsecondes.
     *
     * @return la durée d'exécution en microsecondes
     */
    static long calculerDureeExecution(){
        return (finCalcul - debutCalcul) / 1000; //calcul de la durée d'exécution de la methode calculerSuiteFibonacci
    }
}
