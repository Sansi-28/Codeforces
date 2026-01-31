import java.util.*;

public class A_Grasshopper_on_a_Line {
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
        // example usage:

        int n = in.nextInt();

        int k = in.nextInt();

        if(n == 0){
            System.out.println(0);
            return;
        }

        if(n % k != 0){
            System.out.println(1);
            System.out.println(n);
        }else{
            System.out.println(2);
            System.out.println(n-1 + " " + 1);
        }
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