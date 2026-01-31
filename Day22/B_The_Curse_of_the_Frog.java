import java.util.*;

public class B_The_Curse_of_the_Frog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
	write your logic here:

    a b c


*/

    static void solve(Scanner in) {

        int n = in.nextInt();
                long x = in.nextLong();
                long sum = 0;
                long max = Long.MIN_VALUE;

                for (int i = 0; i < n; i++) {
                    long a = in.nextLong();
                    long b = in.nextLong();
                    long c = in.nextLong();
                    
                    sum += (b - 1) * a;
                    
                    long eff = a * b - c;
                    if (eff > max) max = eff;
                }

                if (sum >= x) {
                    System.out.println(0);
                } else if (max <= 0) {
                    System.out.println(-1);
                } else {
                    long need = x - sum;
                    System.out.println((need + max - 1) / max);
                }


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