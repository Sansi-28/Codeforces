import java.util.*;

public class E_The_Robotic_Rush {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) sol(in);
        in.close();
    }

    static void sol(Scanner in) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int[] a = rd(in, n);
        int[] b = rd(in, m);
        String s = in.next();

        Arrays.sort(b);

        long[] l = new long[n];
        long[] r = new long[n];
        int lc = 0, rc = 0;

        for (int i = 0; i < n; i++) {
            int p = a[i];
            int id = Arrays.binarySearch(b, p);
            int ins = id < 0 ? -id - 1 : id;

            if (ins > 0) {
                long d = (long) p - b[ins - 1];
                l[lc++] = (d << 32) | i;
            }
            if (ins < m) {
                long d = (long) b[ins] - p;
                r[rc++] = (d << 32) | i;
            }
        }

        Arrays.sort(l, 0, lc);
        Arrays.sort(r, 0, rc);

        int cur = 0, mn = 0, mx = 0;
        int pl = 0, pr = 0;
        int al = n;
        boolean[] d = new boolean[n];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            cur += (s.charAt(i) == 'L' ? -1 : 1);

            if (cur < mn) mn = cur;
            if (cur > mx) mx = cur;

            long tl = -mn;
            long tr = mx;

            while (pl < lc && (l[pl] >>> 32) <= tl) {
                int id = (int) l[pl++];
                if (!d[id]) { d[id] = true; al--; }
            }

            while (pr < rc && (r[pr] >>> 32) <= tr) {
                int id = (int) r[pr++];
                if (!d[id]) { d[id] = true; al--; }
            }

            sb.append(al).append(' ');
        }

        System.out.println(sb);
    }

    static int[] rd(Scanner in, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        return a;
    }
}
