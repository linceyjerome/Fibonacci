/**
 * La classe FibonacciIterative fournit une méthode pour calculer et afficher les termes de la suite de Fibonacci
 * de manière itérative, ainsi qu'une méthode pour mesurer le temps d'exécution de ces calculs.
 */
public class FibonacciIterative {

    private static long debutCalcul;
    private static long finCalcul;

    /**
     * Calcule et affiche les termes de la suite de Fibonacci jusqu'à un nombre spécifié donné en paramètre.
     * Elle enregistre les moments du début et de la fin de son exécution.
     *
     * @param terms le nombre de termes de la suite de Fibonacci à calculer et à afficher
     */
    static void calculerSuiteFibonacci(int terms) {
        debutCalcul = System.nanoTime();
        long a = 0;
        long b = 1;
        long nextTerm;
        for (int i = 0; i < terms; i++) {
            System.out.print(a + (i < terms - 1 ? ", " : " "));
            nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        finCalcul = System.nanoTime();
    }

    /**
     * Calcule la durée d'exécution du calcul de la suite de Fibonacci en microsecondes.
     *
     * @return la durée d'exécution en microsecondes
     */
    static long calculerDureeExecution(){
        return (finCalcul - debutCalcul) / 1000;
    }
}
