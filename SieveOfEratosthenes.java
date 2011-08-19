import java.util.ArrayList;
import java.util.Arrays;

/**
 * The sieve of eratosthenes is a method for getting a list fo primes all 
 * the way up to a certain number.
 * 
 * @author Eric
 */
public class SieveOfEratosthenes {
    
    /**
     * Produces a list of prime number up to and possibly including the limit.
     * @param limit highest possible number in list
     * @return Integer ArrayList containing Sieve List.
     */
    public static ArrayList<Integer> sieveList(int limit) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        boolean [] primes = new boolean[limit + 1];
        Arrays.fill(primes, true);
        
        int currentPrime = 3;
        int t = 3;
        
        while (currentPrime <= limit) {
            if (primes[currentPrime] == true) {
                list.add(currentPrime);
                t += currentPrime;
                while (t <= limit) {
                    primes[t] = false;
                    t += currentPrime;        
                }
            }
            currentPrime += 2;
            t = currentPrime;  
        }
        return list;        
    }
}
