import java.util.*;

public class C_Odd_Process {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) solve(in);
        in.close();
    }

    static void solve(Scanner in) {
        int n = in.nextInt();
        int[] a = readIntArray(in, n);

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds  = new ArrayList<>();

        for (int v : a) {
            if ((v & 1) == 0) evens.add(v);
            else odds.add(v);
        }

        // sort descending to take largest for final block
        Collections.sort(evens, Collections.reverseOrder());
        Collections.sort(odds,  Collections.reverseOrder());

        int le = evens.size();
        int lo = odds.size();

        // prefix sums
        long[] E = new long[le + 1];
        long[] O = new long[lo + 1];
        for (int i = 0; i < le; i++) E[i+1] = E[i] + evens.get(i);
        for (int i = 0; i < lo; i++) O[i+1] = O[i] + odds.get(i);

        StringBuilder out = new StringBuilder();
        for (int k = 1; k <= n; k++) {
            long best = 0L;

            // If no odd available, best remains 0
            if (lo == 0) {
                out.append(0);
                if (k < n) out.append(' ');
                continue;
            }

            // We must include exactly one odd in final block.
            // Try e = number of evens in final block, 0..min(le, k-1)
            int maxE = Math.min(le, k - 1);
            for (int e = 0; e <= maxE; e++) {
                int b = 1 + e;               // final block size
                int t = k - b;               // filler picks
                if (t < 0) continue;

                int oddRem  = lo - 1;
                int evenRem = le - e;

                // Need even x in [0..min(oddRem, t)] with t - x <= evenRem
                int maxX = Math.min(oddRem, t);
                int minX = Math.max(0, t - evenRem);
                if (minX > maxX) continue;

                int firstEven = (minX % 2 == 0) ? minX : minX + 1;
                if (firstEven <= maxX) {
                    long cand = O[1] + E[e]; // O[1] is largest odd
                    if (cand > best) best = cand;
                }
            }

            out.append(best);
            if (k < n) out.append(' ');
        }
        System.out.println(out.toString());
    }

    static int[] readIntArray(Scanner in, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        return a;
    }
}
