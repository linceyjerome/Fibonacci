public class FibonacciRecursive {

    private static long debutCalcul;
    private static long finCalcul;

    public static long calculerTermeFibonacciRec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculerTermeFibonacciRec(n - 1) + calculerTermeFibonacciRec(n - 2);
        }
    }

    public static void calculerSuiteFibonacci(int terms) {
        debutCalcul = System.nanoTime();
        for (int i = 0; i < terms; i++)
            System.out.print(calculerTermeFibonacciRec(i) + (i < terms - 1 ? ", " : " "));
        finCalcul = System.nanoTime();
    }
    static long calculerDureeExecution(){
        return (finCalcul - debutCalcul) / 1000;
    }
}
