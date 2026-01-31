import java.util.*;

public class B_Sequence_Game{
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

        int [] a = readIntArray(in, n);

        int [] ans = new int [2*(n-1)+1];

        int indx = 0;

        for(int i = 0; i < ans.length && indx < a.length; i++){
            if(i % 2 == 0){
                ans[i] = a[indx++];
            }else{
                ans[i] = 1;
            }
        }

        System.out.println(ans.length);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
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