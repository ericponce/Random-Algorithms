/**
 * Solves for the Greatest common devisor recursively and extremely fast.
 * @author Eric Ponce
 */
public class GCD {    
    public static int GCD(int i, int j) {
        if (j == 0) return i;
        else return GCD(j, i%j);
    }
}
