import java.util.*;

public class A_Serval_and_Mocha_s_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
	write your logic here:

*/

    static void solve(Scanner in) {

        int n = in.nextInt();

        int [] a = readIntArray(in, n);

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                long GCD = gcd(a[i], a[j]);
                if(GCD <= 2){
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");



        
        // example usage:
        // int n = in.nextInt();
        // int[] a = readIntArray(in, n);
        // System.out.println(answer);

        // ---- your solution starts here ----
    }

    // tiny helpers
    static int[] readIntArray(Scanner in, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        return a;
    }

    static long gcd(long a, long b) {
        while (b != 0) { long t = a % b; a = b; b = t; }
        return Math.abs(a);
    }
}