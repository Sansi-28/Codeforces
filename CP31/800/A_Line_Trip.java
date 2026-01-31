import java.util.*;

public class A_Line_Trip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
	write your logic here:

*/

    static void solve(Scanner in) {

        int n = in.nextInt();

        int k = in.nextInt();

        int [] a = readIntArray(in, n);

        int pos = n-1;

        int maxDiff = a[0];

        for(int i = 0; i < n; i++){
            if(a[i] > k){
                pos = i-1;
            }

            if(i != 0){
                if(maxDiff < a[i] - a[i-1]){
                    maxDiff = a[i] - a[i-1];
                }
            }
        }

        if(pos != -1 && maxDiff < 2*(k - a[pos])){
            maxDiff = 2*(k - a[pos]);
        }else if (pos == -1){
            maxDiff = 2*k;
        }

        System.out.println(maxDiff);

        


        // example usage:
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

    static long gcd(long a, long b) {
        while (b != 0) { long t = a % b; a = b; b = t; }
        return Math.abs(a);
    }
}