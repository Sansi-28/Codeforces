package Day17;

import java.util.*;

public class C {
    static final int INF = Integer.MAX_VALUE / 4;
    static Map<Long, Integer> dp;
    static long K;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

    static int helper(long n) {
        if (n < K) return INF;
        if (n == K) return 0;
        if (dp.containsKey(n)) return dp.get(n);

        long l = n / 2;
        long r = n - l;
        if (r < K) {
            dp.put(n, INF);
            return INF;
        }

        int res;
        if ((n & 1) == 0) {
            int sub = helper(l);
            res = (sub >= INF) ? INF : 1 + sub;
        } else {
            int left = helper(l);
            int right = helper(r);
            int best = Math.min(left, right);
            res = (best >= INF) ? INF : 1 + best;
        }

        dp.put(n, res);
        return res;
    }

    static void solve(Scanner in) {
        long n = in.nextLong();
        long k = in.nextLong();

        K = k;
        dp = new HashMap<>();

        int ans = helper(n);
        if (ans >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
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
