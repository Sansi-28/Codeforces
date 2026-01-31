package Day17;

import java.util.*;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        StringBuilder out = new StringBuilder();
        while (T-- > 0) {
            int n = in.nextInt();
            ArrayList<Integer>[] g = new ArrayList[n+1];
            for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();
            for (int i = 0; i < n-1; i++) {
                int u = in.nextInt(), v = in.nextInt();
                g[u].add(v);
                g[v].add(u);
            }
            int[] parent = new int[n+1];
            Arrays.fill(parent, -1);
            int[] order = new int[n];
            int idx = 0;
            Deque<Integer> st = new ArrayDeque<>();
            st.push(1);
            parent[1] = 0;
            while (!st.isEmpty()) {
                int v = st.pop();
                order[idx++] = v;
                for (int u : g[v]) {
                    if (u == parent[v]) continue;
                    parent[u] = v;
                    st.push(u);
                }
            }
            boolean[][] can = new boolean[n+1][3];
            for (int i = n-1; i >= 0; i--) {
                int v = order[i];
                int childCount = 0;
                for (int u : g[v]) if (u != parent[v]) childCount++;

                if (childCount == 0) {
                    can[v][1] = true;
                    continue;
                }

                boolean[] cur = new boolean[3];
                cur[0] = true;
                for (int u : g[v]) {
                    if (u == parent[v]) continue;
                    boolean[] nxt = new boolean[3];
                    for (int r = 0; r < 3; r++) if (cur[r]) {
                        for (int s = 0; s < 3; s++) if (can[u][s]) {
                            nxt[(r + s) % 3] = true;
                        }
                    }
                    cur = nxt;
                }
                can[v][1] = true;
                for (int r = 0; r < 3; r++) if (cur[r]) can[v][r] = true;
            }

            out.append(can[1][0] ? "YES\n" : "NO\n");
        }
        System.out.print(out.toString());
        in.close();
    }
}
