/**
 * Solves for the Greatest common devisor recursively and extremely fast.
 * Uses the Euclidean Algorithm for GCD.
 * @author Eric Ponce
 */
public class GCD {
    public static int GCD(int i, int j) {
        if (i == 0) return j;
        else if (j == 0) return i;
        else return (i > j) ? GCD(j, i - j) : GCD(i, j - i);
    }
}
