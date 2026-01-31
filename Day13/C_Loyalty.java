import java.util.*;

public class C_Loyalty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

    /*
    Write your logic in points:

    what we know:

    steps to solve:
    
    */

    static void solve(Scanner in) {

        int n = in.nextInt();

        int x = in.nextInt();

        int a [] = readIntArray(in, n);

        // Map<Integer, Integer> mp = new HashMap<>();

        // for(int i = 0; i < n; i++){
        //     mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
        // }

        Arrays.sort(a);

        long [] ans = new long [n];
        int l = 0, r = n-1, lvl = 0, indx = 0;
        long s = 0, b = 0;
        while(l <= r){
            if((s+a[r]) >= (lvl+1)*x){
                s += (long)a[r--];
                ans[indx++] = a[r+1];
                b += (long)a[r+1];
                lvl++;
            }else{
                s += (long)a[l++];
                ans[indx++] = a[l-1];
            }
        }

        System.out.println(b);

        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }

        System.out.println();


        
        // int n = in.nextInt();
        // int[] a = readIntArray(in, n);
        // System.out.println(answer);

        // ---- your solution starts here ----
    }

   // tiny helpers
    static int[] readIntArray(Scanner in, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        return a;
    }

    static long[] readLongArray(Scanner in, int n) {
        long [] a = new long [n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        return a;
    }

    static long gcd(long a, long b) {
        while (b != 0) { long t = a % b; a = b; b = t; }
        return Math.abs(a);
    }
    
}
