import java.util.*;

public class F_BattleCows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) sol(in);
        in.close();
    }

    static void sol(Scanner in) {
        int n = in.nextInt();
        int q = in.nextInt();

        int sz = 1 << n;
        int[] a = new int[sz];
        int[] p = new int[sz + 1];

        p[0] = 0;
        for (int i = 0; i < sz; i++) {
            a[i] = in.nextInt();
            p[i + 1] = p[i] ^ a[i];
        }

        while (q-- > 0) {
            int b = in.nextInt() - 1;
            int c = in.nextInt();

            int d = a[b] ^ c;
            int ans = 0;
            int bs = 1;

            for (int k = 0; k < n; k++) {
                int blk = b / bs;
                boolean l = (blk & 1) == 0;

                if (l) {
                    int ls = blk * bs;
                    int rs = ls + bs;

                    int sl = (p[ls + bs] ^ p[ls]) ^ d;
                    int sr = (p[rs + bs] ^ p[rs]);

                    if (sl < sr) ans += bs;
                } else {
                    int rs = blk * bs;
                    int ls = rs - bs;

                    int sl = (p[ls + bs] ^ p[ls]);
                    int sr = (p[rs + bs] ^ p[rs]) ^ d;

                    if (sl >= sr) ans += bs;
                }
                bs <<= 1;
            }
            System.out.println(ans);
        }
    }
}
