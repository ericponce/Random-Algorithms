/**
 * The solution, without the input or output, to uVa Online Judge problem 11388.
 * @author Eric Ponce
 */
public class GCDLCM {
    /**
     * Returns the pair of numbers that have the GCD and LCM given. If no pair is found, -1 is given
     * The algorithm is based upon the fact that the LCM of a number is given by the equation :
     * LCM(a, b) = (a * b) / GCD(a, b), which can be algebraically changed to LCM(a, b) * GCD(a, b) = a * b.
     * Therefore by making sure that the LCM, which is always greater than the GCM, is divisible by the GCD, 
     * thus making the LCM a candidate for the number pair, the pair of numbers is determined to be the GCD and LCM. 
     * @param GCD The greatest common divisor of the number pair to be determined.
     * @param LCM The least common multiple of the number pair to be determined.
     * @return Either a string containing the number pair that fits the parameters, or -1.
     */
    public static String getNumbers(int GCD, int LCM) {
        if (LCM % GCD == 0) {
            return GCD + " " + LCM;
        } else {
            return "-1";
        }
    }
}
