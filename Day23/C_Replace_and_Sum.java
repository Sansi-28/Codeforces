import java.util.*;

public class C_Replace_and_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n + 2];
            int[] b = new int[n + 2];

            for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
            for (int i = 1; i <= n; i++) b[i] = sc.nextInt();

            long[] s = new long[n + 2];
            long cur = 0;

            for (int i = n; i >= 1; i--) {
                int mx = Math.max(a[i], b[i]);
                cur = Math.max(cur, mx);
                s[i] = cur;
            }

            long[] pre = new long[n + 2];
            for (int i = 1; i <= n; i++) pre[i] = pre[i - 1] + s[i];

            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long ans = pre[r] - pre[l - 1];
                System.out.print(ans + (i + 1 == q ? "\n" : " "));
            }
        }
    }
}
