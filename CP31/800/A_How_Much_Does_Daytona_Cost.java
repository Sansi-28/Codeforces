import java.util.*;

public class A_How_Much_Does_Daytona_Cost{
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

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(a[i]);
        }

        if(set.contains(k)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

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