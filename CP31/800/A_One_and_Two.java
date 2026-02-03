import java.util.*;

public class A_One_and_Two {
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

        int [] prefix = new int [n];

        int [] suffix = new int [n];

        int sumPrefix = 1;
        int sumSuffix = 1;

        for(int i = 0; i < n; i++){
            sumPrefix = sumPrefix * a[i];
            prefix[i] = sumPrefix;
            
        }

        for(int i = n-1; i >= 0; i--){
            sumSuffix = sumSuffix * a[i];
            suffix[i] = sumSuffix;
        }



        for(int i = 0; i < n-1; i++){
            if(prefix[i] == suffix[i+1]){
                System.out.println(i+1);
                return;
            }
        }

        System.out.println(-1);

        
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