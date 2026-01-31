import java.util.Scanner;

public class C {
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
        long sum = 0;

        while(n != 0){
            int d = (int)((double)Math.log(n) / (double)Math.log(3));

            long x = (int)(n/Math.pow(3, d));

            long c = (int)(Math.pow(3, d + 1) + d*Math.pow(3, d-1)) * x;



            sum = sum + c;

            n -= Math.pow(3, d)*x;
        }

        System.out.println(sum);
        //3x+1+x⋅3x−1
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
