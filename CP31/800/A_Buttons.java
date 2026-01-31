import java.util.*;

public class A_Buttons {
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

        int a = in.nextInt();

        int c = in.nextInt();

        int b = in.nextInt();

        int max = (a < c) ? c : a;

        if(Math.abs(a-c) < b){
            if(b - Math.abs(a-c) % 2 == 0){
                System.out.println("Second");
            }else {
                System.out.println("First");
            }
        }else{
            if(a > c){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
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