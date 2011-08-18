/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sieveoferatosthenes;

import java.util.Arrays;
import java.util.Scanner;

/**
   Produces a list of primes all the way up to desired limit (inclusive).
 * @author Eric
 */
public class SieveOfEratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Primes up to: ");
        Scanner in = new Scanner(System.in);
        
        int limit = in.nextInt();
        boolean [] primes = new boolean[limit + 1];
        Arrays.fill(primes, true);
        
        int current = 3;
        int t = 3;
        
        while (current <= limit) {
            if (primes[current] == true) {
                t += current;
                while (t <= limit) {
                    primes[t] = false;
                    t += current;        
                }
            }
            current += 2;
            t = current;  
        }
        
        t = 3;
        System.out.println("2");
        while (t <= limit) {
            if (primes[t] == true) System.out.println(t);
            t += 2;
        }
        
    }
}
