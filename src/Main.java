import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

       /* static List<Long> calculerSerieFibonacciIter(int terms) {
            long a = 0;
            long b = 1;
            long nextTerm;
            List<Long> result = new ArrayList<>();
            for (int i = 0; i < terms; i++) {
                result.add(a);
                nextTerm = a + b;
                a = b;
                b = nextTerm;
            }
            return result;
        }*/

    static void calculerSerieFibonacciIter(int terms) {
        long a = 0;
        long b = 1;
        long nextTerm;

        
        for (int i = 0; i < terms; i++) {
            System.out.print(a + ", ");
            nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

    }

        public static long fibonacciRecursive(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
            }
        }

        /*public static List<Long> calculerSerieFibonacciRecursive(int terms) {
            List<Long> result = new ArrayList<>();
            for (int i = 0; i < terms; i++) {
                result.add(fibonacciRecursive(i));
            }
            return result;
        }*/
        public static void calculerSerieFibonacciRecursive(int terms) {

            for (int i = 0; i < terms; i++) {

                System.out.print(fibonacciRecursive(i) + " ,");
            }

        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = -1; // Initialisation à une valeur invalide

            // Demande à l'utilisateur d'entrer un nombre tant qu'il est négatif
            while (n < 0) {
                System.out.println("Entrer le nombre de termes à calculer (entier positif) : ");
                try {
                    n = sc.nextInt();

                    // Vérification de l'entrée
                    if (n < 0) {
                        System.out.println("Erreur : Il faut entrer un entier positif.");
                    }
                } catch (Exception e) {
                    System.out.println("Erreur : Il faut entrer un entier valide.");
                    sc.next(); // Consomme l'entrée invalide
                }
            }

            // Calcul itératif
            System.out.println("\n------------------ Série de Fibonacci - Itérative ---------------------");
            double heureDebut = System.nanoTime();
            //System.out.println("F" + n + " = " + calculerSerieFibonacciIter(n));
            calculerSerieFibonacciIter(n);
            double heureFin = System.nanoTime();
            double dureeIter = (heureFin - heureDebut) / 1000;
            System.out.println("\nDurée du calcul = " + dureeIter + " Microsecondes");

            // Calcul récursif
            System.out.println("\n------------------ Série de Fibonacci - Récursive ---------------------");
            heureDebut = System.nanoTime();
            //System.out.println("F" + n + " = " + calculerSerieFibonacciRecursive(n));
            calculerSerieFibonacciRecursive(n);
            heureFin = System.nanoTime();
            double dureeRec = (heureFin - heureDebut) / 1000;
            System.out.println("\nDurée du calcul = " + dureeRec + " Microsecondes");


            sc.close(); // Ferme le scanner
    }
}