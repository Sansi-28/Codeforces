import java.util.*;

public class E_Product_Queries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        final int INF = 1_000_000_000;

        while (t-- > 0) {

            int n = sc.nextInt();

            boolean[] has = new boolean[n + 1];

            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                if (x <= n) has[x] = true;
            }


            ArrayList<Integer> vals = new ArrayList<>();

            for (int v = 1; v <= n; v++) if (has[v]) vals.add(v);

            int[] dp = new int[n + 1];

            Arrays.fill(dp, INF);

            dp[1] = 0;

            for (int k = 1; k <= n; k++) {


                if (dp[k] == INF) continue;

                for (int v : vals) {

                    if (v > n / k) break;

                    int m = k * v;

                    if (dp[m] > dp[k] + 1) dp[m] = dp[k] + 1;
                }
            }

            for (int i = 1; i <= n; i++) {

                int ans;

                if (i == 1) ans = has[1] ? 1 : -1;

                else ans = (dp[i] == INF) ? -1 : dp[i];

                sb.append(ans).append(i == n ? "\n" : " ");

            }
        }

        System.out.print(sb.toString());

        sc.close();
        
    }
}
