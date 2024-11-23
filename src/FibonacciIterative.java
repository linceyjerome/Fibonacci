public class FibonacciIterative {

    private static long debutCalcul;
    private static long finCalcul;

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
    static long calculerDureeExecution(){
        return (finCalcul - debutCalcul) / 1000;
    }
}
