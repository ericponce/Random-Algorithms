/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sieveoferatosthenes;

import java.util.ArrayList;
import java.util.Arrays;

/**
   Produces a list of primes all the way up to desired limit (inclusive).
 * @author Eric
 */
public class SieveOfEratosthenes {

    /**
     * @param args the command line arguments
     */
    
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
        
        int current = 3;
        int t = 3;
        
        while (current <= limit) {
            if (primes[current] == true) {
                list.add(current);
                t += current;
                while (t <= limit) {
                    primes[t] = false;
                    t += current;        
                }
            }
            current += 2;
            t = current;  
        }
        return list;        
    }
}
