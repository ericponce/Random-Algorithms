package com.Eric;

import java.util.ArrayList;
import java.util.Arrays;

/**
   Produces a list of primes all the way up to desired limit (inclusive).
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
    
    /**
     * Produces the sum of all the primes up to and including the limit
     * @param limit highest possible number added to sum
     * @return sum of primes up to limit
     */
    public static long sumOfPrimes(int limit) {
        ArrayList<Integer> primes = sieveList(limit);
        long sum = 0;
        for (int e : primes) {
            sum += e;
        }
        return sum;
    }
    
    public static int numberOfFactors(int n) {
        Object [] primes = sieveList(n).toArray();
        int factorCount = 1, currentPrime = 0, temp = 0, a = 0;
        int [] primeFactors = new int[n];
        Arrays.fill(primeFactors, 0);
        while (n != 1) {
            
            a = (int) primes[currentPrime];
            if (n % a == 0) {
                n /= a;
                primeFactors[a]++;
                temp ++;
            } else {
                factorCount *= primeFactors[a] + 1;
                temp = 0;
                currentPrime++;
            }
            
            
        }
        
        factorCount *= primeFactors[a] + 1;
        
        return factorCount;
        
    }
}
