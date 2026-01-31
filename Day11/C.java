package Day11;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            long[] pref = new long[n];      
            long[] prefAbs = new long[n];  

            pref[0] = a[0];
            prefAbs[0] = Math.abs(a[0]);

            for (int i = 1; i < n; i++) {
                pref[i] = pref[i - 1] + a[i];
                prefAbs[i] = prefAbs[i - 1] + Math.abs(a[i]);
            }

            long total = pref[n - 1];
            long best = Long.MIN_VALUE;

            
            best = Math.max(best, a[0] - total);

            long extra = 2L * Math.min(0L, a[0]);

        
            for (int k = 1; k < n; k++) {
                long sumAbsLeft = prefAbs[k - 1];
                long prefK = pref[k];
                long Xk = sumAbsLeft + prefK - total + extra;
                best = Math.max(best, Xk);
            }

            System.out.println(best);
        }

        sc.close();
    }
    
}
