import java.util.*;

public class A_Ambitious_Kid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // if single test, replace with: int T = 1;
        solve(in);
        in.close();
    }

/*
	write your logic here:

*/

    static void solve(Scanner in) {

        int n = in.nextInt();

        int [] a = readIntArray(in, n);

        int min = Integer.MAX_VALUE;

        for(int e : a){
            min = (Math.abs(e) < min) ? Math.abs(e) : min;
        }

        System.out.println(min);
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