package Day17;

import java.util.*;

public class D {
    static long[][] C = new long[35][35];

    public static void main(String[] args) {
        buildComb();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) solve(in);
        in.close();
    }

    static void buildComb() {
        for (int i = 0; i < C.length; i++) {
            C[i][0] = C[i][i] = 1;
            for (int j = 1; j < i; j++) {
                C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        }
    }

    static void solve(Scanner in) {
        long n = in.nextLong(); // guaranteed n = 2^d
        long k = in.nextLong();

        // floorlog = floor(log2(n))
        int floorlog = 63 - Long.numberOfLeadingZeros(n);
        int Lmax = floorlog + 1; // maximum bit-length present (only one number has this length: n itself)

        long cntLeq = 0;

        // handle full blocks for lengths 1 .. floorlog (these are fully contained in [1..n-1])
        for (int L = 1; L <= floorlog; L++) {
            int restLen = L - 1;
            long t = k - L; // we need popcount(rest) <= t
            if (t < 0) continue;
            if (t >= restLen) {
                cntLeq += (1L << restLen);
            } else {
                int upto = (int) t;
                long sum = 0;
                for (int i = 0; i <= upto; i++) sum += C[restLen][i];
                cntLeq += sum;
            }
        }

        // handle the top length Lmax = floorlog+1: only a = n (rest = 0) belongs here
        // For that number popcount(rest)=0, so it's counted if k - Lmax >= 0  <=> k >= Lmax
        if (k >= Lmax) cntLeq += 1;

        long ans = n - cntLeq;
        if (ans < 0) ans = 0; // defensive (shouldn't be needed now)
        System.out.println(ans);
    }

    // tiny helpers (kept in case you use them later)
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
