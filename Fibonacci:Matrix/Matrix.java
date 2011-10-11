/**
 * A static function class for some simple matrix arithmetic.
 * Uses 2-D integer arrays
 * @author Eric Ponce
 */
public class Matrix {

    /**
     * Returns the identity matrix given the width of the matrix.
     * An identity is the equivalent of multiplying a number by one. The number
     * remains the same. It is formed by creating a diagonal of ones and then populating the remaining
     * spots with zeros, so an identity matrix with a width and height of 3 is: <br>
     * 1 0 0 <br>
     * 0 1 0 <br>
     * 0 0 1
     * @param n The height and width of the identity matrix
     * @return An identity matrix with the given height and width stored in a 2-D integer array.
     */
    public static int[][] getIdentityMatrix(int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            m[i][i] = 1;
        }
        return m;
    }

    /**
     * Multiplies two matrices together
     * @param a First matrix
     * @param b Second matrix
     * @return  The product of the multiplication
     */
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] m = new int[a.length][b[0].length];
        for (int z = 0; z < a.length; z++) {
            for (int x = 0; x < b[0].length; x++) {
                for (int c = 0; c < a[0].length; c++) {
                    m[z][x] += a[z][c] * b[c][x];
                }
            }
        }
        return m;
    }

    /**
     * Exponentiates a matrix through a divide-and-conquer and method.
     * using the the idea that x^4 = (x^2)^2 and that x^3 = x*x^2. You can find the
     * exponentiated matrix fairly quickly, with, at most, n + 1 calls to the multiplyMatrices method(?).
     * @param base the Matrix to be exponentiated
     * @param n the exponent
     * @return The exponentiated matrix stored in a 2-D integer array
     */
    public static int[][] exponentiateMatrix(int[][] base, int n) {
        if (n == 0) {
            return getIdentityMatrix(base.length);
        } else if (n == 1) {
            return base;
        } else if (n % 2 == 0) {
            int[][] temp = exponentiateMatrix(base, n / 2);
            return multiplyMatrices(temp, temp);
        } else {
            int[][] temp = exponentiateMatrix(base, n - 1);
            return multiplyMatrices(base, temp);
        }

    }
}
