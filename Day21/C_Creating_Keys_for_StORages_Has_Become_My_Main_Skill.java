import java.util.*;

public class C_Creating_Keys_for_StORages_Has_Become_My_Main_Skill{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
    approach:
    - find p = least significant bit position where x has 0 (0-indexed)
    - k = 1<<p
    - m_max = min(k, n)
    - try m from m_max down to 0:
        or0 = OR of [0..m-1] = nextPow2(m)-1 (or 0 when m==0)
        if or0 == x -> feasible (no extra slot needed)
        else if n >= m+1 -> feasible (we can place x as extra)
    - construct array: 0..m-1, if or0!=x add x, fill rest with 0
*/

    static void solve(Scanner in) {
        int n = in.nextInt();
        long x = in.nextLong();

        int p = -1;
        for (int i = 0; i <= 30; i++) {
            if (((x >> i) & 1L) == 0L) {
                p = i;
                break;
            }
        }
        if (p == -1) p = 31;

        int k = 1 << p;
        int mmax = Math.min(k, n);

        int bestM = 0;
        long bestOr0 = 0;

        for (int m = mmax; m >= 0; m--) {
            long or0;
            if (m == 0) {
                or0 = 0L;
            } else {
                int r = 1;
                while (r < m) r <<= 1;
                or0 = (long) (r - 1);
            }
            if (or0 == x) {
                bestM = m;
                bestOr0 = or0;
                break;
            } else if (n >= m + 1) {
                bestM = m;
                bestOr0 = or0;
                break;
            }
        }

        List<Long> res = new ArrayList<>(n);
        for (int i = 0; i < bestM; i++) res.add((long) i);

        if (bestOr0 != x) {
            res.add(x);
        }

        while (res.size() < n) res.add(0L);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(' ');
            sb.append(res.get(i));
        }
        System.out.println(sb.toString());
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
