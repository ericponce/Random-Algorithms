import java.util.Scanner;
/**
 * Solves the 3N + 1 problem on the UVA online judge. Includes input/output code for solving
 * @author Eric Ponce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, max;
        while (in.hasNext()) {
            i = in.nextInt();
            j = in.nextInt();
            if (j < i) System.out.println(i + " " + j + " " + solveSet(j, i));
            else System.out.println(i + " " + j + " " + solveSet(i, j));
        }
    }
    
    public static int solveSet(int a, int b) {
        int maxCycle = 0;
        for (int i = a; i <= b; i++) {
            int t = solve(i);
            if (maxCycle < t) maxCycle = t;
        }
        return maxCycle;
    }
    
    public static int solve(int n) {
        int total = 0;
        while (n != 1) {
            total++;
            if (n % 2 != 0) n = (3 * n) + 1;
            else n = n / 2; 
        }
        total++;
        return total;
    }
}
