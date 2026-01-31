import java.util.*;

public class D_OutOfMemoryError {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Check if input exists to prevent errors on empty files
        if (in.hasNext()) {
            int T = in.nextInt();
            while (T-- > 0) solve(in);
        }
        in.close();
    }

    static void solve(Scanner in) {
        int n = in.nextInt();
        int m = in.nextInt();
        long h = in.nextLong(); // Use long for h to avoid overflow issues

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        // Read all operations first
        // We use separate arrays for indices and values for simplicity
        int[] b = new int[m];
        long[] c = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
            c[i] = in.nextLong();
        }
        long[] diff = new long[n];
        
        int[] t = new int[n];
        int stackTop = 0;

        for (int i = 0; i < m; i++) {
            int idx = b[i] - 1;
            long val = c[i];

            if (a[idx] + diff[idx] + val > h) {
                while (stackTop > 0) {
                    int modifiedIdx = t[--stackTop];
                    diff[modifiedIdx] = 0;
                }
            } else {
                if (val > 0) {
                    if (diff[idx] == 0) {
                        t[stackTop++] = idx;
                    }
                    diff[idx] += val;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i] + diff[i]).append(" ");
        }
        System.out.println(sb);
    }

    static int[] readIntArray(Scanner in, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        return a;
    }
}