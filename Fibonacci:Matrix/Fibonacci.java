/**
 * Calculates the nth Fibonacci number using different methods.
 * Fibonacci numbers are numbers formed by adding the two previous Fibonacci numbers, starting with 0 and 1.
 * So, Fib(3) = Fib(2) + Fib(1) = (0 + 1) + (1).
 * @author Eric
 */
public class Fibonacci {

    /**
     * The easiest, simplest recursive algorithm for calculating the nth Fibonacci number
     * Slow and wasteful.
     * @param n The Fibonacci number to calculate
     * @return the nth Fibonacci number
     */
    public static int recursiveFibonacci(int n) {
        if (n == 1 || n == 0) return n;
        else return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
    
    /**
     * An algorithm which uses matrices to compute the nth Fibonacci number.
     * The matrix {{1, 1}, {1, 0}}^n is equal to Fibonacci(n);
     * @param n The Fibonacci number to calculate
     * @return the nth Fibonacci number.
     */
    public static int matrixFibonacci(int n) {
        int [][] m = {{1, 1}, {1, 0}};
        return Matrix.exponentiateMatrix(m, n)[0][1];
    }
}
