
import java.util.*;

public class A_Divisible_Permutation  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // if single test, replace with: int T = 1;
        while (T-- > 0) solve(in);
        in.close();
    }

/*
	write your logic here:
    5
    -> diff = 1 2 3 4 5
    -> ans =  3 2 4 1 5

*/

    static void solve(Scanner in) {

        int n = in.nextInt();

        int [] ans = new int[n];

        ans[n-1] = n;

        for(int i = n-2; i >= 0; i--){

            if(ans[i+1] + i+1 < n){
                ans[i] = ans[i+1] + i+1;
            }else{
                ans[i] = ans[i+1] - (i+1);
            }
        }

        for(int r : ans){
            System.out.print(r + " ");
        }

        System.out.println();


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