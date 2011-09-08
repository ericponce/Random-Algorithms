/**
 * Computes the LCM very efficiently and quickly using the formula LCM(a, b) = (a * b)/GCD(a, b).
 * @author Eric Ponce
 */
public class LCM {
    
    public static int LCM(int i, int j) {
        return (i * j) / GCD(i, j);
    }
    
    public static int GCD(int i, int j) {
        if (j == 0) return i;
        else
            return GCD(j, i%j);
    }
}
