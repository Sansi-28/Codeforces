import java.util.*;

public class C_Shifted_MEX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

    static void solve(Scanner in) {
        int n = in.nextInt();
        int[] a = readIntArray(in, n);
        Arrays.sort(a);

        int cnt = 1;
        int mx = 1; 

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {

                continue;
            } else if (a[i] == a[i - 1] + 1) {
                // consecutive
                cnt++;
            } else {
               
                if (cnt > mx) mx = cnt;
                cnt = 1;
            }
        }
        if (cnt > mx) mx = cnt;

        System.out.println(mx);
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
